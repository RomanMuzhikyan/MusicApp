package am.aca.musicapp.comman.util;

/**
 * Created by Roman on 9/8/2016.
 */
import am.aca.musicapp.comman.bean.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

public class Util {
    public static Scanner in = new Scanner(System.in);
    public static int wrongUserCount = 0;
    public static ArrayList<Person> users = new ArrayList<>();
    private static final String Property_Path ="C:\\Users\\seriozhik\\MusicApp\\src\\am\\aca\\musicapp\\resources\\property";
    private static Integer trackNextID = 1;
    private static Integer imageNextID = 1;
    private static Integer personNextID = 1;
    private static Integer playlistNextID = 1;
    private static Integer albumNextID = 1;
    private static Integer artistNextID = 1;
    public static Integer generateTrackId(){
        return ++trackNextID;
    }

    public static Integer getImageNextID(){
        return ++imageNextID;
    }

    public static Integer getPersonNextID(){
        return ++personNextID;
    }
    public static Integer generatePlaylistID(){
        return ++playlistNextID;
    }
    public static Integer generateAlbumNextID(){
        return ++albumNextID;
    }

    public static Integer getArtistNextID(){
        return ++artistNextID;
    }

    public static String getValueFromPropertyKey(String key)
    {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(Property_Path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }

    public static void getMessage(String key)
    {
        System.out.print(getValueFromPropertyKey(key));
    }
}
