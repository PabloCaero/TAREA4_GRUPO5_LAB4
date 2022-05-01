package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaMain extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton boton1, boton2, boton3;
	private JFrame ventanaContacto;
	
	
	public VentanaMain(JFrame ventContacto)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setLayout(null);
		
		this.ventanaContacto = ventContacto;
		
		boton1 = new JButton();
		boton2 = new JButton();
		boton3 = new JButton();
		boton1.setText("Ejercicio 1");
		boton2.setText("Ejercicio 2");
		boton3.setText("Ejercicio 3");
		boton1.setBounds(170, 70, 140, 30);
		boton2.setBounds(170, 200, 140, 30);
		boton3.setBounds(170, 350, 140, 30);
		
		boton1.addActionListener(new EventoAbrirVentana(ventanaContacto));
		
		getContentPane().add(boton1);
		getContentPane().add(boton2);
		getContentPane().add(boton3);
		
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
