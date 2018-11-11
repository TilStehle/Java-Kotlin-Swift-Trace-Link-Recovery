package de.unihamburg.swk.traceabilityrecovery;

import org.apache.commons.io.FilenameUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.All;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tilmann Stehle on 28.11.2017.
 */
public class Language {

    public static final Language SWIFT = new Language("swift");
    public static final Language CSHARP = new Language("cs");
    public static final Language JAVA = new Language("java");
    public static final Language JAVASCRIPT = new Language("js");
    public static final Language KOTLIN = new Language("kt");
    public static final List<Language> ALL_Languages = new ArrayList<>();
    static
    {
        ALL_Languages.add(CSHARP);
        ALL_Languages.add(JAVA);
        ALL_Languages.add(JAVASCRIPT);
        ALL_Languages.add(KOTLIN);
        ALL_Languages.add(SWIFT);
    }
    private String fileExtension;

    Language(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public static Language getLanguageForPath(String path) {
        String extension =  FilenameUtils.getExtension(path);
        for (Language language : ALL_Languages) {
            if(language.getFileExtension().equals(extension))
            {
                return language;
            }
        }
        throw new IllegalArgumentException("There is no Language registered for the given file path: "+path);

    }
    public static List<Language> getOtherLanguagesExcept(Language except)
    {
        List<Language> result = new ArrayList<>();
        for (Language language : ALL_Languages) {
            if(! (language == except))
            {
                result.add(language);
            }
        }
        return result;
    }


    public static void addLanguage(Language additionalLanguage)
    {
        ALL_Languages.add(additionalLanguage);
    }
}
