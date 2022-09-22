package FigurasGeometricas;

public class CoronaCircular {

	private double radioMayor;
	private double radioMenor;
	
	public CoronaCircular (double radioMayor, double radioMenor) {
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}
	
	public double getRadioMayor () {
		return radioMayor;
	}
	
	public double getRadioMenor() {
		return radioMenor;
	}
	
	public double getArea () {
		return Math.PI * (getRadioMayor() - getRadioMenor());
	}
	
	public double getPerimetroMayor(){
		return 2 * Math.PI * getRadioMenor();
	}
	
	public double getPerimetroMenor(){
		return 2 * Math.PI * getRadioMayor(); 
	}
	
	
	public static void main(String[] args) {
		
		CoronaCircular coronita = new CoronaCircular (4, 2);
		
		System.out.println(coronita.getRadioMayor());
		System.out.println(coronita.getRadioMenor());
		System.out.println(coronita.getPerimetroMayor());
		System.out.println(coronita.getPerimetroMenor());
		System.out.println(coronita.getArea());
	}

}
