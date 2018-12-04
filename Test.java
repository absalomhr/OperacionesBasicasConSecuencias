import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList <Par> arr = new ArrayList <Par> ();
		for (int i = 0; i < 10; i++){
			arr.add (new Par(i, i*2));
		}
		System.out.println ("Arreglo antes de ampli: ");
		imprimirArreglo (arr);
		System.out.println ("Arreglo despues de ampli * 0.5: ");
		arr = new Amplificador (arr).amplificarAtenuar (0.5);
		imprimirArreglo (arr);
	}

	public static void imprimirArreglo (ArrayList <Par> arr){
		for (int i = 0; i < arr.size(); i++){
			System.out.println ("Posicion: " + arr.get (i).getPos() + " " + "Valor: " + arr.get (i).getValor());
		}
	}
}