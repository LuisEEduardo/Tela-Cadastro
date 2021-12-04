package com.desenvolvimento.model.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L; 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id; 
	
	private String nome; 
	private String endereco; 
	private String telefone;
	
	public Pessoa() {
	}

	public Pessoa(int id, String nome, String endereco, String telefone) {
		Id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public int getId() {
		return Id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	} 

}
