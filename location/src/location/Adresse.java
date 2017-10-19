package location;

public class Adresse {
	private int numero;
	private String rue;
	private int CP;// Code Postal
	private String ville;

	public Adresse(int numero, String rue, int CP, String ville) {
		this.numero = numero;
		this.rue = rue;
		this.CP = CP;
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "" + numero + " " + rue + "," + ville +"," + CP +  "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CP;
		result = prime * result + numero;
		result = prime * result + ((rue == null) ? 0 : rue.hashCode());
		result = prime * result + ((ville == null) ? 0 : ville.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adresse other = (Adresse) obj;
		if (CP != other.CP)
			return false;
		if (numero != other.numero)
			return false;
		if (rue == null) {
			if (other.rue != null)
				return false;
		} else if (!rue.equals(other.rue))
			return false;
		if (ville == null) {
			if (other.ville != null)
				return false;
		} else if (!ville.equals(other.ville))
			return false;
		return true;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCP() {
		return CP;
	}

	public void setCP(int cP) {
		CP = cP;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
