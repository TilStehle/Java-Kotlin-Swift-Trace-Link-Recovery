package de.unihamburg.swk.traceabilityrecovery;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Tilmann Stehle on 19.02.2018.
 */
public class FileContentsHashComputer {
    public byte[] gethashForFileContents(String filePath) throws NoSuchAlgorithmException, IOException {
        byte[] buffer = new byte[8192];
        int count;
        MessageDigest digest = null;
        digest = MessageDigest.getInstance("SHA-256");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        while ((count = bis.read(buffer)) > 0) {
            digest.update(buffer, 0, count);
        }
        return digest.digest();
    }
}
