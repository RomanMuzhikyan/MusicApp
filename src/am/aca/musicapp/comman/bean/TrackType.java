package am.aca.musicapp.comman.bean;

/**
 * Created by Roman on 9/10/2016.
 */
public enum TrackType {
    MP3(0),
    MP4(1);

    private int index;

    TrackType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
