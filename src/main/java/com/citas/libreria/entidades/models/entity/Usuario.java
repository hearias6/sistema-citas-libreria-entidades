package com.citas.libreria.entidades.models.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="USUARIOS")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private String username;
	private int estado;
	private int intentos;
	
	@Column(name="ultimo_cambio_password")
	@Temporal(TemporalType.DATE)
	private Date ultimoCambioPassword;
	
	private String password;
	
	@ManyToMany
	@JoinTable(
			name="usuarios_roles",
			joinColumns = @JoinColumn(name="usuario_id"),
			inverseJoinColumns = @JoinColumn(name="role_id"))
	List<Role> roles;
	
	public Usuario(String username, int estado, int intentos, Date ultimoCambioPassword, String password) {
		super();
		this.username = username;
		this.estado = estado;
		this.intentos = intentos;
		this.ultimoCambioPassword = ultimoCambioPassword;
		this.password = password;
	}

	public Usuario() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getIntentos() {
		return intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}

	public Date getUltimoCambioPassword() {
		return ultimoCambioPassword;
	}

	public void setUltimoCambioPassword(Date ultimoCambioPassword) {
		this.ultimoCambioPassword = ultimoCambioPassword;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	
	
}


