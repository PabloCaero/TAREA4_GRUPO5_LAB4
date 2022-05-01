package project;

import java.awt.Font;

import javax.swing.JLabel;

public class Principal {

	public static void main(String[] args) {
		
		VentanaContacto ventContacto = new VentanaContacto();
		
		VentanaMain ven = new VentanaMain(ventContacto);
		ven.getContentPane().setFont(new Font("Yu Gothic", Font.PLAIN, 12));
		ven.getContentPane().setLayout(null);
		
		JLabel lblGrupo = new JLabel("Grupo 5");
		lblGrupo.setFont(new Font("Sitka Subheading", Font.PLAIN, 18));
		lblGrupo.setBounds(20, 23, 87, 31);
		ven.getContentPane().add(lblGrupo);
		ven.cambiarVisibilidad(true);

	}


}
