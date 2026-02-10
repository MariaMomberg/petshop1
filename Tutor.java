package com.petshop1.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tutor")
public class Tutor {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nome;
private LocalDate datanacimento;

public Tutor() {
}
public Tutor(String nome, LocalDate datanascimento) {
}
public Long getId() {
	return id;
}
public String getNome() {
	return nome;
}
public LocalDate getDatanacimento() {
	return datanacimento;
}
}