package br.com.prog3.atividade8aula12.model;

import java.io.Serializable;

public class Aluno implements Serializable {

	public static void main(String[] args) {
		Integer matricula;
		String nome;
		String ra;
		final long serialVersionUID = 1L;
	}

	private String ra;
	private String nome;
	private Integer matricula;

	public Integer getMatricula() {
		return matricula;
	}

	public String getRa() {
		return ra;
	}

	public String getNome() {
		return nome;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
