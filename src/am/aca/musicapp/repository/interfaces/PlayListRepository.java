package am.aca.musicapp.repository.interfaces;

import am.aca.musicapp.comman.bean.PlayList;
import am.aca.musicapp.comman.exception.InvalidCommandException;

/**
 * Created by Roman on 9/10/2016.
 */
public interface PlayListRepository {
    PlayList addPlayList(PlayList playList)throws InvalidCommandException;

    PlayList deletePlayList(Integer ID)throws InvalidCommandException;

    PlayList editPlayList(PlayList playList)throws InvalidCommandException;

    PlayList getPlayList(Integer ID)throws InvalidCommandException;
}
