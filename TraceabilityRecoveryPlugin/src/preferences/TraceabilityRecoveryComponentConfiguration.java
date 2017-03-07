package preferences;

import com.intellij.util.xmlb.annotations.Tag;

/**
 * Created by Gerrit Greiert on 22.02.17.
 */
public class TraceabilityRecoveryComponentConfiguration {

    @Tag
    public String linkedImplementationPath;

    public TraceabilityRecoveryComponentConfiguration(){}

    public String getLinkedImplementationPath() {
        return linkedImplementationPath;
    }

    public void setLinkedImplementationPath(String linkedImplementationPath) {
        this.linkedImplementationPath = linkedImplementationPath;
    }
}
