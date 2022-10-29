package guipoo;

import javax.swing.JOptionPane;

import java.util.Scanner;

public final class Menu {
	 static String pedir;
	 static Scanner scanner = new Scanner(System.in);
	 
	 static GestorNotas n = new GestorNotas();
	 
	 public static void main(String[] args) {
		 int menu = 0; //menu 1
		 do {
	                String Menu = JOptionPane.showInputDialog(null,"***********************\nElige opción:\n" + 
	                                                "\n1.- Agregar nueva nota\n" +
	                                                "\n2.- Buscar nota\n" +
	                                                "\n3.- Eliminar nota\n" +
	                                                "\n4.- Editar nota\n"+
													"\n5.- Salir\n************************");
	                menu = Integer.parseInt(Menu);
	                switch(menu){					
					case 1:
						n.agregar();
						break;
					case 2:
						n.buscar();
						break;
					case 3:
						n.editar();
						break;
					case 4:
						n.eliminar();
						break;						
					default: 
						JOptionPane.showMessageDialog(null,"Salir");
						}
		 }while (menu<5);
	 }
}
