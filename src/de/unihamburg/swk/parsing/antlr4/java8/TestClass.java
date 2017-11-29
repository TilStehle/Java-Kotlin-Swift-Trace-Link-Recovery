package de.unihamburg.swk.parsing.antlr4.java8;//package de.icnh.mellow.activities.mainscreen.content;
//
//import android.animation.Animator;
//import android.animation.ArgbEvaluator;
//import android.animation.ValueAnimator;
//import android.app.Fragment;
//import android.app.FragmentTransaction;
//import android.bluetooth.BluetoothDevice;
//import android.bluetooth.BluetoothGatt;
//import android.graphics.PorterDuff;
//import android.graphics.drawable.ColorDrawable;
//import android.location.Location;
//import android.os.Bundle;
//import android.os.Parcelable;
//import android.support.annotation.ColorRes;
//import android.support.annotation.Nullable;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentPagerAdapter;
//import android.support.v4.content.ContextCompat;
//import android.support.v4.view.ViewPager;
//import android.support.v4.view.animation.LinearOutSlowInInterpolator;
//import android.support.v4.widget.Space;
//import android.view.Gravity;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.FrameLayout;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.RelativeLayout;
//import android.widget.ScrollView;
//import android.widget.TextView;
//
//import com.google.android.gms.maps.CameraUpdateFactory;
//import com.google.android.gms.maps.GoogleMap;
//import com.google.android.gms.maps.MapFragment;
//import com.google.android.gms.maps.OnMapReadyCallback;
//import com.google.android.gms.maps.model.LatLng;
//import com.google.android.gms.maps.model.LatLngBounds;
//import com.google.android.gms.maps.model.MapStyleOptions;
//
//import java.util.ArrayList;
//
//import de.icnh.mellow.R;
//import de.icnh.mellow.activities.mainscreen.MainScreenActivity;
//import de.icnh.mellow.activities.mainscreen.content.battery.BatteryFragment;
//import de.icnh.mellow.activities.mainscreen.content.battery.DriveBatteryFragment;
//import de.icnh.mellow.activities.mainscreen.content.battery.RemoteBatteryFragment;
//import de.icnh.mellow.domainmodel.Board;
//import de.icnh.mellow.repositories.MetricDataRepository;
//import de.icnh.mellow.repositories.UserRepository;
//import de.icnh.mellow.services.infrastructure.BluetoothCallback;
//import de.icnh.mellow.services.infrastructure.BluetoothService;
//import de.icnh.mellow.services.infrastructure.MetricKeyUtil;
//import de.icnh.mellow.services.infrastructure.SimpleBluetoothCallback;
//import de.icnh.mellow.views.AccelerationView;
//import de.icnh.mellow.views.CustomButton;
//import de.icnh.mellow.views.MellowMapCircleView;
//import de.icnh.mellow.views.MonitoringTotalValueTextView;
//import de.icnh.mellow.views.RidingModeCoordinatorLayout;
//import de.icnh.mellow.views.TopSpeedView;
//import rx.Subscription;
//
///**
// * A simple {@link Fragment} subclass.
// */
//public class MonitoringFragment extends Fragment {
//
//    private static final String TAG = MonitoringFragment.class.getSimpleName();
//    // Battery fragments
//    private static final int BATTERY_FRAGMENT_DRIVE = 0;
//    private static final int BATTERY_FRAGMENT_REMOTE = 1;
//    // Drive modes
//    private static final int MODE_ROOKIE = 0;
//    private static final int MODE_ECO = 1;
//    private static final int MODE_PRO = 2;
//    private static final int MODE_ENDLESS = 3;
//    private static int currentMode = MODE_ROOKIE;
//
//    //private int driveBatteryLastSOC;
//    private static int lastBatteryFragment = -1;
//    private static GoogleMap map;
//    private final float KM_TO_MILES_CONVERSION_FACTOR = 0.62f;
//    private final ArrayList<ImageView> navigationDots = new ArrayList<>();
//    private Subscription totalDistanceSubscription;
//    private Subscription tripDistanceSubscription;
//    private Subscription driveBatterySubscription;
//    private int distanceTotal;
//    private int distanceTrip;
//    private int driveBatterySOC;
//    private int topSpeed;
//    @ColorRes
//    private int backgroundColor = 0;
//    @ColorRes
//    private int highlightColor = 0;
//    private float mapCircleRadius = 0.5f;
//
//    private ViewPager viewPager;
//    private FragmentPagerAdapter adapterViewPager;
//    private LinearLayout dotsContainer;
//    private ScrollView backgroundView;
//    private RidingModeCoordinatorLayout modeContainerView;
//    private ImageView leftChevron;
//    private ImageView rightChevron;
//    private TextView accelerationText;
//    private TextView topSpeedText;
//    private MellowMapCircleView mapCircleView;
//    private AccelerationView accelerationView;
//    private TopSpeedView topSpeedView;
//    private MonitoringTotalValueTextView totalValueTotal;
//    private MonitoringTotalValueTextView totalValueToday;
//    private MonitoringTotalValueTextView totalValueSpeed;
//
//    private MapManager mapManager = new MapManager();
//    private Location currentLocation;
//    private ArgbEvaluator argbEvaluator;
//    private RelativeLayout mapOverlayContainer;
//    private FrameLayout mapOverlayBackground;
//    private TextView mapOverlayText;
//    private CustomButton mapOverlayButton;
//    private MapFragment mMapFragment = MapFragment.newInstance();
//
//    // Bluetooth
//    private ImageView bluetoothIcon;
//    private BluetoothService bluetoothService;
//    private BluetoothCallback bluetoothCallback;
//
//    private Board board;
//
//    public MonitoringFragment() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Selects which fragment should be show in the battery view pager.
//     *
//     * @param frag The battery fragment to show. Should be MonitoringFragment.BATTERY_FRAGMENT_DRIVE
//     *             or MonitoringFragment.BATTERY_FRAGMENT_REMOTE
//     */
//    public void showFragment(int frag) {
//        viewPager.setCurrentItem(frag);
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        final MainScreenActivity activity = (MainScreenActivity) getActivity();
//
//        // Inflate the layout for this fragment
//        View inflate = inflater.inflate(R.layout.fragment_monitoring, container, false);
//        argbEvaluator = new ArgbEvaluator();
//
//        // get Board
//        board = UserRepository.getInstance().getUser().getCurrentBoard();
//
//        //Find views
//        modeContainerView = (RidingModeCoordinatorLayout) inflate.findViewById(R.id.riding_mode_container);
//        dotsContainer = (LinearLayout) inflate.findViewById(R.id.view_pager_navigation_dots);
//        backgroundView = (ScrollView) inflate.findViewById(R.id.monitoring_background);
//        accelerationView = (AccelerationView) inflate.findViewById(R.id.acceleration_view);
//        accelerationText = (TextView) inflate.findViewById(R.id.acceleration_text);
//        topSpeedView = (TopSpeedView) inflate.findViewById(R.id.top_speed_view);
//        topSpeedText = (TextView) inflate.findViewById(R.id.top_speed_text);
//        TextView topSpeedUnitText = (TextView) inflate.findViewById(R.id.top_speed_unit_text);
//        mapCircleView = (MellowMapCircleView) inflate.findViewById(R.id.monitoring_map_circle);
//        mapOverlayContainer = (RelativeLayout) inflate.findViewById(R.id.map_overlay_container);
//        mapOverlayBackground = (FrameLayout) inflate.findViewById(R.id.map_overlay_background);
//        mapOverlayText = (TextView) inflate.findViewById(R.id.map_overlay_text);
//        mapOverlayButton = (CustomButton) inflate.findViewById(R.id.location_setting_button);
//        viewPager = (ViewPager) inflate.findViewById(R.id.status_view_pager);
//        leftChevron = (ImageView) inflate.findViewById(R.id.riding_mode_go_left);
//        rightChevron = (ImageView) inflate.findViewById(R.id.riding_mode_go_right);
//        totalValueTotal = (MonitoringTotalValueTextView) inflate.findViewById(R.id.total_value_total);
//        totalValueToday = (MonitoringTotalValueTextView) inflate.findViewById(R.id.total_value_today);
//        totalValueSpeed = (MonitoringTotalValueTextView) inflate.findViewById(R.id.total_value_speed);
//
//        // Update bluetooth icon depending on connection status (callback set/removed in onResume/onPause)
//        bluetoothIcon = (ImageView) inflate.findViewById(R.id.bluetooth_icon);
//        bluetoothService = BluetoothService.getInstance();
//        bluetoothCallback = new SimpleBluetoothCallback() {
//            @Override
//            public void onDeviceConnected(BluetoothGatt gatt, BluetoothDevice device) {
//                super.onDeviceConnected(gatt, device);
//                getActivity().runOnUiThread(() -> bluetoothIcon.setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.ic_bluetooth_connected)));
//            }
//
//            @Override
//            public void onDeviceDisconnected(BluetoothGatt gatt, BluetoothDevice device) {
//                super.onDeviceDisconnected(gatt, device);
//                getActivity().runOnUiThread(() -> bluetoothIcon.setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.ic_bluetooth_disconnected)));
//            }
//        };
//
//        int animationDuration = 500;
//        accelerationView.setDuration(animationDuration);
//        topSpeedView.setDuration(animationDuration);
//
//        // get selected mode
//        String mode = board.getRidingMode();
//        switch (mode) {
//            case "ROOKIE":
//                currentMode = MODE_ROOKIE;
//                break;
//            case "ECO":
//                currentMode = MODE_ECO;
//                break;
//            case "PRO":
//                currentMode = MODE_PRO;
//                break;
//            case "ENDLESS":
//                currentMode = MODE_ENDLESS;
//        }
//
//        modeContainerView.setCurrentChild(currentMode);
//
//        //Update top speed unit
//        boolean isMetric = UserRepository.getInstance().getUser().getAppSettings().getUnits().equals("metric");
//        int unitResource = isMetric ? R.string.monitoring_speed_unit_only_metric : R.string.monitoring_speed_unit_only_imperial;
//        topSpeedUnitText.setText(unitResource);
//
//        //
//        initViewPager(activity);
//        initViewPagerDots(activity);
//        initGoogleMaps();
//        initModeSelectionView();
//
//        return inflate;
//    }
//
//    private void initViewPager(MainScreenActivity activity) {
//        adapterViewPager = new StatusPagerAdapter(activity.getSupportFragmentManager());
//        viewPager.setAdapter(adapterViewPager);
//        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//
//            // This method will be invoked when a new page becomes selected.
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//                switch (position) {
//                    case BATTERY_FRAGMENT_DRIVE:
//                        //titleText.setText("YOUR BOARD");
//                        break;
//                    case BATTERY_FRAGMENT_REMOTE:
//                        //titleText.setText("MELLOW MODES");
//                        break;
//                    default:
//                        break;
//                }
//            }
//
//            // This method will be invoked when the current page is scrolled
//            @Override
//            public void onPageSelected(int position) {
//                lastBatteryFragment = position;
//                updateSelectedNavDot(position);
//            }
//
//            // Called when the scroll state changes:
//            // SCROLL_STATE_IDLE, SCROLL_STATE_DRAGGING, SCROLL_STATE_SETTLING
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });
//
//        //Show this fragment
//        int extra = activity.getIntent().getIntExtra("show_fragment", -1);
//        if (extra != -1) {
//            showFragment(extra);
//        } else {
//            restoreBatteryFragment();
//        }
//    }
//
//    private void updateSelectedNavDot(int position) {
//        for (int i = 0; i < navigationDots.size(); i++) {
//            ImageView dot = navigationDots.get(i);
//            if (i == position) {
//                dot.setColorFilter(ContextCompat.getColor(getActivity(), highlightColor));
//            } else {
//                dot.setColorFilter(ContextCompat.getColor(getActivity(), R.color.monitoring_battery_status_nav_default));
//            }
//        }
//    }
//
//    private void initViewPagerDots(MainScreenActivity activity) {
//        dotsContainer.setOrientation(LinearLayout.HORIZONTAL);
//        dotsContainer.setGravity(Gravity.CENTER);
//        navigationDots.clear();
//
//        for (int i = 0; i < adapterViewPager.getCount(); i++) {
//            //Create Space between the dots
//            if (i > 0) {
//                Space space = new Space(activity);
//                space.setLayoutParams(new ViewGroup.LayoutParams(
//                        (int) getResources().getDimension(R.dimen.space_d_blue_16dp),
//                        ViewGroup.LayoutParams.MATCH_PARENT
//                ));
//                dotsContainer.addView(space);
//            }
//            //New dot
//            ImageView dot = new ImageView(activity);
//            dot.setLayoutParams(new ViewGroup.LayoutParams(
//                    ViewGroup.LayoutParams.WRAP_CONTENT,
//                    ViewGroup.LayoutParams.WRAP_CONTENT
//            ));
//            dot.setImageDrawable(ContextCompat.getDrawable(activity, R.drawable.icon_pagination_black_12dp));
//            dotsContainer.addView(dot);
//            navigationDots.add(dot);
//        }
//    }
//
//    private void initGoogleMaps() {
//        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
//        fragmentTransaction.add(R.id.map_container, mMapFragment);
//        fragmentTransaction.attach(mMapFragment);
//        fragmentTransaction.commit();
//
//        mMapFragment.getMapAsync(mapManager);
//    }
//
//    private void initModeSelectionView() {
//        modeContainerView.setOnChildSelectedListener(new RidingModeCoordinatorLayout.OnChildSelectedListener() {
//            @Override
//            protected void childSelected(View view, int index) {
//                //Set left chevron color
//                if (index == 0) {
//                    leftChevron.getBackground().setColorFilter(ContextCompat.getColor(getActivity(), R.color.button_small_disabled), PorterDuff.Mode.SRC_IN);
//                } else {
//                    leftChevron.getBackground().clearColorFilter();
//                }
//                //Set right chevron color
//                if (index == modeContainerView.getChildCount() - 1) {
//                    rightChevron.getBackground().setColorFilter(ContextCompat.getColor(getActivity(), R.color.button_small_disabled), PorterDuff.Mode.SRC_IN);
//                } else {
//                    rightChevron.getBackground().clearColorFilter();
//                }
//
//                if (currentMode != index) {
//                    //Set new selected mode
//                    currentMode = index;
//                    //Update background color and highlight color
//                    updateBackgroundAndHighlightColor();
//                    //TODO Notify drive about mode change
//                    bluetoothService.changeDrivingMode(currentMode);
//                }
//            }
//        });
//
//        leftChevron.setOnClickListener((View v) -> modeContainerView.selectLeft());
//        rightChevron.setOnClickListener((View v) -> modeContainerView.selectRight());
//    }
//
//    private void updateBackgroundAndHighlightColor() {
//        updateBackgroundAndHighlightColor(true);
//    }
//
//    private void updateBackgroundAndHighlightColor(boolean animate) {
//        //Get new backgroundView and highlight color
//        switch (currentMode) {
//            case MODE_ROOKIE:
//                backgroundColor = R.color.monitoring_background_rookie;
//                highlightColor = R.color.monitoring_highlight_rookie;
//                board.setRidingMode("ROOKIE");
//                break;
//            case MODE_ECO:
//                backgroundColor = R.color.monitoring_background_eco;
//                highlightColor = R.color.monitoring_highlight_eco;
//                board.setRidingMode("ECO");
//                break;
//            case MODE_PRO:
//                backgroundColor = R.color.monitoring_background_pro;
//                highlightColor = R.color.monitoring_highlight_pro;
//                board.setRidingMode("PRO");
//                break;
//            case MODE_ENDLESS:
//                backgroundColor = R.color.monitoring_background_endless;
//                highlightColor = R.color.monitoring_highlight_endless;
//                board.setRidingMode("ENDLESS");
//                break;
//        }
//
//        //Battery fragment
//        for (int i = 0; i < adapterViewPager.getCount(); i++) {
//            android.support.v4.app.Fragment frag = adapterViewPager.getItem(i);
//            if (frag instanceof BatteryFragment) {
//                BatteryFragment batteryFragment = (BatteryFragment) frag;
//                batteryFragment.setHighlightColor(highlightColor);
//            }
//        }
//
//        //Nav Dots
//        updateSelectedNavDot(viewPager.getCurrentItem());
//
//        //Background color
//        final int finalBgColor = ContextCompat.getColor(getActivity(), backgroundColor);
//
//        if (animate) {
//            final int oldBgColor = ((ColorDrawable) backgroundView.getBackground()).getColor();
//            ValueAnimator animator = ValueAnimator.ofFloat(0, 1);
//            animator.addUpdateListener((ValueAnimator valueAnimator) -> {
//                float value = (float) valueAnimator.getAnimatedValue();
//                int newBg = (int) argbEvaluator.evaluate(value, oldBgColor, finalBgColor);
//                backgroundView.setBackgroundColor(newBg);
//                mapOverlayBackground.setBackgroundColor(newBg);
//            });
//            animator.addListener(new Animator.AnimatorListener() {
//                @Override
//                public void onAnimationStart(Animator animator) {
//
//                }
//
//                @Override
//                public void onAnimationEnd(Animator animator) {
//                    updateAccelerationView();
//                    updateTopSpeedView();
//                    updateMapCircleView();
//                }
//
//                @Override
//                public void onAnimationCancel(Animator animator) {
//
//                }
//
//                @Override
//                public void onAnimationRepeat(Animator animator) {
//
//                }
//            });
//            animator.start();
//        } else {
//            backgroundView.setBackgroundColor(finalBgColor);
//            mapOverlayBackground.setBackgroundColor(finalBgColor);
//        }
//    }
//
//    private void updateMapCircleView() {
//        switch (currentMode) {
//            case MODE_ROOKIE:
//                mapCircleRadius = 0.5f;
//                break;
//            case MODE_ECO:
//                mapCircleRadius = 1f;
//                break;
//            case MODE_PRO:
//                mapCircleRadius = 0.3f;
//                break;
//            case MODE_ENDLESS:
//                mapCircleRadius = 1f;
//                break;
//        }
//        int mapCircleValue = estimateRangeForCurrentMode();
//        mapCircleView.setHighlightColor(highlightColor);
//        mapCircleView.moveToRadius(mapCircleRadius);
//        mapCircleView.countToNumber(mapCircleValue);
//        if (mapManager != null) {
//            mapManager.setLocation(currentLocation, mapCircleValue);
//        }
//    }
//
//    private int estimateRangeForCurrentMode() {
//        int batteryConsumptionRate = getBatteryConsumptionRateForCurrentMode();
//        int batteryFullyChargedEnergyContent = 98;
//        float estimatedRangeInKm = driveBatterySOC / 100f * batteryFullyChargedEnergyContent / batteryConsumptionRate;
//        if (UserRepository.getInstance().getUser().getAppSettings().getUnits().equals("metric")) {
//            return Math.round(estimatedRangeInKm);
//        } else {
//            return Math.round(estimatedRangeInKm * KM_TO_MILES_CONVERSION_FACTOR);
//        }
//    }
//
//    private int getBatteryConsumptionRateForCurrentMode() {
//        switch (currentMode) {
//            case MODE_ROOKIE:
//                return 10;
//            case MODE_ECO:
//                return 7;
//            case MODE_PRO:
//                return 16;
//            case MODE_ENDLESS:
//                return 5;
//            default:
//                return -1; // TODO better solution? (should never be called anyway)
//        }
//    }
//
//    @Override
//    public void onPause() {
//        super.onPause();
//        bluetoothService.removeBluetoothServiceCallback(bluetoothCallback);
//        terminateMetricSubscriptions();
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        bluetoothService.addBluetoothServiceCallback(bluetoothCallback);
//        restoreBatteryFragment();
//        initializeMetricSubscriptions();
//    }
//
//    @Override
//    public void onViewCreated(View view, Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        //Restore last mode selection
//        modeContainerView.setActiveChild(currentMode);
//        updateBackgroundAndHighlightColor(false);
//        updateAccelerationView();
//        updateTopSpeedView();
//        updateMapCircleView();
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        if (adapterViewPager != null) {
//            for (int i = 0; i < adapterViewPager.getCount(); i++) {
//                adapterViewPager.destroyItem(null, i, adapterViewPager.getItem(i));
//            }
//            adapterViewPager.finishUpdate(null);
//        }
//
//        if (!getActivity().isDestroyed()) {
//            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
//            fragmentTransaction.detach(mMapFragment);
//            fragmentTransaction.commit();
//        }
//    }
//
//    private void restoreBatteryFragment() {
//        if (lastBatteryFragment >= 0) {
//            switch (lastBatteryFragment) {
//                case (BATTERY_FRAGMENT_DRIVE):
//                    showFragment(BATTERY_FRAGMENT_DRIVE);
//                    break;
//                case (BATTERY_FRAGMENT_REMOTE):
//                    showFragment(BATTERY_FRAGMENT_REMOTE);
//                    break;
//            }
//            lastBatteryFragment = -1;
//        }
//    }
//
//    private void initializeMetricSubscriptions() {
//        MetricDataRepository metricDataRepository = MetricDataRepository.getInstance();
//        totalDistanceSubscription = metricDataRepository.getSingleMetricDataStream(MetricKeyUtil.KM_COUNTER_TOTAL).distinctUntilChanged().subscribe(this::updateTotalDistance);
//        tripDistanceSubscription = metricDataRepository.getSingleMetricDataStream(MetricKeyUtil.KM_COUNTER_TRIP).distinctUntilChanged().subscribe(this::updateTripDistance);
//        driveBatterySubscription = metricDataRepository.getSingleMetricDataStream(MetricKeyUtil.SOC_BATTERY).distinctUntilChanged().subscribe(this::updateDriveBatterySOC);
//    }
//
//    private void updateTotalDistance(String totalDistance) {
//        distanceTotal = (totalDistance == null ? 0 : Integer.valueOf(totalDistance));
//        getActivity().runOnUiThread(() -> setTotalDistanceValue(distanceTotal));
//    }
//
//    private void setTotalDistanceValue(int value) {
//        if (isAdded()) {
//            if (UserRepository.getInstance().getUser().getAppSettings().getUnits().equals("metric")) {
//                totalValueTotal.setText(getResources().getString(R.string.monitoring_range_unit_metric, value));
//            } else {
//                totalValueTotal.setText(getResources().getString(R.string.monitoring_range_unit_imperial, (int) (value * KM_TO_MILES_CONVERSION_FACTOR)));
//            }
//        }
//    }
//
//    private void updateTripDistance(String tripDistance) {
//        distanceTrip = (tripDistance == null ? 0 : Integer.valueOf(tripDistance));
//        getActivity().runOnUiThread(() -> setTripDistanceValue(distanceTrip));
//    }
//
//    private void setTripDistanceValue(int value) {
//        if (isAdded()) {
//            if (UserRepository.getInstance().getUser().getAppSettings().getUnits().equals("metric")) {
//                totalValueToday.setText(getResources().getString(R.string.monitoring_range_unit_metric, value));
//            } else {
//                totalValueToday.setText(getResources().getString(R.string.monitoring_range_unit_imperial, (int) (value * KM_TO_MILES_CONVERSION_FACTOR)));
//            }
//        }
//    }
//
//    private void updateDriveBatterySOC(String driveBatterySOC) {
//        this.driveBatterySOC = (driveBatterySOC == null ? 0 : Integer.valueOf(driveBatterySOC));
//    }
//
//    private void updatePersonalTopSpeed() {
//        // TODO implement
//        //topSpeed =
//        getActivity().runOnUiThread(() -> setTopSpeedValue(topSpeed));
//    }
//
//    public void setTopSpeedValue(int value) {
//        if (isAdded()) {
//            if (UserRepository.getInstance().getUser().getAppSettings().getUnits().equals("metric")) {
//                totalValueSpeed.setText(getResources().getString(R.string.monitoring_speed_unit_metric, value));
//            } else {
//                totalValueSpeed.setText(getResources().getString(R.string.monitoring_speed_unit_imperial, (int) (value * KM_TO_MILES_CONVERSION_FACTOR)));
//            }
//        }
//    }
//
//    private void updateAccelerationView() {
//        float acceleration = 0;
//        String aText = (String) accelerationText.getText();
//
//        int oldValue = 0;
//        if (aText != null && !aText.isEmpty()) {
//            oldValue = Integer.valueOf(aText);
//        }
//        int newValue = 0;
//        if (currentMode == MODE_ROOKIE) {
//            acceleration = 0.1f;
//            newValue = 10;
//        } else if (currentMode == MODE_ECO) {
//            acceleration = 0.3f;
//            newValue = 30;
//        } else if (currentMode == MODE_PRO) {
//            acceleration = 0.95f;
//            newValue = 100;
//        } else if (currentMode == MODE_ENDLESS) {
//            acceleration = 0.15f;
//            newValue = 15;
//        }
//        accelerationView.animateTo(acceleration);
//        accelerationView.setHighlightColor(highlightColor);
//
//        ValueAnimator animator = ValueAnimator.ofFloat(0, 1);
//        final int newText = newValue;
//        final int oldText = oldValue;
//        animator.addUpdateListener((ValueAnimator valueAnimator) -> {
//            float f = (float) valueAnimator.getAnimatedValue();
//            int i = (int) (oldText + (newText - oldText) * f);
//            String text = String.valueOf(i);
//            accelerationText.setText(text);
//        });
//        animator.setInterpolator(new LinearOutSlowInInterpolator());
//        animator.start();
//    }
//
//    private void updateTopSpeedView() {
//        String aText = (String) topSpeedText.getText();
//
//        int oldValue = 0;
//        int newValue = 0;
//        if (aText != null && !aText.isEmpty()) {
//            oldValue = Integer.valueOf(aText);
//        }
//
//        float speedometerNeedlePosition = 0; // between 0 (no speed) - 1 (full speed)
//        boolean useImperialUnits = ("imperial").equals(UserRepository.getInstance().getUser().getAppSettings().getUnits());
//
//        if (currentMode == MODE_ROOKIE) {
//            speedometerNeedlePosition = 0.37f;
//            newValue = useImperialUnits ? 9 : 15;
//        } else if (currentMode == MODE_ECO) {
//            speedometerNeedlePosition = 0.65f;
//            newValue = useImperialUnits ? 15 : 25;
//        } else if (currentMode == MODE_PRO) {
//            speedometerNeedlePosition = 1.0f;
//            newValue = useImperialUnits ? 25 : 40;
//        } else if (currentMode == MODE_ENDLESS) {
//            speedometerNeedlePosition = 0.75f;
//            newValue = useImperialUnits ? 18 : 30;
//        }
//        topSpeedView.animateTo(speedometerNeedlePosition);
//        topSpeedView.setHighlightColor(highlightColor);
//
//        ValueAnimator animator = ValueAnimator.ofFloat(0, 1);
//        final int newText = newValue;
//        final int oldText = oldValue;
//        animator.addUpdateListener((ValueAnimator valueAnimator) -> {
//            float f = (float) valueAnimator.getAnimatedValue();
//            int i = (int) (oldText + (newText - oldText) * f);
//            String text = String.valueOf(i);
//            topSpeedText.setText(text);
//        });
//        animator.setInterpolator(new LinearOutSlowInInterpolator());
//        animator.start();
//    }
//
//    private void terminateMetricSubscriptions() {
//        totalDistanceSubscription.unsubscribe();
//        tripDistanceSubscription.unsubscribe();
//        driveBatterySubscription.unsubscribe();
//    }
//
//    /**
//     * Hides the map overlay and show the circle radius info instead.
//     */
//    public void hideMapOverlay() {
//        mapOverlayContainer.setVisibility(View.GONE);
//        mapCircleView.setVisibility(View.VISIBLE);
//    }
//
//    /**
//     * Shows the map overlay and hides the circle radius info.
//     */
//    public void showMapOverlay() {
//        mapOverlayBackground.setBackgroundColor(ContextCompat.getColor(getActivity(), backgroundColor));
//        mapOverlayBackground.setAlpha(0.6f);//TODO magic number
//        mapOverlayContainer.setVisibility(View.VISIBLE);
//        mapCircleView.setVisibility(View.GONE);
//    }
//
//    /**
//     * Sets the text that should be shown on the map overlay button.
//     *
//     * @param string String that should be shown on the map overlay button.
//     */
//    public void setMapOverlayButtonText(String string) {
//        if (string.equals("")) {
//            mapOverlayButton.setVisibility(View.GONE);
//        } else {
//            mapOverlayButton.setText(string);
//            mapOverlayButton.setVisibility(View.VISIBLE);
//        }
//    }
//
//    /**
//     * Sets the text that should be shown in the map overlay info box.
//     *
//     * @param string Text that should be shown in the map overlay info box.
//     */
//    public void setMapOverlayInfoText(String string) {
//        mapOverlayText.setText(string);
//    }
//
//    /**
//     * Sets the location which will be the center of the mellow map.
//     *
//     * @param currentLocation The Location object which should be used
//     */
//    public void setCurrentLocation(Location currentLocation) {
//        this.currentLocation = currentLocation;
//
//        if (mapManager != null) {
//            mapManager.setLocation(currentLocation);
//        }
//    }
//
//    /**
//     * Manages the FragmentPager for the battery fragments (drive and remote battery info)
//     */
//    private class StatusPagerAdapter extends FragmentPagerAdapter {
//
//        private final int NUM_ITEMS = 2;
//        private DriveBatteryFragment driveBatteryFragment;
//        private RemoteBatteryFragment remoteBatteryFragment;
//
//        StatusPagerAdapter(FragmentManager fm) {
//            super(fm);
//        }
//
//        @Override
//        public Object instantiateItem(ViewGroup container, int position) {
//            Object obj = super.instantiateItem(container, position);
//
//            if (obj instanceof DriveBatteryFragment) {
//                driveBatteryFragment = (DriveBatteryFragment) obj;
//            } else if (obj instanceof RemoteBatteryFragment) {
//                remoteBatteryFragment = (RemoteBatteryFragment) obj;
//            }
//
//            return obj;
//        }
//
//        @Override
//        public void restoreState(Parcelable state, ClassLoader loader) {
//            super.restoreState(state, loader);
//        }
//
//        @Override
//        public android.support.v4.app.Fragment getItem(int position) {
//            switch (position) {
//                case 0:
//                    if (driveBatteryFragment == null) {
//                        driveBatteryFragment = DriveBatteryFragment.newInstance();
//                    }
//                    return driveBatteryFragment;
//                case 1:
//                    if (remoteBatteryFragment == null) {
//                        remoteBatteryFragment = RemoteBatteryFragment.newInstance();
//                    }
//                    return remoteBatteryFragment;
//                default:
//                    return null;
//            }
//        }
//
//        @Override
//        public int getCount() {
//            return NUM_ITEMS;
//        }
//    }
//
//    /**
//     * Manages the behaviour of the google map
//     */
//    private class MapManager implements OnMapReadyCallback {
//        private float lastKilometerRadius = 5f;
//        private boolean isReady = false;
//        private Location lastLocation = null;
//
//        @Override
//        public void onMapReady(GoogleMap googleMap) {
//            map = googleMap;
//            map.setMapStyle(MapStyleOptions.loadRawResourceStyle(getActivity(), R.raw.map_style));
//            map.getUiSettings().setAllGesturesEnabled(false);
//            //ready up
//            isReady = true;
//            //set location from GPS or default locations
//            setLocation(null, lastKilometerRadius);
//        }
//
//        void setLocation(@Nullable Location location) {
//            setLocation(location, lastKilometerRadius);
//        }
//
//        void setLocation(@Nullable Location location, float kilometerRadius) {
//            if (!isReady) return;
//
//            // Set location form 'location', GPS or default locations
//            LatLng latLng;
//            if (location != null) {
//                latLng = new LatLng(location.getLatitude(), location.getLongitude());
//                lastLocation = location;
//            } else if (lastLocation != null) {
//                latLng = new LatLng(lastLocation.getLatitude(), lastLocation.getLongitude());
//            } else {
//                //TODO default locations
//                latLng = new LatLng(53.5502294, 9.9772295);
//            }
//
//            // Calculate map bounds
//            float metersLatitude = (kilometerRadius * 1000) / (111111);//km
//            LatLngBounds.Builder builder = new LatLngBounds.Builder();
//            builder.include(new LatLng(latLng.latitude + metersLatitude, latLng.longitude));
//            builder.include(new LatLng(latLng.latitude - metersLatitude, latLng.longitude));
//
//            // Map zoom animation
//            map.animateCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), 0));
//            lastKilometerRadius = kilometerRadius;
//        }
//    }
//}