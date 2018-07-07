package org.distribuidos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "Controlador",
    urlPatterns = {"/Controlador"}
)
public class Controlador extends HttpServlet {
	Connection conn;
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
      
    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");

    response.getWriter().print("GET");

  }
  public void doPost(HttpServletRequest request, HttpServletResponse response) 
	      throws IOException, ServletException {	      
	  //RequestDispatcher rd = getServletContext().getRequestDispatcher("/JSP/Consulta.jsp");
	  //rd.forward(request, response);
	  response.setContentType("text/plain");
	  response.setCharacterEncoding("UTF-8");
	  String variable=null;
		variable=request.getParameter("serie");
		if(variable==null){
			variable="No recupero";
		}
		
		String RutaImagen="";
		String SerieActual="";
		String SerieConsulta="";
		switch (variable) {

        case "1": RutaImagen="Chart-Serie-1.png";
        		  SerieActual="Personas mayores de 15 años, viviendo con VIH";
        		  SerieConsulta="Adults (ages 15+) living with HIV";
        			break;

        case "2": RutaImagen="Chart-Serie-2.png";
        		  SerieActual="Edad promedio de hombres, en su primer matrimonio";
        		  SerieConsulta="Age at first marriage, male";
					break;
        case "3":  RutaImagen="Chart-Serie-3.png";
        		 	SerieActual="Edad promedio de mujeres, en su primer matrimonio";
        		 	SerieConsulta="Age at first marriage, female";
					break;
        case "4": RutaImagen="Chart-Serie-4.png";
        			SerieActual="Prevalencia de diabetes ( Porcentaje de poblacion entre 25 y 79 años)";
        			SerieConsulta="Diabetes prevalence (% of population ages 20 to 79)";
					break;
        case "5":  RutaImagen="Chart-Serie-5.png";
        			SerieActual="Camas de hospital (por cada 1000 personas)";
        			SerieConsulta="Hospital beds (per 1,000 people)";
					break;
        case "6": RutaImagen="Chart-Serie-6.png";
        			SerieActual="Incidencia de TBC (por cada 1000 personas)";
        			SerieConsulta="Incidence of tuberculosis (per 100,000 people)";
					break;
        case "7": RutaImagen="Chart-Serie-7.png";
        			SerieActual="Expectativa de vida al nacer (en años)";
        			SerieConsulta="Life expectancy at birth, total (years)";
					break;
   
		}
		//Codigo para conectarse a la BD. MMW
		/*
		String BD = "postgres" ;
		String USER = "postgres" ;
		String PASS= "rootroot" ;
		String URL = "jdbc:postgresql://35.198.52.156:5432/" + BD;
		
	    try {
	      Class.forName("org.postgresql.Driver");
	      conn = DriverManager.getConnection(URL,USER,PASS);
	    } catch (ClassNotFoundException e) {
	      throw new ServletException("Error loading JDBC Driver", e);
	    } catch (SQLException e) {
	      throw new ServletException("Unable to connect to PostGre", e);
	    } finally {
	      // Nothing really to do here.
	    }
		*/
		Statement stmt = null;
		try {
			stmt = conn.createStatement();		
        String sql = "select * from \"public\".\"datos\" where serie='"+SerieConsulta+"';";
        stmt.executeQuery(sql);        
        ResultSet rs = stmt.executeQuery(sql);
        Data_BD[] data= new Data_BD[10];
        int i=0;
        while ( rs.next() ) {
           data[i]=new Data_BD(rs.getString("pais"),rs.getString("a2005"),rs.getString("a2006"),rs.getString("a2007"),rs.getString("a2008"),rs.getString("a2009"),rs.getString("a2010"),rs.getString("a2011"),rs.getString("a2012"),rs.getString("a2013"));
           i++;
        }
        rs.close();
        stmt.close();
        
		//BD_Temporal bd=new BD_Temporal();
		//Conexion_BD BD= new Conexion_BD();
		//Data_BD[] data;
		//data = BD.Consulta(SerieConsulta);
		String TablaHTML="";
		for(int j=0;j<10;j++){
			TablaHTML=TablaHTML+"<tr>"
					+ "<td>"+i+"</td>"
					+ "<td>"+data[j].getCiudad()+"</td>"
					+ "<td>"+data[j].getData_2005()+"</td>"
					+ "<td>"+data[j].getData_2006()+"</td>"
					+ "<td>"+data[j].getData_2007()+"</td>"
					+ "<td>"+data[j].getData_2008()+"</td>"
					+ "<td>"+data[j].getData_2009()+"</td>"
					+ "<td>"+data[j].getData_2010()+"</td>"
					+ "<td>"+data[j].getData_2011()+"</td>"
					+ "<td>"+data[j].getData_2012()+"</td>"
					+ "<td>"+data[j].getData_2013()+"</td>"	
					+"</tr>";
		}
		
		//
		
		
		request.setAttribute("RutaImagen", RutaImagen);
		request.setAttribute("SerieActual", SerieActual);
		request.setAttribute("Tabla", TablaHTML);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.getRequestDispatcher("/JSP/Consulta.jsp").forward(request, response);
	  }
  
  @Override
  public void init() throws ServletException {
	/*String USER = "postgres" ;
	String PASS= "rootroot" ;
	String BD = "postgres" ;
	String URL = "jdbc:postgresql://35.198.52.156:5432/" + BD;

    log("connecting to: " + URL);
    try {
      Class.forName("org.postgresql.Driver");
      conn = DriverManager.getConnection(URL,USER,PASS);
    } catch (ClassNotFoundException e) {
      throw new ServletException("Error loading JDBC Driver", e);
    } catch (SQLException e) {
      throw new ServletException("Unable to connect to PostGre", e);
    } finally {
      // Nothing really to do here.
    }*/
    
    String url = System.getProperty("cloudsql");
    log("connecting to: " + url);
    try {
      conn = DriverManager.getConnection(url);
    } catch (SQLException e) {
      throw new ServletException("Unable to connect to Cloud SQL", e);
    }
  }
}
 