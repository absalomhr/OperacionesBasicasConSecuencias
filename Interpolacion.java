import java.util.ArrayList;

public class Interpolacion {
	public Interpolacion () {}

	public ArrayList <Par> interpolacionLineal (ArrayList <Par> arr){
		return arr;
	}

	public ArrayList <Par> interpolacionCero (ArrayList <Par> arr, int k){
		if (k == 1) return arr;
		ArrayList <Par> res = new ArrayList <Par> ();
		for (Par p : arr){
			res.add (p);
			for (int i = 0; i < k - 1; i++){
				res.add (new Par (-10000, 0));
			}
		}
		OperacionesSecuencia op = new OperacionesSecuencia();
		arr = op.completarIndices (res);
		return arr;
	}

	public ArrayList <Par> interpolacionEscalon (ArrayList <Par> arr, int k){
		if (k == 1) return arr;
		ArrayList <Par> res = new ArrayList <Par> ();
		for (Par p : arr){
			res.add (p);
			for (int i = 0; i < k - 1; i++){
				res.add (new Par (-10000, p.getValor()));
			}
		}
		OperacionesSecuencia op = new OperacionesSecuencia();
		arr = op.completarIndices (res);
		return arr;
	}
}