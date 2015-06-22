package Controlador;
import java.util.ArrayList;


import Vista3.VistaApp3;
import Modeo3.ConexionBD3;
import Modeo3.User3;
import Modeo3.UsuariosModelo3;


public class MainControler {
	
	//Instancia unica
	private static MainControler instance = null;
	
	//Atributos de bases de datos
	ConexionBD3 juegos2bbdd;
	
	//VentanaPrincipal
	//private MainAppView vMain;
	
	//Autenticador
	
	private User3 usuarioRegistrado=null;
	
	//vistas
	VistaApp3 v3App;
	 
	//Usuarios
	UsuariosModelo3 usuarios=null;

	private MainControler() {
		//Creamos la conexion con la base de datos
		juegos2bbdd=ConexionBD3.getInstance("localhost","juegos2bbdd","root","");
		if(juegos2bbdd.connectDB()==true) {
			System.out.println("CONECTADOS CON EXITO");
		}else{
			System.out.println("ERROR EN LA CONEXION");
		}
			
		this.showMain();
	}
	
	
	//Implementar SingleTon
	public static MainControler getInstance() {
	     if(instance == null) {
	         instance = new MainControler();
	      }
	      return instance;
	}
	
	//Lanzar vista Inicial
	public void showMain(){
		//Cargamos los modelos necesarios para esta vista
		usuarios =new UsuariosModelo3();
		
		//Lanzamos la ventana principal
		v3App= new VistaApp3();
		 
		//Mostramos la vista principal
		//showPrincipal();
		//Hacemos visible la pantalla inicial
		v3App.setVisible(true);	
	}


	
	//Lanzar juegos
	//public void showVistaJuegos3(){
		//v3App.showJuegos();
	//}
	
	//Lanzar Principal
	//public void showPrincipal(){
		//cargamos la vista principal y la enviamos a usuarios
		//v3App.showPrincipal(usuarios.getUsuarios());
	
	}
	
	
	//}

	


