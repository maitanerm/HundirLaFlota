package packModelo;
import java.util.Collection;

public abstract class Usuario {

	private int dinero = 500;
	private ColeccionArmamento armamento;
	private ColeccionBarcos flota;
	private Collection<Coordenada> registroDisparos;
	private int reparaciones = 10;
	private int usosRadar = 3;

	public Usuario() {
		// TODO - implement Usuario.Usuario
		throw new UnsupportedOperationException();
	}

	public void ponerBarcos() {
		// TODO - implement Usuario.ponerBarcos
		throw new UnsupportedOperationException();
	}

	private void reducirArmamento() {
		// TODO - implement Usuario.reducirArmamento
		throw new UnsupportedOperationException();
	}

	public void ponerEscudo() {
		// TODO - implement Usuario.ponerEscudo
		throw new UnsupportedOperationException();
	}

	private Escudo delEscudo() {
		// TODO - implement Usuario.delEscudo
		throw new UnsupportedOperationException();
	}

}