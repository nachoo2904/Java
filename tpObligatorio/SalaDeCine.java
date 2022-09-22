package tpObligatorio;

public class SalaDeCine {


    private boolean [][] sala;
    private int cantidad = 0;

    public SalaDeCine(int butacas, int filas) {
        this.sala = new boolean [filas] [butacas];
    }

    public boolean estaOcupada(int fila, int asiento) {
        return this.sala [fila][asiento];
    }

    public void ocuparButaca(int fila, int asiento) {
            if (!sala [fila][asiento]) {
            sala [fila] [asiento] = true;
            cantidad++;}
        else 
            throw new Error ("La butaca ya esta ocupada");
    }

    public int cantidadDeButacasOcupadas() {
        return cantidad;

    }
    boolean hayEspacioPara(int cantidadDePersonas) {
        int fila = 0;
        boolean existeEspacio = false;
        while (!existeEspacio && fila < sala.length) {
            existeEspacio = espacioEnFila(fila, cantidadDePersonas);
            fila++;
        }
        return existeEspacio;

    }



  boolean espacioEnFila(int fila, int cantidadDePersonas) {
	  int contadorLugaresLibres = 0;
	  int j = 0;
	  while (contadorLugaresLibres < cantidadDePersonas && j < sala[fila].length) {

		  if (sala[fila][j]) {
			contadorLugaresLibres = 0;
      } 	else {
          		contadorLugaresLibres++;
      }
		  j++;
  }
	  return (contadorLugaresLibres >= cantidadDePersonas);
}



	public static void main(String[] args) {

	SalaDeCine cine1 = new SalaDeCine (5, 5);
	cine1.ocuparButaca(3, 4);
	cine1.ocuparButaca (3, 2);
	cine1.ocuparButaca (3, 1);

	System.out.println(cine1.estaOcupada(2, 4));
    System.out.println(cine1.estaOcupada(3, 1));
    System.out.println(cine1.estaOcupada(4, 1));

    System.out.println(cine1.cantidadDeButacasOcupadas());

    System.out.println(cine1.hayEspacioPara(5));
    System.out.println(cine1.hayEspacioPara(7));
    System.out.println(cine1.espacioEnFila(3, 4));
    System.out.println(cine1.espacioEnFila(3, 1));

}
}