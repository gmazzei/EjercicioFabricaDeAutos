package com.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Automovil {
	
	protected Double precio;
	protected List<Opcional> opcionales; 
	
	public Automovil() {
		this.opcionales = new ArrayList<Opcional>();
	}
	
	public void agregarOpcional(Opcional opcional) {
		opcionales.add(opcional);
	}
	
	public Double obtenerPrecio() {
		Double precioTotal = this.precio;
		
		for (Opcional unOpcional : opcionales) {
			precioTotal += unOpcional.getPrecio();
		}
		
		return precioTotal;
	}
	
}
