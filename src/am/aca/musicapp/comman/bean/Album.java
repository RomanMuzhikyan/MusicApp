package am.aca.musicapp.comman.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roman on 9/10/2016.
 */
public class Album {
    private int album_ID;
    private String title;
    private String description;
    private Image image;
    private List<Track> tracks=new ArrayList<>();

    public int getAlbum_ID() {
        return album_ID;
    }

    public void setAlbum_ID(int album_ID) {
        this.album_ID = album_ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
}
