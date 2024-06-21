package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Implemento_producto;
import modelo.Modelo_producto;

/**
 * Servlet implementation class Controlador_producto
 */
public class Controlador_producto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador_producto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Implemento_producto imp = new Implemento_producto();
		request.setAttribute("productos", imp.ListarProducto());
		
		
		
		request.getRequestDispatcher("/register.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String NOMBRECL2 = request.getParameter("nombre"); 
		double PRECIOVENTACL2 = Double.parseDouble(request.getParameter("precio")); 
		double PRECIOCOMPCL2 = Double.parseDouble(request.getParameter("precioven")); 
		String ESTADOCL2 = request.getParameter("estado"); 
		String DESCRIPCL2 = request.getParameter("descr"); 
		
		Modelo_producto producto = new Modelo_producto();
		
		
		producto.setNombreCL2(NOMBRECL2);
		producto.setPrecioVentaCL2(PRECIOVENTACL2);
		producto.setPrecioCompCL2(PRECIOCOMPCL2);
		producto.setEstadoCL2(ESTADOCL2);
		producto.setDescripCL2(DESCRIPCL2);
		
		
		Implemento_producto imp = new Implemento_producto();
		
		imp.RegistrarProducto(producto);
		request.setAttribute("productos", imp.ListarProducto());
		request.getRequestDispatcher("/register.jsp").forward(request, response);
		
		
	}

}
