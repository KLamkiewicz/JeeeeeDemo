package com.example.jeedemo.web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jeedemo.domain.Gasnica;
import com.example.jeedemo.domain.Person;
import com.example.jeedemo.service.GasnicaManager;

@SessionScoped
@Named("gasnicaBean")
public class GasnicaFormBean implements Serializable {

	private Gasnica gasnica = new Gasnica();
	private ListDataModel<Gasnica> gasnice = new ListDataModel<Gasnica>();
	
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
		return "showGasnice";
		//return null;
	}
	
	public ListDataModel<Gasnica> getAllGasnice() {
		gasnice.setWrappedData(gm.getAllGasnice());
		return gasnice;
	}
}
