import java.util.ArrayList;

public class Convolucion 
{
	ArrayList <Par> arr;
 	ArrayList <Par> arr2;
	public Convolucion (ArrayList <Par> arr) 
	{
		this.arr = arr
	};
  	public Convolucion (ArrayList <Par> arr2) 
	{
		this.arr2 = arr2;
	};
	
	public ArrayList <Par> reflejar ()
	{
		for (Par p : arr){
			p.setPos(p.getPos() * (-1)); 
	}
		
	public ArrayList <Par> multiplicacion (ArrayList <Par> arr, ArrayList <Par> arr2)
	{
		int i = 0, aux = 0;
		ArrayList <Par> res = new ArrayList <Par> ();
		for (Par p : arr)
		{
			aux = op.getIndexOfPosition(arr2, p.getPos());
			if (aux != -1)
			{
				res.add (new Par (p.getPos(), p.getValor() * arrB.get(aux).getValor()));
			}
			else 
			{
				res.add (new Par (p.getPos(), 0));	
			}
		}
		for (Par p : arr2)
		{
			aux = op.getIndexOfPosition(res, p.getPos());
			if (aux == -1){
				res.add (new Par (p.getPos(), 0));
		}
	}
		
	public ArrayList <Par> desplazar (int n){
		n=arr.length
		if (n < 0){
			for (Par p : arr){
				p.setPos(p.getPos() + (n*-1)); 
			}
		}
		else {
			for (Par p : arr){
				p.setPos(p.getPos() - n); 
			}
		}
		return arr;
	}
	
}
