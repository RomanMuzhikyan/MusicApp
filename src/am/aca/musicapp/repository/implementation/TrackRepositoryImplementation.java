package am.aca.musicapp.repository.implementation;

import am.aca.musicapp.comman.bean.Track;
import am.aca.musicapp.comman.exception.InvalidCommandException;
import am.aca.musicapp.repository.interfaces.TrackRepository;


/**
 * Created by Roman on 9/10/2016.
 */
public class TrackRepositoryImplementation implements TrackRepository{
    private static TrackRepository trackRepository;

    private TrackRepositoryImplementation() {}

    public static TrackRepository getInstance() {
        if (trackRepository == null)
            trackRepository = new TrackRepositoryImplementation();
        return trackRepository;
    }

    public Track play(int trackId) {
        return null;
    }
    public void stopTrack(int trackId) {

    }
    public void pauseTrack(int trackId) {

    }
    public Track getTrackByName(String trackName) {
        return null;
    }
    public Track removeTrackToPlayList(int trackId, int playListId) {
        return null;
    }

    public Track addTrackToPlayList(int trackId, int playListId) {
        return null;
    }

    @Override
    public Track addTrack(Track track) throws InvalidCommandException {
        return null;
    }

    @Override
    public Track deleteTrack(Integer ID) throws InvalidCommandException {
        return null;
    }

    @Override
    public Track editTrack(Track track) throws InvalidCommandException {
        return null;
    }

    @Override
    public Track getTrack(Integer ID) throws InvalidCommandException {
        return null;
    }
}
