package am.aca.musicapp.comman.bean;

/**
 * Created by Roman on 9/10/2016.
 */
public class Image {
    private int image_ID;
    private String title;
    private String url;


    public Image() {}

    public Image(int image_ID) {
        this.image_ID = image_ID;
    }

    public Image(int image_ID, String title, String url) {
        this.image_ID = image_ID;
        this.title = title;
        this.url = url;
    }

    public int getImage_ID() {
        return image_ID;
    }

    public void setId(int image_ID) {
        this.image_ID = image_ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
