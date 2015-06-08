package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class VistaApp extends JFrame {

	private JPanel contentPane;
   VistaPrincipal ventanaPrincipal= new VistaPrincipal();
   
	public VistaApp() {
		//contenedor
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 433);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPrincipal = new JMenu("Principal");
		menuBar.add(mnPrincipal);
		
		JMenu mnJuegos = new JMenu("Juegos");
		menuBar.add(mnJuegos);
		
		JMenu mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel Ventanas = new JPanel();
		contentPane.add(Ventanas);
		Ventanas.setLayout(new CardLayout(0, 0));
		
		JPanel PanelPrincipal = new JPanel();
		Ventanas.add(PanelPrincipal, "PANELPRINCIPAL");
		PanelPrincipal.setLayout(null);
		
		//Llamamos a vista principal
		getContentPane().add(ventanaPrincipal);
		
	}

}
