import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class ConversorMonedas extends JFrame {

	//elementos graficos
	private JPanel contentPane;
	private JTextField valorEuros;
	private JTextField valorCambio;
	private JTextField textoMsg;
	private JComboBox tiposMonedas;
	private JButton boton;
	
	//seleccion de monedas
	private String monedas[]={"DOLARES","LIBRAS","YENES"};
	//datos de monedas
	
	
		public ConversorMonedas() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//etiquetas
		JLabel lblIntroducirUnValor = new JLabel("Introducir un valor entre 0 y 500 euros");
		lblIntroducirUnValor.setBounds(10, 22, 316, 14);
		contentPane.add(lblIntroducirUnValor);
		
		JLabel lblEuros = new JLabel("EUROS");
		lblEuros.setBounds(10, 47, 46, 14);
		contentPane.add(lblEuros);
		
		JLabel lblMensajeDeControl = new JLabel("Mensaje de control");
		lblMensajeDeControl.setBounds(10, 191, 220, 14);
		contentPane.add(lblMensajeDeControl);
		
		//cajas
		valorEuros = new JTextField();
		valorEuros.setBounds(10, 77, 86, 20);
		contentPane.add(valorEuros);
		valorEuros.setColumns(10);
		
		valorCambio = new JTextField();
		valorCambio.setBounds(10, 148, 86, 20);
		contentPane.add(valorCambio);
		valorCambio.setColumns(10);
		
		//cajaTexto control
		textoMsg = new JTextField();
		textoMsg.setEditable(false);
		textoMsg.setBounds(10, 216, 316, 20);
		contentPane.add(textoMsg);
		textoMsg.setColumns(10);
		
		//jcombox
		tiposMonedas = new JComboBox();
		tiposMonedas.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				tiposMonedas.getSelectedItem();
				
			}
		});
		
		tiposMonedas.setBounds(10, 108, 167, 20);
		contentPane.add(tiposMonedas);
		
		for (int i=0;i<monedas.length;i++)
		{
		tiposMonedas.addItem(monedas[i]);
}

         //boton
		boton = new JButton("CONVERTIR");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		boton.setBounds(200, 147, 126, 23);
		contentPane.add(boton);
		
		}
}

	


