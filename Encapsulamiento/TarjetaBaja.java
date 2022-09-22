package Encapsulamiento;

public class TarjetaBaja {

	private double saldoInicial;
	private static final double valorBoletoBondi = 21.50;
	private static final double valorBoletoSubte = 19.50;
	private int cantidadDeViajesBondi;
	private int cantidadDeViajesSubte;

	private void setSaldoInicial(double saldoInicial) {
		if (saldoInicial < 0)
			throw new Error("Saldo inicial incorrecto");
		this.saldoInicial = saldoInicial;
	}

	public TarjetaBaja(double saldoInicial) {
		setSaldoInicial(saldoInicial);
		this.cantidadDeViajesBondi = 0;
		this.cantidadDeViajesSubte= 0;
	}

	public TarjetaBaja() {
		this(0);
	}

	public double obtenerSaldo() {
		return this.saldoInicial;
	}

	public void cargar(double monto) {
		if (monto <= 0)
			throw new Error("Monto invalido");

		setSaldoInicial(this.obtenerSaldo() + monto);
	}

	public void pagarViajeEnColectivo() {
		if (saldoInicial < valorBoletoBondi)
			throw new Error("Saldo insuficiente");
		setSaldoInicial(this.obtenerSaldo() - valorBoletoBondi);
		cantidadDeViajesBondi++;
	}

	public void pagarViajeEnSubte() {
		if (saldoInicial < valorBoletoSubte)
			throw new Error("Saldo insuficiente");
		setSaldoInicial(this.obtenerSaldo() - valorBoletoSubte);
		cantidadDeViajesSubte++;
	}

	public int contarViajes() {
		return this.cantidadDeViajesBondi + this.cantidadDeViajesSubte;
	}

	public int contarViajesEnColectivo() {
		return cantidadDeViajesBondi;
	}

	public int contarViajesEnSubte() {
		return cantidadDeViajesSubte;
	}

	public static void main(String[] args) {

		TarjetaBaja miTarjeta = new TarjetaBaja(0);
		
		System.out.println(miTarjeta.obtenerSaldo());
		miTarjeta.cargar(41);
		System.out.println(miTarjeta.obtenerSaldo());
		miTarjeta.pagarViajeEnColectivo();
		miTarjeta.pagarViajeEnSubte();
		System.out.println(miTarjeta.obtenerSaldo());
		System.out.println(miTarjeta.contarViajesEnColectivo());
		System.out.println(miTarjeta.contarViajesEnSubte());
		System.out.println(miTarjeta.contarViajes());
		

	}

}
