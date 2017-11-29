package de.unihamburg.swk.traceabilityrecovery;

/**
 * Created by Tilmann Stehle on 28.11.2017.
 */
public enum Language {
        SWIFT("swift"),CSHARP("cs"), JAVA("java");

    private String fileExtension;

    Language(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getFileExtension() {
        return fileExtension;
    }
}
