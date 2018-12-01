package com.webplanner.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dias")
public class Dia implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String manha;
	private String tarde;
	private String noite;
	private String prioridade;
	
	public String getManha() {
		return manha;
	}
	public void setManha(String manha) {
		this.manha = manha;
	}
	public String getTarde() {
		return tarde;
	}
	public void setTarde(String tarde) {
		this.tarde = tarde;
	}
	public String getNoite() {
		return noite;
	}
	public void setNoite(String noite) {
		this.noite = noite;
	}
	public String getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
}
