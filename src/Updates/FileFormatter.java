/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Updates;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Kyle
 */
public class FileFormatter {

    private static final String resourceDirectory = "Resources";
    private static final String driverDirectory = resourceDirectory + "\\Drivers";
    private static final String iconDirectory = resourceDirectory + "\\Icons";
    private static final String pictureDirectory = resourceDirectory + "\\Pictures";
    private static final String propertyDirectory = resourceDirectory + "\\Properties";
    private static final String versionDirectory = resourceDirectory + "\\Versioning";

    private static final String chromeDriver = driverDirectory + "\\chromedriver.exe";
    private static final String geckoDriver = driverDirectory + "\\geckodriver.exe";

    private static final String icon = iconDirectory + "\\icon.png";
    private static final String settingIcon = iconDirectory + "\\settingIcon.png";
    private static final String switcherOff = iconDirectory + "\\switcher_off.png";
    private static final String switcherOn = iconDirectory + "\\switcher_on.png";

    private static final String logos = pictureDirectory + "\\Logos.png";
    private static final String teamLogos = pictureDirectory + "\\TeamLogos.png";

    private static final String links = propertyDirectory + "\\Links.db";

    private static final String versions = versionDirectory + "\\Versions.txt";
    private static final String jarDownloader = "JARDownloader.jar";

    private Downloader downloader;

    public FileFormatter() {
        downloader = new Downloader();
    }

    public void checkForFiles() {
        checkResourceDirectory();
        checkDrivers();
        checkIcons();
        checkPictures();
        checkProperties();
        checkVersioning();
    }

    private void addToList() {

    }

    private void checkResourceDirectory() {
        File directory = new File(resourceDirectory);
        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("made Resource directory");
        }

        directory = new File(driverDirectory);
        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("made Driver Directory");
        }

        directory = new File(iconDirectory);
        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("Made Icon Directory");
        }

        directory = new File(pictureDirectory);
        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("Made Picture Directory");
        }

        directory = new File(propertyDirectory);
        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("Made Property Directory");
        }

        directory = new File(versionDirectory);
        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("Made Version Directory");
        }
    }

    private void checkDrivers() {
        File directory = new File(chromeDriver);
        if (!directory.exists()) {
            File temp = new File("chromedriver.exe");
            if (temp.exists()) {
                temp.renameTo(new File(chromeDriver));
            } else {
                downloader.downloadFile(Downloader.CHROMEDRIVER, directory);
            }
        }

        directory = new File(geckoDriver);
        if (!directory.exists()) {
            File temp = new File("geckodriver.exe");
            if (temp.exists()) {
                temp.renameTo(new File(geckoDriver));
            } else {
                downloader.downloadFile(Downloader.GECKODRIVER, directory);
            }
        }
    }

    private void checkIcons() {
        File directory = new File(icon);
        if (!directory.exists()) {
            File temp = new File("icon.png");
            if (temp.exists()) {
                temp.renameTo(new File(icon));
            } else {
                downloader.downloadFile(Downloader.ICON, directory);
            }
        }

        directory = new File(settingIcon);
        if (!directory.exists()) {
            File temp = new File("settingIcon.png");
            if (temp.exists()) {
                temp.renameTo(new File(settingIcon));
            } else {
                downloader.downloadFile(Downloader.SETTINGICON, directory);
            }
        }

        directory = new File(switcherOff);
        if (!directory.exists()) {
            File temp = new File("switcher_off.png");
            if (temp.exists()) {
                temp.renameTo(new File(switcherOff));
            } else {
                downloader.downloadFile(Downloader.SWITCHEROFF, directory);
            }
        }

        directory = new File(switcherOn);
        if (!directory.exists()) {
            File temp = new File("switcher_on.png");
            if (temp.exists()) {
                temp.renameTo(new File(switcherOn));
            } else {
                downloader.downloadFile(Downloader.SWITCHERON, directory);
            }
        }
    }

    private void checkPictures() {
        File directory = new File(logos);
        if (!directory.exists()) {
            File temp = new File("logos.png");
            if (temp.exists()) {
                temp.renameTo(new File(logos));
            } else {
                downloader.downloadFile(Downloader.LOGOS, directory);
            }
        }

        directory = new File(teamLogos);
        if (!directory.exists()) {
            File temp = new File("TeamLogos.png");
            if (temp.exists()) {
                temp.renameTo(new File(teamLogos));
            } else {
                downloader.downloadFile(Downloader.TEAMLOGOS, directory);
            }
        }
    }

    private void checkProperties() {
        File directory = new File(links);
        if (!directory.exists()) {
            File temp = new File("Links.db");
            if (temp.exists()) {
                temp.renameTo(new File(links));
            }
        }
    }

    private void checkVersioning() {
        File directory = new File(versions);
        File oldVersions = new File("Resources\\Versioning\\oldVersions.txt");
        boolean renamed = false;
        if (directory.exists()) {
            try {
                directory.renameTo(oldVersions);
                renamed = true;
            } catch (Exception e) {
                System.out.println("Cannot rename file");
                System.exit(0);
            }
        }

        try {
            if (renamed) {
                oldVersions.delete();
            }
            downloader.downloadFile(Downloader.VERSIONS, new File("Resources\\Versioning\\Versions.txt"));

        } catch (Exception e) {
            System.out.println("Couldn't Download File");
            if (renamed) {
                directory.renameTo(new File("Resources\\Versioning\\Versions.txt"));
            }
            System.exit(0);
        }

        directory = new File(jarDownloader);
        if (!directory.exists()) {
            downloader.downloadFile(Downloader.UPDATERJAR, directory);
        }
    }

}
