package ait.cohort34.petPosts.dao;

import ait.cohort34.petPosts.model.Pet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface PetRepository extends JpaRepository<Pet,String> {
    Stream<Pet> findByAge(int age);
    Stream<Pet> findByCountryIgnoreCase(String country);
    Stream<Pet> findByCategoryIgnoreCase(String category);
    Stream<Pet> findByGenderIgnoreCase(String gender);
    Stream<Pet> findByDisability(Boolean disability);
    Stream<Pet> findByAuthorIgnoreCase(String author);

}
