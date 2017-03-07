package packModelo;
public class Coordenada {

	private int fila;
	private int columna;

	/**
	 * 
	 * @param pFila
	 * @param pCol
	 */
	public Coordenada(int pFila, int pCol) {
		fila=pFila;
		columna=pCol;
	}
	public int getFila(){
		return fila;
		
	}
	public int getCol(){
		return columna;
	}
	public int crearCoordenada(int fila, int col){
		int coordenada=fila*10+col;
		return coordenada;
	}

}