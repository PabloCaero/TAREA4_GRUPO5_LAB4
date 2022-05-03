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
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaContacto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFechaNac;
	private JTextField lblMostrar;

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
		setBounds(100, 100, 508, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//IMPORTANTE PONER TODO
		JLabel lblMostrar = new JLabel("");
		lblMostrar.setLabelFor(lblMostrar);
		lblMostrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMostrar.setBounds(146, 212, 336, 41);
		contentPane.add(lblMostrar);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(5, 7, 141, 41);
		lblNombre.setForeground(Color.BLACK);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(146, 7, 336, 41);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(287, 7, 141, 41);
		contentPane.add(label);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(5, 48, 141, 41);
		contentPane.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(146, 48, 336, 41);
		txtApellido.setColumns(10);
		contentPane.add(txtApellido);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(287, 48, 141, 41);
		contentPane.add(label_1);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono");
		lblTelfono.setBounds(5, 89, 141, 41);
		contentPane.add(lblTelfono);
		
		txtTelefono = new JTextField();
		txtTelefono.setForeground(new Color(0, 0, 0));
		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTelefono.setBounds(146, 89, 336, 41);
		txtTelefono.setColumns(10);
		
		contentPane.add(txtTelefono);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(287, 89, 141, 41);
		contentPane.add(label_2);
		
		JLabel lblFechaNac = new JLabel("Fecha de Nacimiento");
		lblFechaNac.setBounds(5, 130, 141, 41);
		contentPane.add(lblFechaNac);
		
		txtFechaNac = new JTextField();
		txtFechaNac.setBounds(146, 130, 336, 41);
		txtFechaNac.setColumns(10);

		contentPane.add(txtFechaNac);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(287, 130, 141, 41);
		contentPane.add(label_3);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(5, 171, 141, 41);
		contentPane.add(label_5);
		
		JButton btnMostrar = new JButton("Mostrar");
		
		
		btnMostrar.addActionListener(new ActionListener() {
			
			//EJERCICIO 1 - FUNCIONALIDAD
			public void actionPerformed(ActionEvent arg0) {
							
					
					
					if(txtApellido.getText().isEmpty()) {		
						txtApellido.setBackground(Color.RED); //ASI SE SETEA UN COLOR
						
					}
					else {
						txtApellido.setBackground(Color.WHITE);
					}
					
					if(txtNombre.getText().isEmpty()) {		
						txtNombre.setBackground(Color.RED); //ASI SE SETEA UN COLOR
					}
					else {
						txtNombre.setBackground(Color.WHITE);
					}
					
					
					if(txtFechaNac.getText().isEmpty()) {		
						txtFechaNac.setBackground(Color.RED); //ASI SE SETEA UN COLOR
					}
					else {
						txtFechaNac.setBackground(Color.WHITE);
					}
					
					
					if(txtTelefono.getText().isEmpty()  ) {		
						txtTelefono.setBackground(Color.RED); //ASI SE SETEA UN COLOR
						
					}
					else {
						txtTelefono.setBackground(Color.WHITE);

					}
					
					if( !txtTelefono.getText().matches("[+-]?\\d*(\\.\\d+)?") ) {		
						
						txtTelefono.setText("Formato invalido");
						}
					
                   
					
					//VALIDACION SOLO SI TODOS LOS CAMPOS ESTAN COMPLETOS
					if(!(txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtFechaNac.getText().isEmpty())) {
						lblMostrar.setText(txtApellido.getText() +" " + txtNombre.getText() + " - " + txtFechaNac.getText() + " - " + txtTelefono.getText()); 
						txtApellido.setText(null);
						txtNombre.setText(null);
						txtFechaNac.setText(null);
						txtTelefono.setText(null);	
					
						}

				
				
			}
		});
		
		btnMostrar.setBounds(146, 171, 336, 41);
		contentPane.add(btnMostrar);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(287, 171, 141, 41);
		contentPane.add(label_4);
		
		JLabel lblLosDatosIngresadosFueron = new JLabel("Datos Ingresados");
		lblLosDatosIngresadosFueron.setBounds(5, 212, 141, 41);
		contentPane.add(lblLosDatosIngresadosFueron);
		
		
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(287, 212, 141, 41);
		contentPane.add(label_6);
	}
}
