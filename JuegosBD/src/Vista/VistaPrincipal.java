package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;

public class VistaPrincipal extends JPanel {
	private JTextField contraseña;

	/**
	 * Create the panel.
	 */
	public VistaPrincipal() {
		setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(27, 125, 84, 14);
		add(lblUsuario);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(27, 165, 148, 20);
		add(comboBox);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(27, 196, 84, 14);
		add(lblContrasea);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(22, 263, 153, 23);
		add(btnNewButton);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(22, 320, 153, 23);
		add(btnRegistrarse);
		
		JButton btnJuegos = new JButton("Juegos");
		btnJuegos.setBounds(304, 94, 89, 23);
		add(btnJuegos);
		
		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.setBounds(304, 164, 89, 23);
		add(btnPerfil);
		
		contraseña = new JTextField();
		contraseña.setBounds(27, 221, 148, 20);
		add(contraseña);
		contraseña.setColumns(10);
		

	}
}
