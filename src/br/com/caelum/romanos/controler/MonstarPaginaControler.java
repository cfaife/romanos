package br.com.caelum.romanos.controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MonstarPaginaControler implements Logica{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		
		 
		return "/WEB-INF/views/jsp/conversor.jsp";
	}

}
