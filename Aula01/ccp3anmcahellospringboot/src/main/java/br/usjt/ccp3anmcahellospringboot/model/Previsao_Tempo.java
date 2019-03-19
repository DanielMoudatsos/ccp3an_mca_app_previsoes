package br.usjt.ccp3anmcahellospringboot.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Previsao_Tempo implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeDia() {
		return nomedia;
	}

	public void setNome(String nomedia) {
		this.nome = nomedia;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getTempMin() {
		return tempMin;
	}

	public void setTempMin(double tempMin) {
		this.tempMin = tempMin;
	}
	
	public double getTempMax() {
		return tempMax;
	}

	public void setTempMin(double tempMax) {
		this.tempMax = tempMax;
	}
	
	public double getHumidade() {
		return humidade;
	}

	public void setHumidade(double humidade) {
		this.humidade = humidade;
	}

	private String nomedia;
	private String descricao;
	
	private double tempMin;
	private double tempMax;
	private double humidade;
	

}
