package com.petshop1.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pet")
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String tamanho;
	private LocalDate datanascimento;

	public Pet() {
}
	public Pet(String nome, String tamanho, LocalDate datanascimento) {
}
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getTamanho() {
		return tamanho;
	}
	public LocalDate getDatanascimento() {
		return datanascimento;
	}
}