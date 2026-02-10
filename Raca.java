package com.petshop1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "raca")
public class Raca {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nome;
private String origem;

public Raca() {
}
public Raca(String nome, String origem) {
}
public Long getId() {
	return id;
}
public String getNome() {
	return nome;
}
public String getOrigem() {
	return origem;
}
}
