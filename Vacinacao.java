package com.petshop1.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vacinacao")
public class Vacinacao {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private int codigo;
private LocalDate validade;
private String periodo;

public Vacinacao() {
}
public Vacinacao(int codigo, LocalDate validade, String periodo) {
}
public Long getId() {
	return id;
}
public int getCodigo() {
	return codigo;
}
public LocalDate getValidade() {
	return validade;
}
public String getPeriodo() {
	return periodo;
}
}