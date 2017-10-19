package location;

public class Auto extends Vehicule {
	private String modele;

	public Auto(String marque, String modele) {
		super(marque);
		this.modele = modele;
		this.setCout(200);
		this.setPenalite(400);
		this.setAssurance(20);
	}

	@Override
	public String toString() {
		return super.getMarque();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((modele == null) ? 0 : modele.hashCode());
		return 2;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (modele == null) {
			if (other.modele != null)
				return false;
		} else if (!modele.equals(other.modele))
			return false;
		return true;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getType() {
		return "Autos " + modele;
	}
}
