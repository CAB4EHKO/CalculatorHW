package pro.sky.skyprocalculatorhw;

import pro.sky.skyprocalculatorhw.exceptions.BadPersonNumberException;

import java.util.List;

public interface PersonService {


    List<Person> getPersonsByProfessions(List<Integer> professionNumbers);

    void addPerson(Person person);

    void addProfession(String passport, Integer profession);

    String getPersonByPassport(String passport);
}
