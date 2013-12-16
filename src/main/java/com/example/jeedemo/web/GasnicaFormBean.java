package com.example.jeedemo.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jeedemo.domain.Gasnica;
import com.example.jeedemo.service.GasnicaManager;

@SessionScoped
@Named("gasnicaBean")
public class GasnicaFormBean implements Serializable {

	private Gasnica gasnica = new Gasnica();
	
	@Inject
	GasnicaManager gm;
	
	public Gasnica getGasnica() {
		return gasnica;
	}
	public void setGasnica(Gasnica gasnica) {
		this.gasnica = gasnica;
	}
	
	// Actions
	public String addGasnica() {
		gm.addGasnica(gasnica);
		//return "showGasnice";
		return null;
	}
}
