package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaSO extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private ButtonGroup bg = new ButtonGroup();
	//private ButtonGroup bg2 = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSO frame = new VentanaSO();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaSO() {
		setTitle("Seleccion Multiple");
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBorder(new LineBorder(new Color(0, 0, 0)));
		horizontalBox.setBounds(31, 11, 379, 66);
		contentPane.add(horizontalBox);
		
		JLabel lblElijeUnaEspecialidad = new JLabel("      Elije un sistema operativo");
		horizontalBox.add(lblElijeUnaEspecialidad);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		horizontalBox.add(rdbtnWindows);
		
		bg.add(rdbtnWindows);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		horizontalBox.add(rdbtnMac);
		bg.add(rdbtnMac);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		horizontalBox.add(rdbtnLinux);
		bg.add(rdbtnLinux);
		
		JRadioButton rdbtnProgramacion = new JRadioButton("Programacion");
		rdbtnProgramacion.setBounds(239, 112, 109, 23);
		contentPane.add(rdbtnProgramacion);
		
		JRadioButton rdbtnAdministracion = new JRadioButton("Administracion");
		rdbtnAdministracion.setBounds(239, 137, 144, 23);
		contentPane.add(rdbtnAdministracion);
		
		JRadioButton rdbtnDiseoGrafico = new JRadioButton("Dise\u00F1o Grafico");
		rdbtnDiseoGrafico.setBounds(239, 163, 109, 23);
		contentPane.add(rdbtnDiseoGrafico);
		
		/*bg2.add(rdbtnProgramacion);
		bg2.add(rdbtnAdministracion);
		bg2.add(rdbtnDiseoGrafico);*/
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		horizontalBox_1.setBounds(31, 90, 379, 112);
		contentPane.add(horizontalBox_1);
		
		JLabel lblElijeUnaEspecialidad_1 = new JLabel("        Elije una especialidad");
		horizontalBox_1.add(lblElijeUnaEspecialidad_1);
		
		JLabel lblCantidadDeHoras = new JLabel("Cantidad de horas en el computador");
		lblCantidadDeHoras.setBounds(45, 235, 189, 14);
		contentPane.add(lblCantidadDeHoras);
		
		textField = new JTextField();
		textField.setBounds(244, 232, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//FUNCIONALIDAD EJERCICIO 3
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String Mensaje;				
				Mensaje = "Debe seleccionar y llenar los campos solicitados";
				
				//COMBINACIONES POSIBLES LINUX										
				if(rdbtnLinux.isSelected()) {										
					if(rdbtnProgramacion.isSelected() && rdbtnAdministracion.isSelected() == false && rdbtnDiseoGrafico.isSelected()==false) {
						Mensaje = "Linux - Programación - " + textField.getText() + " HS";							
					}
					
					if(rdbtnAdministracion.isSelected() && rdbtnProgramacion.isSelected() == false && rdbtnDiseoGrafico.isSelected()==false) {
						Mensaje = "Linux - Administración - " + textField.getText() + " HS";							
					}
					
					if(rdbtnDiseoGrafico.isSelected() && rdbtnAdministracion.isSelected() == false && rdbtnProgramacion.isSelected()==false) {
						Mensaje = "Linux -Diseño Grafico - " + textField.getText() + " HS";							
					}
										
					if(rdbtnProgramacion.isSelected() && rdbtnAdministracion.isSelected() && rdbtnDiseoGrafico.isSelected()==false) {
						Mensaje = "Linux - Programación - Administración - " + textField.getText() + " HS";							
					}
					
					if(rdbtnProgramacion.isSelected() && rdbtnDiseoGrafico.isSelected() && rdbtnAdministracion.isSelected() == false) {
						Mensaje = "Linux - Programación - Diseño Gráfico - " + textField.getText() + " HS";							
					}
					
					if(rdbtnAdministracion.isSelected() && rdbtnDiseoGrafico.isSelected() && rdbtnProgramacion.isSelected() == false) {
						Mensaje = "Linux - Administración - Diseño Gráfico - " + textField.getText() + " HS";							
					}
													
					if(rdbtnProgramacion.isSelected() && rdbtnAdministracion.isSelected() && rdbtnDiseoGrafico.isSelected()) {
						Mensaje = "Linux - Programación - Administración - Diseño Gráfico - " + textField.getText() + " HS";							
					}																	
				}
				
				
				//COMBINACIONES POSIBLES WINDOWS
				if(rdbtnWindows.isSelected()) {					
					if(rdbtnProgramacion.isSelected() && rdbtnAdministracion.isSelected() == false && rdbtnDiseoGrafico.isSelected()==false) {
						Mensaje = "Windows - Programación - " + textField.getText() + " HS";							
					}
					
					if(rdbtnAdministracion.isSelected() && rdbtnProgramacion.isSelected() == false && rdbtnDiseoGrafico.isSelected()==false) {
						Mensaje = "Windows - Administración - " + textField.getText() + " HS";							
					}
					
					if(rdbtnDiseoGrafico.isSelected() && rdbtnAdministracion.isSelected() == false && rdbtnProgramacion.isSelected()==false) {
						Mensaje = "Windows -Diseño Grafico - " + textField.getText() + " HS";							
					}
										
					if(rdbtnProgramacion.isSelected() && rdbtnAdministracion.isSelected() && rdbtnDiseoGrafico.isSelected()==false) {
						Mensaje = "Windows - Programación - Administración - " + textField.getText() + " HS";							
					}
					
					if(rdbtnProgramacion.isSelected() && rdbtnDiseoGrafico.isSelected() && rdbtnAdministracion.isSelected() == false) {
						Mensaje = "Windows - Programación - Diseño Gráfico - " + textField.getText() + " HS";							
					}
					
					if(rdbtnAdministracion.isSelected() && rdbtnDiseoGrafico.isSelected() && rdbtnProgramacion.isSelected() == false) {
						Mensaje = "Windows - Administración - Diseño Gráfico - " + textField.getText() + " HS";							
					}
													
					if(rdbtnProgramacion.isSelected() && rdbtnAdministracion.isSelected() && rdbtnDiseoGrafico.isSelected()) {
						Mensaje = "Windows - Programación - Administración - Diseño Gráfico - " + textField.getText() + " HS";							
					}									
				}
				
				//COMBINACIONES POSIBLES MAC
				if(rdbtnMac.isSelected()) {					
					if(rdbtnProgramacion.isSelected() && rdbtnAdministracion.isSelected() == false && rdbtnDiseoGrafico.isSelected()==false) {
						Mensaje = "Mac - Programación - " + textField.getText() + " HS";							
					}
					
					if(rdbtnAdministracion.isSelected() && rdbtnProgramacion.isSelected() == false && rdbtnDiseoGrafico.isSelected()==false) {
						Mensaje = "Mac - Administración - " + textField.getText() + " HS";							
					}
					
					if(rdbtnDiseoGrafico.isSelected() && rdbtnAdministracion.isSelected() == false && rdbtnProgramacion.isSelected()==false) {
						Mensaje = "Mac -Diseño Grafico - " + textField.getText() + " HS";							
					}
										
					if(rdbtnProgramacion.isSelected() && rdbtnAdministracion.isSelected() && rdbtnDiseoGrafico.isSelected()==false) {
						Mensaje = "Mac - Programación - Administración - " + textField.getText() + " HS";							
					}
					
					if(rdbtnProgramacion.isSelected() && rdbtnDiseoGrafico.isSelected() && rdbtnAdministracion.isSelected() == false) {
						Mensaje = "Mac - Programación - Diseño Gráfico - " + textField.getText() + " HS";							
					}
					
					if(rdbtnAdministracion.isSelected() && rdbtnDiseoGrafico.isSelected() && rdbtnProgramacion.isSelected() == false) {
						Mensaje = "Mac - Administración - Diseño Gráfico - " + textField.getText() + " HS";							
					}
													
					if(rdbtnProgramacion.isSelected() && rdbtnAdministracion.isSelected() && rdbtnDiseoGrafico.isSelected()) {
						Mensaje = "Mac - Programación - Administración - Diseño Gráfico - " + textField.getText() + " HS";							
					}							
				}
				
				JOptionPane.showMessageDialog(null,Mensaje,"Mensaje", JOptionPane.INFORMATION_MESSAGE);		
				
			}
		});
		btnAceptar.setBounds(294, 277, 89, 23);
		contentPane.add(btnAceptar);
	}
}
