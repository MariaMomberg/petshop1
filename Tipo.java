package com.petshop1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipo")
public class Tipo {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nome;
private String descricao;

public Tipo() {
}
public Tipo(String nome, String descricao) {
}
public Long getId() {
	return id;
}
public String getNome() {
	return nome;
}
public String getDescricao() {
	return descricao;
}
}
