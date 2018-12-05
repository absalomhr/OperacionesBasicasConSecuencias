import java.util.ArrayList;

public class Convolucion {
	ArrayList <Par> arr;
 	ArrayList <Par> arr2;
	public Convolucion (ArrayList <Par> arr) {
		this.arr = arr;
  	public Convolucion (ArrayList <Par> arr2) {
		this.arr2 = arr2;
	};
		
public ArrayList <Par> reflejar (){
		for (Par p : arr){
			p.setPos(p.getPos() * (-1)); 
		}
	
}
