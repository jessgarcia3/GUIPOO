package guipoo;
import javax.swing.JOptionPane;

public final class Notas {
	private String nombrenota;
	private String textonota;
	
	public Notas(String nombrenota, String textonota){
		this.nombrenota = nombrenota;
		this.textonota = textonota;

    }

	public String getNombrenota() {
		return nombrenota;
	}

	public void setNombrenota(String nombrenota) {
		this.nombrenota = nombrenota;
	}

	public String getTextonota() {
		return textonota;
	}

	public void setTextonota(String textonota) {
		this.textonota = textonota;
	}

	public void mostrar(){
        String mensaje = "Nombre de la nota:"+nombrenota+"Texto:"+textonota;
	JOptionPane.showMessageDialog(null, mensaje, "Mostrar personal administrativo", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
