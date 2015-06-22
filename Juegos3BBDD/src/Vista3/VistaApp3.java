package Vista3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;

import java.awt.CardLayout;

import javax.swing.BoxLayout;
import javax.swing.JMenu;
import javax.swing.JMenuItem;



import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;









import Controlador.MainControler;
import Modeo3.UsuariosModelo3;
import Vista3.VistaPrincipal3;

import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Iterator;

public class VistaApp3 extends JFrame {
	
	 
	private JPanel contentPane;
	private JTextField textField;
	private JTextField nombre;
	private JTextField textoNombre;
	private JTextField textoGenero;
	private JTextField textoPlataforma;
	
	//Datos para cargar los usuarios
		UsuariosModelo3 usuarios;
		
	  // VistaPrincipal3 ventanaPrincipal= new VistaPrincipal3();
	public VistaApp3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 433);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPrincipal = new JMenu("Principal");
		menuBar.add(mnPrincipal);
		
		JMenuItem mntmPrincipal = new JMenuItem("Principal");
		mntmPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// btnJuegos_1;
			}
		});
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
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel Ventanas = new JPanel();
		contentPane.add(Ventanas);
		Ventanas.setLayout(new CardLayout(0, 0));
		
		JPanel PanelPrincipal = new JPanel();
		Ventanas.add(PanelPrincipal, "PANELPRINCIPAL");
		PanelPrincipal.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 133, 109, 14);
		PanelPrincipal.add(lblUsuario);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 168, 131, 20);
		PanelPrincipal.add(comboBox);
		
		JLabel lblContasea = new JLabel("Contase\u00F1a");
		lblContasea.setBounds(10, 212, 109, 14);
		PanelPrincipal.add(lblContasea);
		
		textField = new JTextField();
		textField.setBounds(10, 237, 131, 20);
		PanelPrincipal.add(textField);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(10, 276, 131, 23);
		PanelPrincipal.add(btnLogin);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(10, 315, 131, 23);
		PanelPrincipal.add(btnRegistrarse);
		
		JButton btnJuegos_1 = new JButton("Juegos");
		btnJuegos_1.addActionListener(new ActionListener() {
			
			//cambiamos de panel
			public void actionPerformed(ActionEvent e) {
				//CardLayout c= (CardLayout) Ventanas.getLayout();
				//c.show(Ventanas, "PANELJUEGOS");
				MainControler.getInstance().showMain();
			}
		});
		btnJuegos_1.setBounds(281, 70, 89, 23);
		PanelPrincipal.add(btnJuegos_1);
		
		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.setBounds(281, 129, 89, 23);
		PanelPrincipal.add(btnPerfil);
		
		JPanel PanelJuegos = new JPanel();
		Ventanas.add(PanelJuegos, "PANELJUEGOS");
		PanelJuegos.setLayout(null);
		
		
		//panel juegos
		JLabel lblFiltros = new JLabel("Filtros");
		lblFiltros.setBounds(10, 11, 46, 14);
		PanelJuegos.add(lblFiltros);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 53, 46, 14);
		PanelJuegos.add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(134, 53, 46, 14);
		PanelJuegos.add(lblGenero);
		
		nombre = new JTextField();
		nombre.setBounds(10, 78, 86, 20);
		PanelJuegos.add(nombre);
		nombre.setColumns(10);
		
		JLabel lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setBounds(262, 53, 103, 14);
		PanelJuegos.add(lblPlataforma);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(119, 78, 95, 20);
		PanelJuegos.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(262, 78, 103, 20);
		PanelJuegos.add(comboBox_2);
		
		JLabel lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setBounds(262, 122, 108, 14);
		PanelJuegos.add(lblNombre_1);
		
		textoNombre = new JTextField();
		textoNombre.setEditable(false);
		textoNombre.setBounds(262, 157, 123, 20);
		PanelJuegos.add(textoNombre);
		textoNombre.setColumns(10);
		
		JLabel lblGenero1 = new JLabel("Genero");
		lblGenero1.setBounds(262, 208, 123, 14);
		PanelJuegos.add(lblGenero1);
		
		textoGenero = new JTextField();
		textoGenero.setEditable(false);
		textoGenero.setBounds(262, 233, 123, 20);
		PanelJuegos.add(textoGenero);
		textoGenero.setColumns(10);
		
		JLabel lblPlataforma_1 = new JLabel("Plataforma");
		lblPlataforma_1.setBounds(262, 273, 123, 14);
		PanelJuegos.add(lblPlataforma_1);
		
		textoPlataforma = new JTextField();
		textoPlataforma.setEditable(false);
		textoPlataforma.setBounds(262, 308, 123, 20);
		PanelJuegos.add(textoPlataforma);
		textoPlataforma.setColumns(10);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(7, 199, 89, 23);
		PanelJuegos.add(btnEditar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(7, 264, 89, 23);
		PanelJuegos.add(btnSalvar);
		
		JButton btnPrincipal = new JButton("Principal");
		btnPrincipal.addActionListener(new ActionListener() {
			//cambiamos a principal
			public void actionPerformed(ActionEvent e) {
				CardLayout c= (CardLayout) Ventanas.getLayout();
				c.show(Ventanas, "PANELPRINCIPAL");
			}
		});
		btnPrincipal.setBounds(221, 7, 89, 23);
		PanelJuegos.add(btnPrincipal);
		
		JButton btnPerfil_1 = new JButton("Perfil");
		btnPerfil_1.setBounds(320, 7, 89, 23);
		PanelJuegos.add(btnPerfil_1);
		
		//Rellenamos el comboBox
				usuarios = new UsuariosModelo3();
				
				Iterator<String> it= usuarios.getUsuarios().iterator();
				while (it.hasNext()){
					comboBox.addItem((String)it.next());
		
		//Llamamos a vista principal
		//		getContentPane().add(ventanaPrincipal);
	}
}

	
}
