package Quiz3;
import java.util.ArrayList;
import Quiz3.OtroClass2;

public class OtroClass {
	private ArrayList lista = new ArrayList();
	public void OtroClass() {
	}
	
	public ArrayList setElement(ArrayList pLista, int pElem) {
	
		pLista = new OtroClass2().getLista(pLista, pElem);
		
		this.lista=pLista;
		return lista;
	}
	
	public ArrayList getLista() {
		return lista;
	}
	

}
