package location;

public class Moto extends Vehicule {
	private int cylindree;

	public Moto(String marque, int cylindree) {
		super(marque);
		this.cylindree = cylindree;
		this.setCout(100);
		this.setPenalite(200);
		this.setAssurance(10);
	}

	@Override
	public String toString() {
		return super.getMarque() + " " + cylindree;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + cylindree;
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		/*
		 * Moto other = (Moto) obj; if (cylindree != other.cylindree) return
		 * false;
		 */
		return true;
	}

	public int getCylindree() {
		return cylindree;
	}

	public void setCylindree(int cylindree) {
		this.cylindree = cylindree;
	}

	public String getType() {
		return "Motos ";
	}

}
