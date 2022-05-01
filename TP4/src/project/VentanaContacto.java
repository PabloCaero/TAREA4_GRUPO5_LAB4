package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;

public class VentanaContacto extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldTelefono;
	private JTextField textFieldFechaNac;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaContacto frame = new VentanaContacto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void cambiarVisibilidad(boolean estado) 
	{
		setVisible(true);
	}
	/**
	 * Create the frame.
	 */
	public VentanaContacto() {
		setTitle("Contactos");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setBounds(79, 30, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(79, 58, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono");
		lblTelfono.setBounds(79, 83, 46, 14);
		contentPane.add(lblTelfono);
		
		JLabel lblFechaNac = new JLabel("Fecha Nac");
		lblFechaNac.setBounds(76, 113, 63, 14);
		contentPane.add(lblFechaNac);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(153, 27, 136, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(153, 55, 136, 20);
		contentPane.add(textFieldApellido);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setColumns(10);
		textFieldTelefono.setBounds(153, 80, 136, 20);
		contentPane.add(textFieldTelefono);
		
		textFieldFechaNac = new JTextField();
		textFieldFechaNac.setColumns(10);
		textFieldFechaNac.setBounds(153, 110, 136, 20);
		contentPane.add(textFieldFechaNac);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(204, 158, 89, 23);
		contentPane.add(btnMostrar);
	}
}
