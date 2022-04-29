package project;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VentanaMain extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton boton1, boton2, boton3;
	
	
	public VentanaMain()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 500, 500);
		setLayout(null);
		
		
		boton1 = new JButton();
		boton2 = new JButton();
		boton3 = new JButton();
		boton1.setText("Ejercicio 1");
		boton2.setText("Ejercicio 2");
		boton3.setText("Ejercicio 3");
		boton1.setBounds(170, 70, 140, 30);
		boton2.setBounds(170, 200, 140, 30);
		boton3.setBounds(170, 350, 140, 30);
		
		getContentPane().add(boton1);
		getContentPane().add(boton2);
		getContentPane().add(boton3);
		
	}
	
	
	public void cambiarVisibilidad(boolean estado) 
	{
		setVisible(true);
	}
	
}