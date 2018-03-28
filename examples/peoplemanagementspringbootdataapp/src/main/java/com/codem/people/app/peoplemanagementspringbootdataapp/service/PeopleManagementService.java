package com.codem.people.app.peoplemanagementspringbootdataapp.service;

import com.codem.people.app.peoplemanagementspringbootdataapp.dao.PeopleManagementDao;
import com.codem.people.app.peoplemanagementspringbootdataapp.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PeopleManagementService {

    @Autowired
    private PeopleManagementDao peopleManagementDao;

    public Person createPerson(Person person)
    {
        return peopleManagementDao.save(person);
    }

    public Iterable<Person> createPersons(List<Person> personList) {
        Iterable<Person> demo = peopleManagementDao.save(personList);
        return demo;
    }


}
