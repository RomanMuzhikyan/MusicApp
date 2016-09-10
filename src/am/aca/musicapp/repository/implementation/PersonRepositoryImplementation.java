package am.aca.musicapp.repository.implementation;

import am.aca.musicapp.comman.bean.Person;
import am.aca.musicapp.comman.exception.InvalidCommandException;
import am.aca.musicapp.repository.interfaces.PersonRepository;

/**
 * Created by Roman on 9/10/2016.
 */
public class PersonRepositoryImplementation implements PersonRepository {
    private static PersonRepositoryImplementation personRepository;

    private PersonRepositoryImplementation() {
    }

    public static PersonRepositoryImplementation getInstance() {
        if (personRepository == null)
            personRepository = new PersonRepositoryImplementation();
        return personRepository;
    }
    public Person getPersonByName(String fName,String lName) {
        return null;
    }

    @Override
    public Person addPerson(Person person) throws InvalidCommandException {
        return null;
    }

    @Override
    public Person deletePerson(Integer ID) throws InvalidCommandException {
        return null;
    }

    @Override
    public Person editPerson(Person track) throws InvalidCommandException {
        return null;
    }

    @Override
    public Person getPerson(Integer ID) throws InvalidCommandException {
        return null;
    }

}
