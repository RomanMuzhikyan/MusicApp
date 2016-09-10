package am.aca.musicapp.repository.interfaces;

import am.aca.musicapp.comman.bean.Album;
import am.aca.musicapp.comman.exception.InvalidCommandException;

/**
 * Created by Roman on 9/10/2016.
 */
public interface AlbumRepository {
    Album addAlbum(Album album)throws InvalidCommandException;

    Album deleteAlbum(Integer ID)throws InvalidCommandException;

    Album editAlbum(Album album)throws InvalidCommandException;

    Album getAlbum(Integer ID)throws InvalidCommandException;
}
