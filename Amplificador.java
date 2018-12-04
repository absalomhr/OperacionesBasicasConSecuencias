import javafx.util.Pair; 
import java.util.ArrayList;

public class Amplificador {
	ArrayList <Par> arr;
	public Amplificador (ArrayList <Par> arr) {
		this.arr = arr;
	};

	public ArrayList <Par> amplificarAtenuar (int constante){
		for (Par p : arr){
			p.setValor(p.getValor() * constante); 
		}
		return arr;
	}

	public ArrayList <Par> amplificarAtenuar (double constante){
		for (Par p : arr){
			p.setValor(p.getValor() * constante); 
		}
		return arr;
	}
}