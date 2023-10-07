package main.java.AparelhoCelular;

public abstract class Celular {
	protected boolean ligado;

	public Celular(boolean ligado) {
		this.ligado = false;
	}
	
	public boolean isLigado() {
		return ligado;
	}
	
	abstract public void ligarAparelho();
	
	abstract public void desligar();
}
