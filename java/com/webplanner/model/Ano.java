package com.webplanner.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ano")
public class Ano implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "nome")
	private String nome;

	@Column(name = "meses")
	 private List<Mes> mes;
		
	@Override
	public String toString() {
		return nome;
	}
	
	private String metaAnualProfissional;
	private String metaAnualPessoal;
	
    @OneToMany(mappedBy="ano", cascade = CascadeType.ALL)
	List<Mes> meses;
	
	public Ano() {
		for(int i=0;i<12;i++) {
			this.meses = new ArrayList<Mes>();
			this.meses.add(new Mes());
		}
	}
	
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
	public List<Mes> getMeses() {
		return meses;
	}
	public void setMeses(List<Mes> meses) {
		this.meses = meses;
	}
	
	
}
