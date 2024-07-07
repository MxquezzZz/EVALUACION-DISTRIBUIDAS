package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cita")
public class Citas {
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idpersona")
	private int id;
	private int tipo_sangre;
	private String nombre;
	private String apellidos;
	private String f_nacimiento;
	private String dni;
	private String telefono;
	private String descripcion;
	private String fecha_disponible;
	private String caso;
	
	public Citas() {
		super();
	}

	public Citas(int id, int tipo_sangre, String nombre, String apellidos, String f_nacimiento, String dni,
			String telefono, String fecha_disponible, String descripcion, String caso) {
		super();
		this.id = id;
		this.tipo_sangre = tipo_sangre;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.f_nacimiento = f_nacimiento;
		this.dni = dni;
		this.telefono = telefono;
		this.fecha_disponible = fecha_disponible;
		this.descripcion = descripcion;
		this.caso = caso;
	}

	public Citas(int tipo_sangre, String nombre, String apellidos, String f_nacimiento, String dni, String telefono,
			String fecha_disponible,String descripcion, String caso) {
		super();
		this.tipo_sangre = tipo_sangre;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.f_nacimiento = f_nacimiento;
		this.dni = dni;
		this.telefono = telefono;
		this.fecha_disponible = fecha_disponible;
		this.descripcion = descripcion;
		this.caso = caso;
	}

	public String getCaso() {
		return caso;
	}

	public void setCaso(String caso) {
		this.caso = caso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipo_sangre() {
		return tipo_sangre;
	}

	public void setTipo_sangre(int tipo_sangre) {
		this.tipo_sangre = tipo_sangre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getF_nacimiento() {
		return f_nacimiento;
	}

	public void setF_nacimiento(String f_nacimiento) {
		this.f_nacimiento = f_nacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFecha_disponible() {
		return fecha_disponible;
	}

	public void setFecha_disponible(String fecha_disponible) {
		this.fecha_disponible = fecha_disponible;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

	
	
	
	
}
