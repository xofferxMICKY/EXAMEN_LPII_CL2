package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Implemento_producto;
import dao.Implemento_usuario;
import modelo.Modelo_producto;
import modelo.Modelo_usuario;

/**
 * Servlet implementation class Controlador_usuario
 */
public class Controlador_usuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador_usuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		String USUARIOCL2 = request.getParameter("usuario"); 
		String PASSWORDCL2 = request.getParameter("password"); 
		
		Modelo_usuario modelousuario = new Modelo_usuario();
		modelousuario.setUsuarioCL2(USUARIOCL2);
		modelousuario.setPasswordCL2(PASSWORDCL2);
		
		Implemento_usuario imus = new Implemento_usuario();
		
		String estado = imus.logeo(modelousuario);
		
		if(estado=="ok"){
			response.sendRedirect("Controlador_producto");
			return;
		}
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	}

}
