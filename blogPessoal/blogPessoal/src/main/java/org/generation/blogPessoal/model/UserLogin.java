package org.generation.blogPessoal.model;

public class UserLogin {
	//ATRIBUTOS ------------------------------------------------------------
	private long id;
	private String nome;
	private String usuario;
	private String senha;
	private String token;
	private String foto;
	private String tipo;

	//GETTERS E SETTERS ----------------------------------------------------
	
	//ID
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
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
	
	//FOTO
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
			
	//TIPO
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
