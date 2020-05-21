package com.citas.libreria.entidades.global;

public enum UsuarioEstado {

	ACTIVO(0),  BLOQUEADO(1), INACTIVO(2);
	
	private int codigo;
	
	private UsuarioEstado(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
