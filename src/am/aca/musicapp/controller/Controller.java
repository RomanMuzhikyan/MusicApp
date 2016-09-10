package am.aca.musicapp.controller;

import am.aca.musicapp.comman.bean.Person;
import am.aca.musicapp.comman.exception.InvalidCommandException;
import am.aca.musicapp.repository.implementation.PersonRepositoryImplementation;


import static am.aca.musicapp.comman.util.Util.*;

/**
 * Created by Roman on 9/8/2016.
 */

public class Controller {
    private String input;
    private static Controller controllerinstance;

    public static Controller getInstance() {
        if (controllerinstance == null) {
            controllerinstance = new Controller();
        }
        return controllerinstance;
    }

    private Controller() {
    }
    public void begin() throws InvalidCommandException {

        getMessage("welcome");
        getMessage("write.sign.up.or.sign.in");
        input = in.nextLine();
        inputValidation(input);

    }
     private void signUp() {

        Person newPerson = new Person();
        getMessage("provide.username");
         newPerson.setFirstName(in.nextLine());
        getMessage("provide.password");
        newPerson.setLastName(in.nextLine());
        newPerson.setPerson_ID(getPersonNextID());
        try {
            PersonRepositoryImplementation.getInstance().addPerson(newPerson);
        } catch (InvalidCommandException e) {
            e.printStackTrace();
        }
        getMessage("successfully.created");

    }
    static Person signIn()
    {
        Person user = new Person();
        boolean validUser = false;
        for(Person u : users)
            if(user.equals(u))
            {
                user = u;
                validUser = true;
                break;
            }
        if(validUser)
        {
            getMessage("logged.in");
            return user;
        }
        else
        {
            if(wrongUserCount < 3)
            {
                wrongUserCount++;
                System.out.print(getValueFromPropertyKey("incorrect.properties") + (3-wrongUserCount));
                return null;
            }
            else
            {
                getMessage("bot.message");
                System.exit(0);
            }
        }
        return null;
    }
    private void addTrack() {
        //add new track, generatedTrackId
    }

    private void addInTop() {
    }

    private void deleteTrack() {
    }

    private void resumeTrack() {
    }

    private void pauseTrack() {
    }

    private void stopTrack() {
    }

    private void signOut() throws InvalidCommandException {
        getMessage("sign.out.account");
        inputValidation(in.nextLine());
    }
    private void playTrack() {

    }

    private void showPlayList() {

    }
    private void addPlayList() {
        //new playlist, generated PlayListId
    }
    private void addArtist() {
        //new Artist, generated ArtistId
    }
    private void addAlbum() {
        //new Album, generated AlbumId
    }
    public void inputValidation(String input) throws InvalidCommandException {
        while(input!="Exit")
        {
            switch (input) {
                case "Sign Up":
                    signUp();
                    break;
                case "Sign In":
                    signIn();
                    break;
                case "Add Playlist":
                    addPlayList();
                    break;
                case "Show My Playlist":
                    showPlayList();
                    break;
                case "Add Track":
                    addTrack();
                    break;
                case "Add Artist":
                    addArtist();
                    break;
                case "Add Album":
                    addAlbum();
                    break;
                case "Play Track":
                    playTrack();
                    break;
                case "Stop Track":
                    stopTrack();
                    break;
                case "Pause Track":
                    pauseTrack();
                    break;
                case "Resume Track":
                    resumeTrack();
                    break;
                case "Delete Track":
                    deleteTrack();
                    break;
                case "Add In Top":
                    addInTop();
                    break;
                case "Sign Out":
                    signOut();
                    break;
                case "Exit":
                    System.exit(0);
                    break;
                case "Help":
                    getMessage("help.text");
                    getMessage("write.sign.up.or.sign.in");
                    break;
                default:
                    throw new InvalidCommandException(getValueFromPropertyKey("invalid.command"));
            }
        }

    }
}
