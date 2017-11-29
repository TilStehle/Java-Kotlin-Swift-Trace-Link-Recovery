package preferences;

import com.intellij.util.xmlb.annotations.Tag;

/**
 * Created by Gerrit Greiert on 22.02.17.
 */
public class TraceabilityRecoveryComponentConfiguration {

    @Tag
    public String linkedImplementationPath;

    @Tag
    public boolean useCustomConfigPath;
    @Tag
    public String customConfigPath;

    @Tag
    public long fileParserTimeout;

    public static final String INDEX_PATH_FOLDER = "/luceneIndex";
    public static final String CONFIG_PATH_FOLDER = "/recoveryConfig";

    public TraceabilityRecoveryComponentConfiguration(){
        useCustomConfigPath = false;
        fileParserTimeout=30;
    }

    public String getLinkedImplementationPath() {
        return linkedImplementationPath;
    }

    public void setLinkedImplementationPath(String linkedImplementationPath) {
        this.linkedImplementationPath = linkedImplementationPath;
    }

    public boolean isUseCustomConfigPath() {
        return useCustomConfigPath;
    }

    public void setUseCustomConfigPath(boolean useCustomConfigPath) {
        this.useCustomConfigPath = useCustomConfigPath;
    }

    public String getCustomConfigPath() {
        return customConfigPath;
    }

    public void setCustomConfigPath(String customConfigPath) {
        this.customConfigPath = customConfigPath;
    }

    public long getFileParserTimeout() {
        return fileParserTimeout;
    }

    public void setFileParserTimeout(long fileParserTimeout) {
        this.fileParserTimeout = fileParserTimeout;
    }
}
