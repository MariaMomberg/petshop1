package com.petshop1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petshop1.entities.Chip;

public interface ChipRepository extends JpaRepository<Chip, Long> {

}
