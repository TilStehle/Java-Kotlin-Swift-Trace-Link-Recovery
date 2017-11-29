package preferences;

/**
 * Created by Gerrit Greiert on 13.04.17.
 */
public interface ApplyResetDelegate {

    public void apply();
    public boolean isModified();
    public void reset();
}
