package am.aca.musicapp.comman.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roman on 9/10/2016.
 */
public class PlayList {
    private Integer playlist_ID;
    private Person person;
    private String playListName;
    private List<Track> trackList=new ArrayList<>();

    public Integer getPlaylist_ID() {
        return playlist_ID;
    }

    public void setPlaylist_ID(Integer playlist_ID) {
        this.playlist_ID = playlist_ID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Track> trackList) {
        this.trackList = trackList;
    }
}
