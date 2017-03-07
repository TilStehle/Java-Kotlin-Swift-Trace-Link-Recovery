package view.resultPopup;

import de.unihamburg.masterprojekt2016.traceability.TraceabilityLink;

/**
 * Created by macbook on 24.02.17.
 */
public class TraceabilityLinkProbabilityComparator implements java.util.Comparator<TraceabilityLink> {

    @Override
    public int compare(TraceabilityLink l1, TraceabilityLink l2) {

        if (l1.getProbability() < l2.getProbability()) return 1;
        if (l1.getProbability() > l2.getProbability()) return -1;
        else return 0;
    }
}
