package net.itdeal.ins.repository;

import org.springframework.stereotype.Repository;

import net.itdeal.ins.entities.Person;

import org.springframework.data.repository.CrudRepository;
@Repository
public interface PersonRepository extends CrudRepository<Person, String>{

}
