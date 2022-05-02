package project;

import java.awt.Font;

import javax.swing.JLabel;

public class Principal {

	public static void main(String[] args) {
		
		VentanaContacto ventContacto = new VentanaContacto();
		VentanaPromedio ventPromedio = new VentanaPromedio();
		
		VentanaMain ven = new VentanaMain(ventContacto ,ventPromedio);
		ven.getContentPane().setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		ven.getContentPane().setLayout(null);
		
	
		ven.cambiarVisibilidad(true);

	}


}
