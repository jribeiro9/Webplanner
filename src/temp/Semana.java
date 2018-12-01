package com.webplanner.model;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "semanas")
public class Semana implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String metaSemanal;
	private ArrayList<Dia> dias;
	
	public String getMetaSemanal() {
		return metaSemanal;
	}
	public void setMetaSemanal(String metaSemanal) {
		this.metaSemanal = metaSemanal;
	}
	public ArrayList<Dia> getDias() {
		return dias;
	}
	public void setDias(ArrayList<Dia> dias) {
		this.dias = dias;
	}
}
