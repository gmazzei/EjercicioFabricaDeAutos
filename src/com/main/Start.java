package com.main;

import com.domain.Airbag;
import com.domain.AireAcondicionado;
import com.domain.Automovil;
import com.domain.Coupe;
import com.domain.Familiar;
import com.domain.LlantasDeAleacion;
import com.domain.Sedan;
import com.domain.SistemaDeFrenosABS;
import com.domain.TechoCorredizo;

public class Start {

	public static void main(String[] args) {
	
		//Pruebas
		precioDeUnSedanSinOpcionales();
		
		precioDeUnFamiliarSinOpcionales();
		
		precioDeUnCoupeSinOpcionales();
		
		precioDeUnCoupeConTechoCorredizo();
		
		precioDeUnSedanConSistemaDeFrenosABS();
		
		precioDeUnFamiliarConAirbagYLlantasDeAleacion();
		
		precioDeUnCoupeConTodosLosOpcionales();
	}
	
	private static void precioDeUnSedanSinOpcionales() {
		Automovil auto = new Sedan();
		System.out.println("El precio de un Sedan sin opcionales es $" + auto.obtenerPrecio());
	}
	
	private static void precioDeUnFamiliarSinOpcionales() {
		Automovil auto = new Familiar();
		System.out.println("El precio de un Familiar sin opcionales es $" + auto.obtenerPrecio());
	}
	
	private static void precioDeUnCoupeSinOpcionales() {
		Automovil auto = new Coupe();
		System.out.println("El precio de un Coupe sin opcionales es $" + auto.obtenerPrecio());
	}
	
	private static void precioDeUnCoupeConTechoCorredizo() {
		Automovil auto = new Coupe();
		auto.agregarOpcional(new TechoCorredizo());
		System.out.println("El precio de un Coupe con techo corredizo es $" + auto.obtenerPrecio());
	}
	
	private static void precioDeUnSedanConSistemaDeFrenosABS() {
		Automovil auto = new Sedan();
		auto.agregarOpcional(new SistemaDeFrenosABS());
		System.out.println("El precio de un Sedan con sistema de frenos ABS es $" + auto.obtenerPrecio());
	}
	
	
	private static void precioDeUnFamiliarConAirbagYLlantasDeAleacion() {
		Automovil auto = new Familiar();
		auto.agregarOpcional(new Airbag());
		auto.agregarOpcional(new LlantasDeAleacion());
		System.out.println("El precio de un Familiar con airbag y llantas de aleacion es $" + auto.obtenerPrecio());
	}
	
	private static void precioDeUnCoupeConTodosLosOpcionales() {
		Automovil auto = new Coupe();
		auto.agregarOpcional(new TechoCorredizo());
		auto.agregarOpcional(new AireAcondicionado());
		auto.agregarOpcional(new SistemaDeFrenosABS());
		auto.agregarOpcional(new Airbag());
		auto.agregarOpcional(new LlantasDeAleacion());
		System.out.println("El precio de un Coupe con todos los opcionales (techo corredizo, aire acondicionado," + 
							" sistema de frenos ABS, airbag y llantas de aleacion) es $" + auto.obtenerPrecio());
	}

}
