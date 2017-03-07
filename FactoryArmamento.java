package packModelo;
public abstract class FactoryArmamento {

	private static FactoryArmamento miFactoryArmamento;

	private FactoryArmamento() {
		// TODO - implement FactoryArmamento.FactoryArmamento
		throw new UnsupportedOperationException();
	}

	public static FactoryArmamento getFactoryArmamento() {
		// TODO - implement FactoryArmamento.getFactoryArmamento
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pTipo
	 */
	public Armamento crearArma(String pTipo) {
		// TODO - implement FactoryArmamento.crearArma
		throw new UnsupportedOperationException();
	}

}