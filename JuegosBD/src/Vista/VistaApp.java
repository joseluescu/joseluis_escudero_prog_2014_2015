package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;

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
		
		JMenuItem mntmPrincipal = new JMenuItem("Principal");
		mnPrincipal.add(mntmPrincipal);
		
		JMenu mnJuegos = new JMenu("Juegos");
		menuBar.add(mnJuegos);
		
		JMenuItem mntmJuegos = new JMenuItem("Juegos");
		mnJuegos.add(mntmJuegos);
		
		JMenu mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		
		JMenuItem mntmPerfil = new JMenuItem("Perfil");
		mnPerfil.add(mntmPerfil);
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
		
		JLabel lblNoSale = new JLabel("no sale");
		lblNoSale.setBounds(307, 278, 46, 14);
		ventanaPrincipal.add(lblNoSale);
		
	}
}
