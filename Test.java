import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		OperacionesSecuencia op = new OperacionesSecuencia ();
		Diezmacion d = new Diezmacion ();
		ArrayList <Par> arrA = new ArrayList <Par> ();
		ArrayList <Par> arrB = new ArrayList <Par> ();
		ArrayList <Par> arrC = new ArrayList <Par> ();
		/*for (int i = 0; i < 10; i++){
			arrA.add (new Par(i, i));
		}*/
		arrA.add (new Par (-2, 2));
		arrA.add (new Par (-1, 0));
		arrA.add (new Par (0, 3));
		arrA.add (new Par (1, 0.50));
		arrA.add (new Par (2, 4));
		arrA.add (new Par (3, 7));
		Interpolacion i = new Interpolacion ();
		System.out.println ("Arreglo antes de interpolar a 0:");
		op.imprimirArreglo (arrA);
		System.out.println ("Arreglo despues de interpolar a 0:");
		arrA = i.interpolacionEscalon(arrA, 2);
		op.imprimirArreglo (arrA);
		/*
		System.out.println ("Arreglo antes de diezmar 3:");
		op.imprimirArreglo (arrA);
		System.out.println ("Arreglo despues de diezmar 3:");
		arrB = d.diezmar (arrA, 3);
		op.imprimirArreglo (arrB);

		System.out.println ("Arreglo antes de diezmar 4:");
		op.imprimirArreglo (arrA);
		System.out.println ("Arreglo despues de diezmar 4:");
		arrB = d.diezmar (arrA, 4);
		op.imprimirArreglo (arrB);*/
	}
}