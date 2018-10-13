/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Updates;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Kyle
 */
public class Downloader {

    public static final String CHROMEDRIVER = "https://drive.google.com/uc?export=download&id=1ytyZdGIQWeGdI5In-unhexZTDCdefGfb";
    public static final String GECKODRIVER = "https://drive.google.com/uc?export=download&id=1HIRYjN6oSJkd3ffnigyNDu8lMpxXp2ME";
    public static final String ICON = "https://drive.google.com/uc?export=download&id=19i4p4vEcnNCHjDnvBzw9Q2HH6YTLVOO4";
    public static final String SETTINGICON = "https://drive.google.com/uc?export=download&id=1C8nskyg4sNOsCc08ZgTGN4jYVuygza_M";
    public static final String SWITCHEROFF = "https://drive.google.com/uc?export=download&id=1p9V3i9RM2Iprt6AVl3vTRerqkFcT24hY";
    public static final String SWITCHERON = "https://drive.google.com/uc?export=download&id=1Erx3_DGdzhwCKY30yWPrdyIekalEVdvB";
    public static final String LOGOS = "https://drive.google.com/uc?export=download&id=1R-AM7oZ8NVsl6aZeHapfUCS7dsJDBjeg";
    public static final String TEAMLOGOS = "https://drive.google.com/uc?export=download&id=1qk_aIvX883GenZPNBoGcWxzyJR6IM-cb";
    public static final String VERSIONS = "https://drive.google.com/uc?export=download&id=1oUjnf2oU1PGJ1RjtE4r79vrt8aCLxzKB";
    public static final String UPDATERJAR = "https://drive.google.com/uc?export=download&id=1AJVXmKHK6rAw61gxWbD1L8OmTAoh3gct";
    public Downloader() {

    }

    public void downloadFile(String webLink, File file) {
        try {
            String webContentLink = webLink;
            InputStream in = new URL(webContentLink).openStream();
            FileOutputStream fos = new FileOutputStream(file);

            int length = -1;
            byte[] buffer = new byte[1024];
            while ((length = in.read(buffer)) > -1) {
                fos.write(buffer, 0, length);
            }
            fos.close();
            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
