package com.webplanner.model;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "meses")
public class Mes implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String metaMensal;
	private ArrayList<Semana> semanas;
	
	public String getMetaMensal() {
		return metaMensal;
	}
	public void setMetaMensal(String metaMensal) {
		this.metaMensal = metaMensal;
	}
	public ArrayList<Semana> getSemanas() {
		return semanas;
	}
	public void setSemanas(ArrayList<Semana> semanas) {
		this.semanas = semanas;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	
}
