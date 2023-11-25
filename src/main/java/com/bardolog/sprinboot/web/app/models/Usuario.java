package com.bardolog.sprinboot.web.app.models;



public class Usuario {
	
	private String nombre;
	private String apellido;
	private  String email;
	
	
	
	
	
	
	public Usuario() {
		super();
	}

	public Usuario(String nombre, String apellido, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	

}
