package com.jonathan.dl.aluno;

public class Aluno {
	
	private String nome;
	private String curso;
	private String matricula;
	private String contato;
	private boolean ativo = false;
	
	public Aluno(String nome, String curso, String matricula, String contato) {
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
		this.contato = contato;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getContato() {
		return contato;
	}
	
	public boolean isAtivo() {
		return ativo;
	}
	
	public void ativar() {
	
		this.ativo = true;
	}
}
