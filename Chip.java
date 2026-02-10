package com.petshop1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Chip {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private int codigo;
private String localcolocacao;
private String status;

public Chip() {
}
public Chip(int codigo, String localcolocacao, String status) {
}
public Long getId() {
	return id;
}
public int getCodigo() {
	return codigo;
}
public String getLocalcolocacao() {
	return localcolocacao;
}
public String getStatus() {
	return status;
}
}