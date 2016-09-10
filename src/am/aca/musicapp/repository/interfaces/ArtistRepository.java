package am.aca.musicapp.repository.interfaces;

import am.aca.musicapp.comman.bean.Artist;
import am.aca.musicapp.comman.exception.InvalidCommandException;

/**
 * Created by Roman on 9/10/2016.
 */
public interface ArtistRepository {
    Artist addArtist(Artist artist)throws InvalidCommandException;

    Artist deleteArtist(Integer ID)throws InvalidCommandException;

    Artist editArtist(Artist artist)throws InvalidCommandException;

    Artist getArtist(Integer ID)throws InvalidCommandException;
}
