package ec.edu.ups.contraladores;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.DAO.DAOFactory;
import ec.edu.ups.entidades.Operadora;
import ec.edu.ups.entidades.Telefono;
import ec.edu.ups.entidades.Tipo;
import ec.edu.ups.entidades.Usuario;

/**
 * Servlet implementation class RegistrarTelefono
 */
@WebServlet("/RegistrarTelefono")
public class RegistrarTelefono extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarTelefono() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//Producto prod = null;
		int operadora;
		int tipo;
		Usuario us = null;
		Operadora op = null;
		Tipo tp = null;
		String cedula =  request.getParameter("cedula");
		us = DAOFactory.getFactory().getUsuarioDAO().findByUsuarioPorCedula(cedula);
		
		if (us != null) {
			System.out.println("Usuario ya registrado");
			operadora =  Integer.parseInt(request.getParameter("operadora"));
			op = DAOFactory.getFactory().getOperadoraDAO().read(operadora);
			tipo =  Integer.parseInt(request.getParameter("tipo"));
			tp = DAOFactory.getFactory().getTipoDAO().read(tipo);
			String phone =  request.getParameter("phone");
			Telefono tf = new Telefono(0, phone, us, tp, op);
			DAOFactory.getFactory().getTelefonoDAO().create(tf);
			out.println("<h3>El telefono a sigo Agregado al Usuario:"+us.getNombre()+" </h3>");
			
		}else {
			System.out.println("Nuevo Usuario");
			String nombres =  request.getParameter("nombres");
			String apellidos =  request.getParameter("apellidos");
			String email =  request.getParameter("email");
			String password =  request.getParameter("password");
			String phone =  request.getParameter("phone");
			Usuario u = new Usuario(0, cedula, nombres, apellidos, email, password);
			DAOFactory.getFactory().getUsuarioDAO().create(u);
			
			
			Usuario usua = DAOFactory.getFactory().getUsuarioDAO().findByUsuarioPorCedula(cedula);
			operadora =  Integer.parseInt(request.getParameter("operadora"));
			op = DAOFactory.getFactory().getOperadoraDAO().read(operadora);
			tipo =  Integer.parseInt(request.getParameter("tipo"));
			tp = DAOFactory.getFactory().getTipoDAO().read(tipo);
			Telefono tf = new Telefono(0, phone, usua, tp, op);
			DAOFactory.getFactory().getTelefonoDAO().create(tf);
			
			out.println("<h3>El telefono a sigo Agregado a un nuevo Usuario:"+usua.getNombre()+" </h3>");
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
