
public enum Filo {
	CORDADO(true, true), OCTOPUS(false, true), ANERIDIOS(false, false);
	
	private boolean vertebrado, locomove;
	
	private Filo(boolean vertebrado, boolean locomove) {
		this.vertebrado = vertebrado;
		this.locomove = locomove;
	}

	public boolean isVertebrado() {
		return vertebrado;
	}

	public boolean getLocomove() {
		return locomove;
	}
	
}
