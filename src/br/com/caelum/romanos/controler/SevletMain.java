package br.com.caelum.romanos.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SevletMain extends HttpServlet {
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String classe = "br.com.caelum.romanos.controler."+request.getParameter("p");
		System.out.println(classe);
		try{
		
			if(request.getParameter("p").equals("MonstarPaginaControler")){
			
				
					
					Class clas  = Class.forName(classe);
					Logica logica =(Logica) clas.newInstance();
					String  pagina = logica.execute(request, response);
					request.getRequestDispatcher(pagina).forward(request, response);
					
				
					
			 }
			 if(request.getParameter("p").equals("ConverteRomanoControler")){
				 Class clas  = Class.forName(classe);
				 Logica  logica = (Logica) clas.newInstance();
				 String pagina =  logica.execute(request, response);
				 request.getRequestDispatcher(pagina).forward(request, response);
				 
			 }
		 
		 }catch(Exception e){
				e.printStackTrace();
		}

	}

}
