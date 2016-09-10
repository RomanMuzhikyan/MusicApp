package am.aca.musicapp.comman.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roman on 9/10/2016.
 */
public class Artist {
    private int artist_ID;
    private Person person;
    private String description;
    private List<Album> tracks=new ArrayList<>();
    private Image image;

    public int getArtist_ID() {
        return artist_ID;
    }

    public void setArtist_ID(int artist_ID) {
        this.artist_ID = artist_ID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Album> getTracks() {
        return tracks;
    }

    public void setTracks(List<Album> tracks) {
        this.tracks = tracks;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artist)) return false;

        Artist author = (Artist) o;

        return getArtist_ID() == author.getArtist_ID();

    }

    @Override
    public int hashCode() {
        return getArtist_ID();
    }

    @Override
    public String toString() {
        return "Author{" +
                "image=" + image +
                ", firstName='" + person.getFirstName() + '\'' +
                ", lastName='" + person.getLastName() + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
