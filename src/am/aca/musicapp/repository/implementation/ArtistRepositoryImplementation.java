package am.aca.musicapp.repository.implementation;

import am.aca.musicapp.comman.bean.Artist;
import am.aca.musicapp.comman.exception.InvalidCommandException;
import am.aca.musicapp.repository.interfaces.ArtistRepository;

/**
 * Created by Roman on 9/10/2016.
 */
public class ArtistRepositoryImplementation implements ArtistRepository {

    private static ArtistRepositoryImplementation artistRepository;

    private ArtistRepositoryImplementation() {}

    public static ArtistRepositoryImplementation getInstance() {
        if (artistRepository == null)
            artistRepository = new ArtistRepositoryImplementation();
        return artistRepository;
    }


    @Override
    public Artist addArtist(Artist artist) throws InvalidCommandException {
        return null;
    }

    @Override
    public Artist deleteArtist(Integer ID) throws InvalidCommandException {
        return null;
    }

    @Override
    public Artist editArtist(Artist artist) throws InvalidCommandException {
        return null;
    }

    @Override
    public Artist getArtist(Integer ID) throws InvalidCommandException {
        return null;
    }
}
