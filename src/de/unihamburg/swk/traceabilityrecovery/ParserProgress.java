package de.unihamburg.swk.traceabilityrecovery;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by Gerrit Greiert on 20.04.17.
 */
public class ParserProgress extends Observable{

    private boolean parsing; //indicated if parsing is in progress
    private double progress;
    private int numberOfFiles; //to parse
    private List<String> nonParsedFiles;
    private long fileParserTimeout = 20000; //seconds

    public void startParsing(int numberOfFiles){

        this.parsing = true;
        this.progress = 0d;
        this.numberOfFiles = numberOfFiles;
        this.nonParsedFiles = new ArrayList<String>();
    }

    public void fileParsed(){

        double fraction = 1d / numberOfFiles;
        progress = progress + fraction;
        setChanged();
        notifyObservers();
    }

    public void fileParseFailed(String path){

        nonParsedFiles.add(path);
        fileParsed();
    }

    public void stopParsing() {
        this.parsing = false;
        deleteObservers();
    }

    public boolean isParsing() {
        return parsing;
    }

    public double getProgress() {
        return progress;
    }

    public List<String> getNonParsedFiles() {
        return nonParsedFiles;
    }

    public long getFileParserTimeout() {
        return fileParserTimeout;
    }

    public void setFileParserTimeout(long fileParserTimeout) {
        this.fileParserTimeout = fileParserTimeout;
    }
}
