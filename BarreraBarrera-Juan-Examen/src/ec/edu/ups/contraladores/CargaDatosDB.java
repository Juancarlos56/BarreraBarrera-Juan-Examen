package ec.edu.ups.contraladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.DAO.DAOFactory;
import ec.edu.ups.DAO.OperadoraDAO;
import ec.edu.ups.DAO.TelefonoDAO;
import ec.edu.ups.DAO.TipoDAO;
import ec.edu.ups.DAO.UsuarioDAO;
import ec.edu.ups.entidades.Operadora;
import ec.edu.ups.entidades.Tipo;

/**
 * Servlet implementation class CargaDatosDB
 */
@WebServlet("/CargaDatosDB")
public class CargaDatosDB extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private TipoDAO tp;
	private OperadoraDAO op;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CargaDatosDB() {
    	tp = DAOFactory.getFactory().getTipoDAO();
    	op = DAOFactory.getFactory().getOperadoraDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String out = "Creadas las operadoras";
		List<Operadora> op_todas;
		List<Tipo> tipo;
		Operadora operadora ;
		Tipo tp;
		try {
			op_todas = DAOFactory.getFactory().getOperadoraDAO().findAll();
			tipo = DAOFactory.getFactory().getTipoDAO().findAll();
			System.out.println("Operadoras: "+op_todas);
			System.out.println("Tipo: "+tipo);
		} catch (Exception e) {
			op_todas = null;
			tipo = null;
		}
			
		if (op_todas == null) {
			System.out.println("Operadoras vacias, creacion");
			operadora = new Operadora(0, "Movistar");
			DAOFactory.getFactory().getOperadoraDAO().create(operadora);
			operadora = new Operadora(0, "Claro");
			DAOFactory.getFactory().getOperadoraDAO().create(operadora);
			
			op_todas = DAOFactory.getFactory().getOperadoraDAO().findOperadoras();
		}
		
		if (tipo == null) {
			tp = new Tipo(0, "Celular");
			DAOFactory.getFactory().getTipoDAO().create(tp);
			tp = new Tipo(0, "Convencional");
			DAOFactory.getFactory().getTipoDAO().create(tp);
			tipo = DAOFactory.getFactory().getTipoDAO().findAll();
			
		}
		
		System.out.println("Operadoas"+ op_todas.size());
		//System.out.println("Operadoas"+ op_todas.size());
		
		String url = "/jsp/RegistrarUsuario.jsp";
		request.setAttribute("operadoras", op_todas);
		request.setAttribute("tipoTelefono", tipo);
		request.getRequestDispatcher(url).forward(request, response);
		System.out.println("Busqueda de producto pasado");
		
		response.setCharacterEncoding("UTF-8");
		response.getWriter().append(out);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
