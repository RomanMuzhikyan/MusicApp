package am.aca.musicapp.repository.interfaces;

import am.aca.musicapp.comman.bean.Track;
import am.aca.musicapp.comman.exception.InvalidCommandException;
import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Created by Roman on 9/10/2016.
 */
public interface TrackRepository {
    Track addTrack(Track track)throws InvalidCommandException;

    Track deleteTrack(Integer ID)throws InvalidCommandException;

    Track editTrack(Track track)throws InvalidCommandException;

    Track getTrack(Integer ID)throws InvalidCommandException;
}
