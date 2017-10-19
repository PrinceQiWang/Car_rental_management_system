package location;

public class Emprunteur {
	private static int num = 0;
	private int id;
	private String nom;
	private String prenom;
	private Adresse adresse;

	public Emprunteur(String nom, String prenom, Adresse adresse) {
		this.id = num++;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public Location louer(Exemplaire exemplaire, Date date_debut, Date date_stipuler,boolean assurance) {
		Location location = new Location(date_debut, date_stipuler, this, exemplaire,assurance);
		exemplaire.setEmprunteur(this);
		return location;
	}

	public void ramener(Exemplaire exemplaire, Location location, Date date_fin,int carburant,int etat,double kilometres) {
		exemplaire.setCarburant(carburant);
		exemplaire.setEtat(etat);
		location.setFin(date_fin);
		location.setRendre(true);
		exemplaire.setCourse(kilometres);
		exemplaire.setKilometres(exemplaire.getKilometres()+kilometres);
	}

	@Override
	public String toString() {
		return nom + " " + prenom + " " + adresse + "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + id;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
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
		Emprunteur other = (Emprunteur) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (id != other.id)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
}
