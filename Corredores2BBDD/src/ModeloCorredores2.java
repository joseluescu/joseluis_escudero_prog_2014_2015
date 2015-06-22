import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class ModeloCorredores2 {
	//Creamos nuestra propia consulta
          private static String CORREDORES_LIST="SELECT * FROM corredores";// devuelveme todo de 
          																//corredores
		//imprimir por pantalla los datos devueltos de la consulta
          private static String ID_COL="id";
      	private static String NOMBRE_COL="nombre";
      	private static String APELLIDOS_COL="apellidos";
      	private static String TIME_COL="tiempo_medio";
      	
      	//se almacenan en un array
      	private static String COLUMNAS[]={ID_COL,NOMBRE_COL,APELLIDOS_COL,TIME_COL};
      	
          //conexion
		private Connection conexion = null; //maneja la conexion
		Statement instruccion=null;//instruccion de consulta
		ResultSet conjuntoResultados =null; //maneja los resultados
		public ModeloCorredores2(Connection conexion) {
	            this.conexion=conexion;
		}
		//devuelve los datos de los corredores y prepara la consulta BD
		public void getDatosCorredores(){
			try{
			instruccion = this.conexion.createStatement();//lanzamos la consulta
			conjuntoResultados = instruccion.executeQuery( CORREDORES_LIST);
			
			//Listamos por pantalla los datos(iterador)
			//hasta que sea falsa
			while( conjuntoResultados.next() ) {
				System.out.print(conjuntoResultados.getInt(ID_COL)+";");
				System.out.print(conjuntoResultados.getString(NOMBRE_COL)+";");
				System.out.print(conjuntoResultados.getString(APELLIDOS_COL)+";");
				System.out.println(conjuntoResultados.getTime(TIME_COL));
			}// fin de while
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
			}
}
