package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPromedio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtCondicion;
	private JComboBox<String> cbTPS;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPromedio frame = new VentanaPromedio();
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
	public VentanaPromedio() {
		setTitle("Promedio");
		setBounds(100, 100, 406, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setBounds(0, 0, 0, 0);
		contentPane.add(label);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setBounds(50, 86, 46, 14);
		contentPane.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(50, 111, 46, 14);
		contentPane.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setBounds(50, 136, 46, 14);
		contentPane.add(lblNota3);
		
		JLabel lblTPS = new JLabel("TPS");
		lblTPS.setBounds(50, 161, 46, 14);
		contentPane.add(lblTPS);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(109, 83, 108, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(109, 108, 108, 20);
		contentPane.add(txtNota2);
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		txtNota3.setBounds(109, 133, 108, 20);
		contentPane.add(txtNota3);
		
		cbTPS = new JComboBox<String>();
		cbTPS.setMaximumRowCount(2);
		cbTPS.setBounds(109, 158, 108, 20);
		//AGREGO LAS OPCIONES DE ROW
		cbTPS.addItem("Aprobado");
		cbTPS.addItem("Desaprobado");
		contentPane.add(cbTPS);
		
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(50, 305, 62, 14);
		contentPane.add(lblPromedio);
		
		JLabel lblCondicin = new JLabel("Condici\u00F3n:");
		lblCondicin.setBounds(50, 333, 62, 14);
		contentPane.add(lblCondicin);
		
		txtPromedio = new JTextField();
		txtPromedio.setColumns(10);
		txtPromedio.setBounds(109, 302, 108, 20);
		contentPane.add(txtPromedio);
		
		txtCondicion = new JTextField();
		txtCondicion.setColumns(10);
		txtCondicion.setBounds(109, 330, 108, 20);
		contentPane.add(txtCondicion);
		
		//FUNCIONALIDAD DEL EJERCICIO 2
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnCalcular.setBounds(267, 107, 97, 23);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setBounds(267, 132, 97, 23);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(267, 157, 97, 23);
		contentPane.add(btnSalir);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBorder(new TitledBorder(null, "Notas del Estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		horizontalBox.setBounds(26, 56, 222, 157);
		contentPane.add(horizontalBox);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setBorder(new TitledBorder(null, "Promedio y Condici\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		horizontalBox_1.setBounds(26, 266, 222, 112);
		contentPane.add(horizontalBox_1);
	}
}
