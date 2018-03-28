package com.codem.people.app.peoplemanagementspringbootdataapp.dao;

import com.codem.people.app.peoplemanagementspringbootdataapp.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PeopleManagementDao extends CrudRepository<Person,Integer> {

}
