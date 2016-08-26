package br.com.caelum.romanos.controler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logica {
	
	String execute(HttpServletRequest request,HttpServletResponse response);

}
