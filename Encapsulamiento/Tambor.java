package Encapsulamiento;

public class Tambor {

	 private int posicion;

	    public Tambor() {

	        posicion = 1;
	    }
	   
	    public int obtenerPosicion() { 

	        return posicion;
	    }

	    public void girar() { 
	    	
	        double aleatorio = Math.random();
	        posicion = (int) (aleatorio * 8) + 1;
	    }
	    
	    public String toString () {
	    	return "[" + obtenerPosicion() + "]";
	    }
	
	    public static void main(String[] args) {
			Tambor timba = new Tambor ();
			
	    	timba.girar();
	    	
	    	System.out.println(timba);
	    
		}
	    
}
