package org.distribuidos;
import java.sql.*;


public class Conexion_BD {
	private String BD = "postgres" ;
	private String USER = "postgres" ;
	private String PASS= "rootroot" ;
	private String URL = "jdbc:postgresql://35.198.52.156:5432/" + BD;
	private Connection Conexion=null;
	
	public Conexion_BD(){
		try { 
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
        }
		
		try {
			Conexion = DriverManager.getConnection (URL,USER,PASS);
			Conexion.setAutoCommit(false);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
	}
	
	
	public Data_BD[] Consulta(String Serie) throws SQLException{
		Statement stmt = null;
		stmt = Conexion.createStatement();
        String sql = "select * from \"public\".\"datos\" where serie='"+Serie+"';";
        stmt.executeQuery(sql);        
        ResultSet rs = stmt.executeQuery(sql);
        Data_BD[] Datos= new Data_BD[10];
        int i=0;
        while ( rs.next() ) {
           Datos[i]=new Data_BD(rs.getString("pais"),rs.getString("a2005"),rs.getString("a2006"),rs.getString("a2007"),rs.getString("a2008"),rs.getString("a2009"),rs.getString("a2010"),rs.getString("a2011"),rs.getString("a2012"),rs.getString("a2013"));
           i++;
        }
        rs.close();
        stmt.close();
		return Datos;
	}
	
}
