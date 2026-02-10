package com.petshop1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petshop1.entities.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{

}
