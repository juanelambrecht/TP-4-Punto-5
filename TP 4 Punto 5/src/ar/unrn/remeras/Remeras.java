package ar.unrn.remeras;

public abstract class Remeras {

	String nombreRemera;
	double precioUnitario;
	
	public Remeras(String nombreRemera, double precioUnitario) {
		super();
		this.nombreRemera = nombreRemera;
		this.precioUnitario = precioUnitario;
	}

	public double calcularPrecioVenta() {
		double precioConRecargo = 0,precioTotal = 0;
		
		precioConRecargo = this.recargoYBonificacion(this.precioUnitario);
		
		precioTotal = recargoDeComercio(precioConRecargo);
		
		return precioTotal;
	}
	
	public abstract double recargoYBonificacion(double precioRemera);
	public abstract double recargoDeComercio(double precioRemera);
}
