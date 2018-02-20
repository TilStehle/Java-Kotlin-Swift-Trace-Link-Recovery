package de.unihamburg.swk.traceabilityrecovery;

import org.apache.commons.io.FilenameUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tilmann Stehle on 28.11.2017.
 */
public enum Language {
    SWIFT("swift"), CSHARP("cs"), JAVA("java"), JAVASCRIPT("js"), KOTLIN("kt");

    private String fileExtension;

    Language(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public static Language getLanguageForPath(String path) {
        String extension =  FilenameUtils.getExtension(path);
        for (Language language : Language.values()) {
            if(language.getFileExtension().equals(extension))
            {
                return language;
            }
        }
        return null;

    }
    public static List<Language> getOtherLanguagesExcept(Language except)
    {
        List<Language> result = new ArrayList<>();
        for (Language language : Language.values()) {
            if(! (language == except))
            {
                result.add(language);
            }
        }
        return result;
    }
}
