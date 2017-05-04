package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.domain.Airbag;
import com.domain.AireAcondicionado;
import com.domain.Automovil;
import com.domain.Coupe;
import com.domain.Familiar;
import com.domain.LlantasDeAleacion;
import com.domain.Sedan;
import com.domain.SistemaDeFrenosABS;
import com.domain.TechoCorredizo;

public class MyTests {

	@Test
	public void precioDeUnSedanSinOpcionales() {
		Automovil auto = new Sedan();
		Double precioEsperado = 230000.0;
		assertEquals("El precio de un Sedan sin opcionales deberia ser $230000.0", precioEsperado, auto.obtenerPrecio());
	}

	@Test
	public void precioDeUnFamiliarSinOpcionales() {
		Automovil auto = new Familiar();
		Double precioEsperado = 245000.0;
		assertEquals("El precio de un Familiar sin opcionales deberia ser $245000.0", precioEsperado, auto.obtenerPrecio());
	}
	
	@Test
	public void precioDeUnCoupeSinOpcionales() {
		Automovil auto = new Coupe();
		Double precioEsperado = 270000.0;
		assertEquals("El precio de un Coupe sin opcionales deberia ser $270000.0", precioEsperado, auto.obtenerPrecio());
	}
	
	@Test
	public void precioDeUnCoupeConTechoCorredizo() {
		Automovil auto = new Coupe();
		auto.agregarOpcional(new TechoCorredizo());
		Double precioEsperado = 282000.0;
		assertEquals("El precio de un Coupe con techo corredizo deberia ser $282000.0", precioEsperado, auto.obtenerPrecio());
	}
	
	@Test
	public void precioDeUnSedanConSistemaDeFrenosABS() {
		Automovil auto = new Sedan();
		auto.agregarOpcional(new SistemaDeFrenosABS());
		Double precioEsperado = 244000.0;
		assertEquals("El precio de un Sedan con sistema de frenos ABS deberia ser $244000.0", precioEsperado, auto.obtenerPrecio());
	}
	
	
	@Test
	public void precioDeUnFamiliarConAirbagYLlantasDeAleacion() {
		Automovil auto = new Familiar();
		auto.agregarOpcional(new Airbag());
		auto.agregarOpcional(new LlantasDeAleacion());
		Double precioEsperado = 264000.0;
		assertEquals("El precio de un Familiar con airbag y llantas de aleacion deberia ser $264000.0", precioEsperado, auto.obtenerPrecio());
	}
	
	@Test
	public void precioDeUnCoupeConTodosLosOpcionales() {
		Automovil auto = new Coupe();
		auto.agregarOpcional(new TechoCorredizo());
		auto.agregarOpcional(new AireAcondicionado());
		auto.agregarOpcional(new SistemaDeFrenosABS());
		auto.agregarOpcional(new Airbag());
		auto.agregarOpcional(new LlantasDeAleacion());
		Double precioEsperado = 335000.0;
		assertEquals("El precio de un Coupe con todos los opcionales (techo corredizo, aire acondicionado," + 
					" sistema de frenos ABS, airbag y llantas de aleacion) deberia ser $335000.0", 
					precioEsperado, auto.obtenerPrecio());
	}
}
