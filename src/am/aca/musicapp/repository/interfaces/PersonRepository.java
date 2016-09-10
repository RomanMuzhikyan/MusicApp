package am.aca.musicapp.repository.interfaces;

import am.aca.musicapp.comman.bean.Person;
import am.aca.musicapp.comman.exception.InvalidCommandException;

/**
 * Created by Roman on 9/10/2016.
 */
public interface PersonRepository {
    Person addPerson(Person person)throws InvalidCommandException;

    Person deletePerson(Integer ID)throws InvalidCommandException;

    Person editPerson(Person track)throws InvalidCommandException;

    Person getPerson(Integer ID)throws InvalidCommandException;
}
