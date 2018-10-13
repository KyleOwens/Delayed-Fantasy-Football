/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Updates;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Kyle
 */
public class VersionChecker {

    private static final String JARVERSION = "1.0.1";
    private static final String UPDATERVERSION = "1.0";

    private String newJarVersion;
    private String newUpdaterVersion;

    private Downloader downloader;

    public VersionChecker() {
        downloader = new Downloader();
    }

    private static final String VERSIONFILE = "Resources\\Versioning\\Versions.txt";

    public void checkForUpdates() throws FileNotFoundException, IOException {
        File versions = new File(VERSIONFILE);

        BufferedReader br = new BufferedReader(new FileReader(versions));

        String line;
        while ((line = br.readLine()) != null) {
            if (line.startsWith("Updater Version")) {
                newUpdaterVersion = line.substring(line.indexOf("=") + 2);
            }
            if (line.startsWith("Jar Version")) {
                newJarVersion = line.substring(line.indexOf("=") + 2);
            }
        }

        if (!newUpdaterVersion.equals(UPDATERVERSION)) {
            File updaterFile = new File("JARDownloader.jar");
            try {
                updaterFile.renameTo(new File("JARDownloaderOld.jar"));
            } catch (Exception e) {
                System.out.println("Could rename jardownloader");
                System.exit(0);
            }

            try {
                downloader.downloadFile(Downloader.UPDATERJAR, new File("JARDownloader.jar"));
                updaterFile.delete();
            } catch (Exception ex) {
                System.out.println("Failed to download jar");
                updaterFile.renameTo(new File("JARDownloaderOld.jar"));
                System.exit(0);
            }
        }

        if (!newJarVersion.equals(JARVERSION)) {
            Process p = Runtime.getRuntime().exec("javaw -jar JARDownloader.jar");
            System.exit(0);
        }

    }

}
