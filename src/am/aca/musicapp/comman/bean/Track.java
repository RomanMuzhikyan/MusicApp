package am.aca.musicapp.comman.bean;

/**
 * Created by Roman on 9/10/2016.
 */
public class Track {
    private Integer trackID;
    private String trackName;
    private Artist trackArtist;
    private TrackType type;
    private TrackGenre trackGenre;
    private Double trackSize;
    private Double trackLength;
    private String location;
    private Double trackRating;

    public Integer getTrackID() {
        return trackID;
    }

    public void setTrackID(Integer trackID) {
        this.trackID = trackID;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public TrackType getType() {
        return type;
    }

    public void setType(TrackType type) {
        this.type = type;
    }

    public TrackGenre getTrackGenre() {
        return trackGenre;
    }

    public void setTrackGenre(TrackGenre trackGenre) {
        this.trackGenre = trackGenre;
    }

    public Double getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(Double trackLength) {
        this.trackLength = trackLength;
    }

    public Double getTrackSize() {
        return trackSize;
    }

    public void setTrackSize(Double trackSize) {
        this.trackSize = trackSize;
    }

    public Double getTrackRating() {
        return trackRating;
    }

    public void setTrackRating(Double trackRating) {
        this.trackRating = trackRating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Artist getTrackArtist() {
        return trackArtist;
    }

    public void setTrackArtist(Artist trackArtist) {
        this.trackArtist = trackArtist;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Track)) return false;

        Track track = (Track) o;

        return getTrackID() == track.getTrackID();

    }

    @Override
    public int hashCode() {
        return getTrackID();
    }

    @Override
    public String toString() {
        return "TrackRepositoryInterface{" +
                "trackName='" + trackName + '\'' +
                ", trackArtist=" + trackArtist +
                ", type=" + type +
                ", trackGenre=" + trackGenre +
                ", trackSize=" + trackSize +
                ", trackLength=" + trackLength +
                ", location='" + location + '\'' +
                ", trackID=" + trackID +
                ", trackRating=" + trackRating +
                '}';
    }
}
