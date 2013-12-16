package com.example.jeedemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gasnica {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double pojemnosc;
	private int rokProdukcji;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getPojemnosc() {
		return pojemnosc;
	}
	public void setPojemnosc(double pojemnosc) {
		this.pojemnosc = pojemnosc;
	}
	public int getRokProdukcji() {
		return rokProdukcji;
	}
	public void setRokProdukcji(int rokProdukcji) {
		this.rokProdukcji = rokProdukcji;
	}
	
	
	
}
