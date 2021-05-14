package ar.unrn.remeras;

public class RemerasImportadas extends Remeras{

	public RemerasImportadas(String nombreRemera, double precioUnitario) {
		super(nombreRemera, precioUnitario);
	}

	@Override
	public double recargoYBonificacion(double precioRemera) {
	
		double impuestoAduanero = 0.05,recargoSobrePrecio = 0.03;
		double precioConRecargo = precioRemera + (precioRemera * recargoSobrePrecio) + (precioRemera * impuestoAduanero);
		
		return precioConRecargo;
	}

	@Override
	public double recargoDeComercio(double precioRemera) {
		
		double recargoComercio = 0.25;
		double precioConRecargo = precioRemera + (precioRemera * recargoComercio);
		
		return precioConRecargo;
	}

}
