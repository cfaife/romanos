package br.com.caelum.romanos.controler;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class ConverteParaRomanoTest  {
	ConversorCore conversor;
	@Before
	public void setup(){
		 conversor = new ConversorCore();
	}

	@Test
	public void testaConversaoDeUmDez(){
		int num1 =1;
		int num2 =2;
		int num3 =3;
		int num4 =4;
		int num5 =5;
		int num6 =6;
		int num7 =7;
		int num8 =8;
		int num9 =9;
		int num10 =10;
		
	
		assertEquals("I",  conversor.converteParaRomano(num1));
		assertEquals("II",  conversor.converteParaRomano(num2));
		assertEquals("III",  conversor.converteParaRomano(num3));
		assertEquals("IV",  conversor.converteParaRomano(num4));
		assertEquals("V",  conversor.converteParaRomano(num5));
		assertEquals("VI",  conversor.converteParaRomano(num6));
		assertEquals("VII",  conversor.converteParaRomano(num7));
		assertEquals("VIII",  conversor.converteParaRomano(num8));
		assertEquals("IX",  conversor.converteParaRomano(num9));
		assertEquals("X",  conversor.converteParaRomano(num10));
	
		
	} 

}
