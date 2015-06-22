package Modeo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD3 {

	
		 
			// DATOS DE LA CONEXION (Siempre es igual)
			static final String CONTROLADOR_MYSQL= "com.mysql.jdbc.Driver";
			
			//DATOS DE LA BBDD
			private String host;
			private String bbdd;
			private String user;
			private String pass;
			private String url;
			
			//Conexion
			private static Connection conexion = null;// maneja la conexió
			
			//Instancia unica
			//private static ConexionBD2 instance = null;
			
			public ConexionBD3(String HOST,String BBDD,String USER,String PASS) {
				this.host=HOST;
				this.bbdd=BBDD;
				this.user=USER;
				this.pass=PASS;
				
			}
			
			
			public boolean connectDB(){
				try{
					//Lo primero es cargar el controlador MySQL el cual automáticamente se registra
					Class.forName(CONTROLADOR_MYSQL);
					//Conectarnos a la BBDD indicando los campos
					conexion = DriverManager.getConnection("jdbc:mysql://"+this.host+"/"+this.bbdd,this.user,this.pass);
				}
				catch( SQLException excepcionSql ) 
				{
					excepcionSql.printStackTrace();
					return false;
				}
				catch( ClassNotFoundException noEncontroClase)
				{
					noEncontroClase.printStackTrace();
					return false;
				}
				return true;
			}
		   //para devolver la conexion que hemos realizado
			public static Connection getConexion() {
				
				return conexion;
			}


			public static ConexionBD3 getInstance(String string,
					String string2, String string3, String string4) {
				// TODO Auto-generated method stub
				return null;
			}
	}

