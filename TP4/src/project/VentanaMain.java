package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class VentanaMain extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton boton1, boton2, boton3;
	private JFrame ventanaContacto;
	private JFrame ventanaPromedio;
	
	
	public VentanaMain(JFrame ventContacto ,JFrame ventPromedio)
	{
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 13));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 244, 227);
		getContentPane().setLayout(null);
		
		this.ventanaContacto = ventContacto;
		this.ventanaPromedio = ventPromedio;
		
		boton1 = new JButton();
		boton2 = new JButton();
		boton3 = new JButton();
		boton1.setText("Ejercicio 1");
		boton2.setText("Ejercicio 2");
		boton3.setText("Ejercicio 3");
		boton1.setBounds(46, 59, 140, 30);
		boton2.setBounds(46, 100, 140, 30);
		boton3.setBounds(46, 141, 140, 30);
		
		boton1.addActionListener(new EventoAbrirVentana(ventanaContacto));
		boton2.addActionListener(new EventoAbrirVentana(ventanaPromedio));
		
		getContentPane().add(boton1);
		getContentPane().add(boton2);
		getContentPane().add(boton3);
		
		JLabel lblGrupo = new JLabel("Grupo 5");
		lblGrupo.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrupo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGrupo.setBounds(89, 22, 57, 26);
		getContentPane().add(lblGrupo);
		
	}
	
	
	public void cambiarVisibilidad(boolean estado) 
	{
		setVisible(true);
	}
}

class EventoAbrirVentana implements ActionListener {
	
	private JFrame ventana;
	
	public EventoAbrirVentana (JFrame ventana) {
		this.ventana = ventana;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ventana.setVisible(true);
	}
}
