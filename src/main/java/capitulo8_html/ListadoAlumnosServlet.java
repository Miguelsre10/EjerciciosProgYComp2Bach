package capitulo8_html;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListadoAlumnosServlet
 */
@WebServlet("/ListadoAlumnosServlet")
public class ListadoAlumnosServlet extends HttpServlet {
	String respuesta = " ";

    /**
     * Default constructor. 
     */
    public ListadoAlumnosServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.respuesta = "<!DOCTYPE html> "
				+ "<html> "
				+ "<head>"
				+ "<meta charset=\"ISO-8859-1\"> "
				+ "<title>Mi Primer Servlet</title> "
				+ "</head> "
				+ "<body> "
				+ "<h1>Listado de alumnado</h1>"
				+ "<table width='100%' border='1'>";

		mostrarTodosAlumnos();		
		
		this.respuesta += "</table></body>"
				+ "</html>";
		
		response.getWriter().append(this.respuesta);
		
	}

	private void mostrarTodosAlumnos() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			Statement s = (Statement) conexion.createStatement(); 
			ResultSet rs = s.executeQuery ("select * from alumnos.alumno");
		   
			while (rs.next() == true) { 
				this.respuesta += "<tr>" +
						"<td><a href='FichaAlumnoServlet?id=" + rs.getInt("id") + "'>" + rs.getString("nombre") + "</a></td>" +
						"<td>" + rs.getString("apellidos") + "</td>" +
						"<td>" + rs.getString("nif") + "</td>" +
						"</tr>";
			}
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 */
	private void mostrarPrimerAlumno() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/alumnos?serverTimezone=UTC","root", "Abcdefgh.1");
			Statement s = (Statement) conexion.createStatement(); 
			ResultSet rs = s.executeQuery ("select * from alumnos.alumno order by id limit 1");
		   
			if (rs.next() == true) { 
				this.respuesta += rs.getString("nombre");
			}
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
