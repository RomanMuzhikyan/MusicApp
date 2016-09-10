package am.aca.musicapp.controller;

import am.aca.musicapp.comman.exception.InvalidCommandException;

/**
 * Created by Roman on 9/8/2016.
 */



public class Main {
    public static void main(String[] args) throws InvalidCommandException {
        Controller.getInstance().begin();
    }
}
