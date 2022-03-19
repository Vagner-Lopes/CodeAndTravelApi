package com.destinos.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Destinos")
public class Destino implements Serializable{
	
	private static final long serialVersionUID = 1;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;	
	private String imgURL;
	private String nome;
	private String localidade;
	private Integer diarias;
	private BigDecimal valor;

	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public Integer getDiarias() {
		return diarias;
	}
	public void setDiarias(Integer diarias) {
		this.diarias = diarias;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	
}
