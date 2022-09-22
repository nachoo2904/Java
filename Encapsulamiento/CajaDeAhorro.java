package Encapsulamiento;

public class CajaDeAhorro {
	
	private String titularDeLaCuenta;
	private double saldo;
	
	public CajaDeAhorro(String titularDeLaCuenta, double saldo) { 
		this.titularDeLaCuenta = titularDeLaCuenta;
		this.saldo = saldo;
	}
    

	public String obtenerTitular() { 
    	return titularDeLaCuenta;
    }

    
    public double consultarSaldo() { 
    	return saldo;
    }

   
    public void depositar(double monto) {
    	if (monto < 0)
    		throw new Error ("Monto invalido");
    	saldo += monto;
    }
 
   
    public void extraer(double monto) { 
    	 if(monto>0 && monto<=saldo) 
    		saldo -= monto;
    	 
    	 else throw new Error ("Fondos insuficientes y/o monto ingresado invalido");
    }


	public static void main(String[] args) {
		
		CajaDeAhorro Juanito = new CajaDeAhorro ("Juan Perez", 0);
		System.out.println(Juanito.titularDeLaCuenta);
		System.out.println(Juanito.consultarSaldo());
		Juanito.depositar(5000);
		System.out.println(Juanito.consultarSaldo());
		Juanito.extraer(6000);
		System.out.println(Juanito.consultarSaldo());
	}

}
