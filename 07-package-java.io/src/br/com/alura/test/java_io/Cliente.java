package br.com.alura.test.java_io;

import java.io.Serializable;

public class Cliente implements Serializable {
	

	//Boa prática. Qualque alteração na classe geraria uma nova versao id.
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cpf;
	private String profissao;

	
	
//	public Cliente(String nome, String cpf) {
//		this.nome = nome;
//		this.cpf = cpf;
//	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
		

}
