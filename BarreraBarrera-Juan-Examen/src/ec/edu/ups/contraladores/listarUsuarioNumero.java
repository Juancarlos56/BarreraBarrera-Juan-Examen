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
 * Servlet implementation class listarUsuarioNumero
 */
@WebServlet("/listarUsuarioNumero")
public class listarUsuarioNumero extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listarUsuarioNumero() {
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
		
		String numero =  request.getParameter("opcion");
		
		
		List<Telefono> telefonos = DAOFactory.getFactory().getTelefonoDAO().findByTelefonoNumeroAJAX(numero);
		
		System.out.println("Cantidad de telefonos del usuario: "+telefonos.size());
		String tablaDatos="";
		String tablaIndex = "<table class='tg' id='tablaBuscar' style='width:60%'>"+
				"<tr>"+
					"<th class='tg-46ru'>Nombre del Usuario</th>"+
					"<th class='tg-46ru'>Cedula del Usuario</th>"+
					"<th class='tg-46ru'>Correo del Usuario</th>"+
					"<th class='tg-46ru'>Telefono del Usuario</th>"+
					"<th class='tg-46ru'>Tipo de telefono</th>"+
					"<th class='tg-46ru'>Operadora del telefono</th>"+
				"</tr>";
		
		
		if(telefonos !=null){
			
			for (int i=0;i<telefonos.size();i++){
				Telefono tf = telefonos.get(i);
				
					
					tablaDatos = tablaDatos + "<tr>"+
							"<td>"+tf.getUsu_telefonos().getNombre()+" "+tf.getUsu_telefonos().getApellido()+"</td>"+
							"<td>"+tf.getUsu_telefonos().getCedula()+"</td>"+
							"<td>"+tf.getUsu_telefonos().getCorreo()+"</td>"+
							"<td>"+tf.getTelnumero()+"</td>"+
							"<td>"+tf.getOpe_telefonos().getNombre()+"</td>"+
							"<td>"+tf.getTip_telefonos().getTipoNombre()+"</td>"+
							"</tr>";	
			}
			
			tablaDatos = tablaDatos + "</table> ";
				
		}

		tablaIndex = tablaIndex + tablaDatos;
		out.println(tablaIndex);
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
