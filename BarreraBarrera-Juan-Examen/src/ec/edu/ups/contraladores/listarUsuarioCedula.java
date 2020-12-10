package ec.edu.ups.contraladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.DAO.DAOFactory;
import ec.edu.ups.entidades.Telefono;

/**
 * Servlet implementation class listarUsuarioCedula
 */
@WebServlet("/listarUsuarioCedula")
public class listarUsuarioCedula extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listarUsuarioCedula() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.print("ESTOY EN EL SERVLET DE Listar Usuario Cedula ");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String busquedaOpcion =  request.getParameter("opcion");
		
		
		List<Telefono> telefonos = DAOFactory.getFactory().getUsuarioDAO().findByUsuarioPorCedula(cedula);
		String url = "/jsp/ListarUsuario.jsp";
		request.setAttribute("operadoras", op_todas);
		request.setAttribute("tipoTelefono", tipo);
		request.getRequestDispatcher(url).forward(request, response);
		System.out.println("Busqueda de producto pasado");
		
		response.setCharacterEncoding("UTF-8");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
