
public class Corredores2BD {

	public static void main(String[] args) {
		//Generado el objeto
				ConexionCorredores corredores;
				ModeloCorredores2 mCorredor;    //realizar consulta base de datos
				//generamos el enlace
				corredores=new ConexionCorredores("localhost","corredores","root","");

				if(corredores.connectDB()==true) {
					System.out.println("CONECTADOS CON EXITO");
					mCorredor=new ModeloCorredores2(corredores.getConexion());
			    	mCorredor.getDatosCorredores();//saber si funciona o no
					System.out.println("LISTADO DE CORRREDORES");
				}
				else System.out.println("ERROR EN LA CONEXION");

	}

}
