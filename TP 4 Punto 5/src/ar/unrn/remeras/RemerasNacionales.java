package ar.unrn.remeras;

public class RemerasNacionales extends Remeras{

	public RemerasNacionales(String nombreRemera, double precioUnitario) {
		super(nombreRemera, precioUnitario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double recargoYBonificacion(double precioRemera) {
		double recargoTransporte = 0.015,bonificacion= 0.20;
		
		double precioConRecargo = precioRemera + (precioRemera * recargoTransporte) - (precioRemera * bonificacion);
		
		return precioConRecargo;
	}

	@Override
	public double recargoDeComercio(double precioRemera) {
		double recargoComercio = 0.15;
		double precioConRecargo = precioRemera + (precioRemera * recargoComercio);
		
		return precioConRecargo;
	}

}
