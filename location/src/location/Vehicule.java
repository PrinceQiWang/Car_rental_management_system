package location;

public abstract class Vehicule {
	private String marque;
	private double cout;
	private double penalite;
	private double assurance;

	public Vehicule(String m) {
		this.setMarque(m);
	}

	public Vehicule() {
	}

	
	@Override
	public String toString() {
		return "Vehicule [marque=" + marque + ", cout=" + cout + ", penalite=" + penalite + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marque == null) ? 0 : marque.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		/*
		 * if (marque == null) { if (other.marque != null) return false; } else
		 * if (!marque.equals(other.marque)) return false;
		 */
		return true;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public double getCout() {
		return cout;
	}

	public void setCout(double cout) {
		this.cout = cout;
	}

	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getPenalite() {
		return penalite;
	}

	public void setPenalite(double penalite) {
		this.penalite = penalite;
	}

	public double getAssurance() {
		return assurance;
	}

	public void setAssurance(double assurance) {
		this.assurance = assurance;
	}
	
}
