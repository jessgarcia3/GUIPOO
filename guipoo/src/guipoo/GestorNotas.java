package guipoo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public final class GestorNotas {
	private ArrayList<Notas> notas;
	
	public GestorNotas() {
		notas = new ArrayList<Notas>();
	}
	public boolean agregar() {
		String nombrenota = JOptionPane.showInputDialog(null, "Titulo:", "Nueva nota", JOptionPane.QUESTION_MESSAGE);
		String textonota = JOptionPane.showInputDialog(null, "Texto:", JOptionPane.QUESTION_MESSAGE);

		Notas nuevaNota = new Notas(nombrenota, textonota);
		return notas.add(nuevaNota);
	}
	
	public boolean buscar() {
		String nombrenota =JOptionPane.showInputDialog(null,"Introduzca titulo de la nota: ", "Mostrar nota",JOptionPane.QUESTION_MESSAGE);
        Notas nota=null;
        for (int i=0;i<notas.size();i++){
            if(notas.get(i).getNombrenota().equals(nombrenota)){
                nota=notas.get(i);
                nota.mostrar();
            }
        }
        if(nota ==null){
            JOptionPane.showMessageDialog(null, "No se encuentra nota con el titulo:\n"+nombrenota,
                    "Nota no encontrada", JOptionPane.WARNING_MESSAGE);
            return false;
        }
		return false;
	}
	public boolean editar() {
		String nombrenota = JOptionPane.showInputDialog(null, "Introduzca el titulo de la nota que desea editar:", "Editar nota", JOptionPane.QUESTION_MESSAGE);

		Notas nota = null;
		for (int i = 0; i < notas.size(); i++){
			if (notas.get(i).getNombrenota().equals(nombrenota)) {
				nota = notas.get(i);
				break;
			}
		}
		
		if (nota == null) {
			JOptionPane.showMessageDialog(null, "No se encuentra una nota con ese titulo:\n" + nombrenota,
					"Nota no encontrada", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		else {
			nota.setNombrenota(JOptionPane.showInputDialog(null, "Titulo actual: " + nota.getNombrenota()
			+ "\nIntroduzca nuevo titulo:", "Modificar nota", JOptionPane.QUESTION_MESSAGE));
			nota.setTextonota(JOptionPane.showInputDialog(null, "Texto actual: " + nota.getTextonota()
				+ "\nIntroduzca nuevo texto:", "Modificar texto", JOptionPane.QUESTION_MESSAGE));
			return true;
		}
	}
	
	public boolean eliminar() {
		String nombrenota = JOptionPane.showInputDialog(null, "Introduzca titulo de la nota a eliminar",
				"Eliminar nota", JOptionPane.QUESTION_MESSAGE);
		
		Notas nota = null;
		for (int i = 0; i < notas.size(); i++){
			if (notas.get(i).getNombrenota().equals(nombrenota))
				nota = notas.remove(i);
		}
		
		if (nota == null) {
			JOptionPane.showMessageDialog(null, "No se encuentra nota con el titulo:\n" + nombrenota,
					"Nota no encontrada", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		else {
			JOptionPane.showMessageDialog(null, "Se elimino la nota con el titulo:\n" + nombrenota,
					"Nota eliminada", JOptionPane.INFORMATION_MESSAGE);
			return true;
		}
	}

}
