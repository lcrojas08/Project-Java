package com.usuario.persona;

import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "cliente") 
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Usuarios;
	private String Nomcliente;
	private String Cedula;
	private String Saldo;
	private String Tipo_cuenta;
	private String Contraseña;
	
	public Cliente(int id, String usuarios, String nomcliente, String cedula, String saldo, String tipo_cuenta,
			String contraseña) {
		super();
		Id = id;
		Usuarios = usuarios;
		Nomcliente = nomcliente;
		Cedula = cedula;
		Saldo = saldo;
		Tipo_cuenta = tipo_cuenta;
		Contraseña = contraseña;
	}

	public Cliente() {	
	}
	
	public int getId() {
		return Id;
	}
	public void setID(int id) {
		this.Id = id;
	}
	
	public String getNomcliente() {
		return Nomcliente;
	}
	public void setNomcliente(String nomcliente) {
		this.Nomcliente = nomcliente;
	}
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		this.Cedula = cedula;
	}
	public String getSaldo() {
		return Saldo;
	}
	public void setSaldo(String saldo) {
		this.Saldo = saldo;
	}
	public String getTipo_cuenta() {
		return Tipo_cuenta;
	}
	public void setTipo_cuenta(String tipo_cuenta) {
		this.Tipo_cuenta = tipo_cuenta;
	}
	public String getContraseña() {
		return Contraseña;
	}
	public void setContraseña(String contraseña) {
		this.Contraseña = contraseña;
	}
	


	public void setUsuarios(String usuarios) {
	this.Usuarios = usuarios;
	}

	public String getUsuarios() {
		return Usuarios;

	
	}

	
	
	
	@Override
	public String toString() {
		return "Cliente [Usuarios=" + Usuarios + ", Nomcliente=" + Nomcliente + ", Cedula=" + Cedula + ", Saldo="
				+ Saldo + ", Tipo_cuenta=" + Tipo_cuenta + ", Contraseña=" + Contraseña + "]";
	}
}

	
	


	