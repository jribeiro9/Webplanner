package com.webplanner.model;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ano")
public class Ano implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String metaAnualProfissional;
	private String metaAnualPessoal;
	private ArrayList<Mes> meses;
	
	public String getMetaAnualProfissional() {
		return metaAnualProfissional;
	}
	public void setMetaAnualProfissional(String metaAnualProfissional) {
		this.metaAnualProfissional = metaAnualProfissional;
	}
	public String getMetaAnualPessoal() {
		return metaAnualPessoal;
	}
	public void setMetaAnualPessoal(String metaAnualPessoal) {
		this.metaAnualPessoal = metaAnualPessoal;
	}
	public ArrayList<Mes> getMeses() {
		return meses;
	}
	public void setMeses(ArrayList<Mes> meses) {
		this.meses = meses;
	}
	
	
}
