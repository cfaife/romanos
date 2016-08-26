package br.com.caelum.romanos.controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.romanos.model.NumeroMistico;

public class ConverteRomanoControler implements Logica{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		String num = request.getParameter("numero");
		Integer numero = Integer.parseInt(num);
		NumeroMistico numeroMistico = new NumeroMistico();
		numeroMistico.setNumerDecimal(numero);
		ConversorCore conversorCore = new ConversorCore();
		numeroMistico.setNumeroRomano(conversorCore.converteParaRomano(numeroMistico.getNumerDecimal()));
		
		request.setAttribute("numeroRomano", numeroMistico.getNumeroRomano());
		return "/WEB-INF/views/jsp/conversor.jsp";
	}
	
	

}
