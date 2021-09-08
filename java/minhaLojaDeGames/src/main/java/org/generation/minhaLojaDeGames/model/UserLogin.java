package org.generation.minhaLojaDeGames.model;

public class UserLogin {
	//ATRIBUTOS ------------------------------------------------------------
	private String nome;
	private String usuario;
	private String senha;
	private String token;

	//GETTERS E SETTERS ----------------------------------------------------
	
	//NOME
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//USUARIO
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	//SENHA
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	//TOKEN
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
}
