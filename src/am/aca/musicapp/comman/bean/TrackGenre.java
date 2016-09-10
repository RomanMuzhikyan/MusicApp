package am.aca.musicapp.comman.bean;

/**
 * Created by Roman on 9/10/2016.
 */
public enum TrackGenre {
    POP(0),
    ROCK(1),
    HOUSE(2),
    BLUES(3),
    COUNTRY(4),
    JAZZ(5),
    HIP_HOP(6),
    REGGAE(7),
    METAL(8),
    PUNK(9);
    private int index;

    TrackGenre(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

