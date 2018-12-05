import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		OperacionesSecuencia op = new OperacionesSecuencia ();
		ArrayList <Par> arrA = new ArrayList <Par> ();
		ArrayList <Par> arrB = new ArrayList <Par> ();
		ArrayList <Par> arrC = new ArrayList <Par> ();
		for (int i = 0; i < 10; i++){
			arrA.add (new Par(i + 4, i));
			arrB.add (new Par(i, i));
		}
		Aritmetica a = new Aritmetica();
		System.out.println ("Arreglo A");
		op.imprimirArreglo (arrA);
		System.out.println ("Arreglo B");
		op.imprimirArreglo (arrB);
		System.out.println ("Arreglo suma");
		arrC = a.suma (arrA, arrB);
		op.ordenarPorPosicion (arrC);
		op.imprimirArreglo (arrC);

		System.out.println ("Arreglo resta");
		arrC = a.resta (arrA, arrB);
		op.ordenarPorPosicion (arrC);
		op.imprimirArreglo (arrC);

		System.out.println ("Arreglo multiplicacion");
		arrC = a.multiplicacion (arrA, arrB);
		op.ordenarPorPosicion (arrC);
		op.imprimirArreglo (arrC);
	}
}