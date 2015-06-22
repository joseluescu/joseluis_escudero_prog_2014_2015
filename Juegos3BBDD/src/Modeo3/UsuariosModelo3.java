package Modeo3;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class UsuariosModelo3 {
	//Creamos nuestra propia consulta
          private static String USUARIOS_LIST="SELECT * FROM usuarios";// devuelveme todo de usuarios
          private static String USUARIOS_COL ="usuario";           //cojo la columna que quiero      
          
        
          //conexion
		private Connection conexion = null; //maneja la conexion
		Statement instruccion=null;//instruccion de consulta
		ResultSet conjuntoResultados =null; //maneja los resultados
		
		  //usuariosBD
		private ArrayList<String> usuarios=null;
		
		public UsuariosModelo3() {
	            //obtenemos la conexion de datos
			conexion=ConexionBD3.getConexion();
			//inicializamos el array
			usuarios=new ArrayList<String>();
		}
		//devuelve los datos de los corredores y prepara la consulta BD
		public ArrayList getUsuarios(){
			try{
			instruccion = this.conexion.createStatement();//lanzamos la consulta
			conjuntoResultados = instruccion.executeQuery( USUARIOS_LIST);
			
			//Listamos por pantalla los datos(iterador)
			//hasta que sea falsa
			while( conjuntoResultados.next() ) {
				usuarios.add(conjuntoResultados.getString(USUARIOS_COL));
				
			}// fin de while
			return usuarios;
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
				return usuarios;
			}
			finally{
				try{
					conjuntoResultados.close();
					instruccion.close();
				}
				catch(SQLException excepcionSql)
				{
					excepcionSql.printStackTrace();
				}
			}
			}

	}

