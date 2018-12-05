import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OperacionesSecuencia {

	public OperacionesSecuencia () {};

	public int getIndexOfPosition (ArrayList <Par> arr, int pos){ // Obtener indice de una posicion
		int i = 0;
		for (Par p : arr){
			if (p.getPos() == pos){
				return i;
			}
			i++;
		}
		return -1;
	}

	public void ordenarPorPosicion (ArrayList <Par> arr){ // Ordenar el arreglo por posicion
		Collections.sort(arr, new Comparator<Par>() {
	    @Override
	    public int compare(Par o1, Par o2) {
	        return o1.getPos() - o2.getPos();
	    }
});
	}

	public void imprimirArreglo (ArrayList <Par> arr){
		for (int i = 0; i < arr.size(); i++){
			System.out.println ("Posicion: " + arr.get (i).getPos() + " " + "Valor: " + arr.get (i).getValor());
		}
	}
}