package com.example.jeedemo.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.jeedemo.domain.Gasnica;

@Stateless
public class GasnicaManager {
	
	@PersistenceContext
	EntityManager em;
	
	public void addGasnica(Gasnica gasnica) {
		gasnica.setId(null);
		em.persist(gasnica);
	}
	
	@SuppressWarnings("unchecked")
	public List<Gasnica> getAllGasnice(){
		return em.createNamedQuery("gasnica.getAllGasnice").getResultList();
	}
}
