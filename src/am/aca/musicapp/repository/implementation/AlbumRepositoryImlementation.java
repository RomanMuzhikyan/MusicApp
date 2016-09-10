package am.aca.musicapp.repository.implementation;

import am.aca.musicapp.comman.bean.Album;
import am.aca.musicapp.comman.exception.InvalidCommandException;
import am.aca.musicapp.repository.interfaces.AlbumRepository;

/**
 * Created by Roman on 9/10/2016.
 */
public class AlbumRepositoryImlementation implements AlbumRepository{

    private static AlbumRepositoryImlementation albumRepository;

    private AlbumRepositoryImlementation() {}

    public static AlbumRepositoryImlementation getInstance() {
        if (albumRepository == null)
            albumRepository = new AlbumRepositoryImlementation();
        return albumRepository;
    }

    @Override
    public Album addAlbum(Album album) throws InvalidCommandException {
        return null;
    }

    @Override
    public Album deleteAlbum(Integer ID) throws InvalidCommandException {
        return null;
    }

    @Override
    public Album editAlbum(Album album) throws InvalidCommandException {
        return null;
    }

    @Override
    public Album getAlbum(Integer ID) throws InvalidCommandException {
        return null;
    }
}
