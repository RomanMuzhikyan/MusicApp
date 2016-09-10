package am.aca.musicapp.repository.implementation;

import am.aca.musicapp.comman.bean.PlayList;
import am.aca.musicapp.comman.exception.InvalidCommandException;
import am.aca.musicapp.repository.interfaces.PlayListRepository;

/**
 * Created by Roman on 9/10/2016.
 */
public class PlayListRepositoryImplementation implements PlayListRepository {

    private static PlayListRepositoryImplementation playlistRepository;

    private PlayListRepositoryImplementation() {
    }

    public static PlayListRepository getInstance() {
        if (playlistRepository == null)
            playlistRepository = new PlayListRepositoryImplementation();
        return playlistRepository;
    }
    public PlayList getPlaylistByName(String playListName) {
        return null;
    }

    @Override
    public PlayList addPlayList(PlayList playList) throws InvalidCommandException {
        return null;
    }

    @Override
    public PlayList deletePlayList(Integer ID) throws InvalidCommandException {
        return null;
    }

    @Override
    public PlayList editPlayList(PlayList playList) throws InvalidCommandException {
        return null;
    }

    @Override
    public PlayList getPlayList(Integer ID) throws InvalidCommandException {
        return null;
    }
}
