package location;

public class Location {
	private static int num = 1;
	private int numero;
	private Date debut;
	private Date fin;
	private Date stipuler;
	private Emprunteur Emprunteur;
	private Exemplaire Exemplaire;
	private boolean ramener;
	private boolean assurance;

	public Location(Date date_debut, Date date_stipuler, Emprunteur Emprunteur, Exemplaire Exemplaire,
			boolean assurance) {
		this.numero = num++;
		this.debut = date_debut;
		this.fin = date_debut;
		this.stipuler = date_stipuler;
		this.Emprunteur = Emprunteur;
		this.Exemplaire = Exemplaire;
		this.ramener = false;
		this.assurance = assurance;
	}

	public double cout() {
		double cout = 0;// Cout
		double penalite = 0;// penalite
		double consommation = 0;// consommation
		double restauration = 0;// restauration
		double assurance = 0;// assurance
		if (ramener) {
			cout = debut.compare(stipuler) * Exemplaire.getVehicule().getCout();
			penalite = stipuler.compare(fin) * Exemplaire.getVehicule().getPenalite();
			consommation = Exemplaire.getCarburant() * 30;// 30 par 1/4
			restauration = Exemplaire.getEtat() * 1000;// 1000 par 1/4
			assurance = debut.compare(fin) * Exemplaire.getVehicule().getAssurance();
			if (this.assurance)
				cout = cout + penalite + consommation + assurance;// avec Assurance
			else
				cout = cout + penalite + consommation + restauration;// sans Assurance
		} else {
			cout = debut.compare(stipuler) * Exemplaire.getVehicule().getCout();
			consommation = Exemplaire.getCarburant() * 30;// 30 par 1/4
			restauration = Exemplaire.getEtat() * 1000;// 1000 par 1/4
			assurance = debut.compare(stipuler) * Exemplaire.getVehicule().getAssurance();
			if (this.assurance)
				cout = (cout + consommation + assurance) * 0.5;// avec Assurance
			else
				cout = (cout + consommation + restauration) * 0.5;// sans Assurance
		}
		return cout;
	}

	@Override
	public String toString() {
		return "No." + numero + "\nDebut:" + debut + "\nStipuler:" + stipuler + "\n"
				+ (this.ramener ? "Fin:" + fin + "\n\n" : "Le vehicule ne rend pas.\n") + "Assurance:" + this.assurance
				+ "\nEmprunteur:\n" + Emprunteur + "\n\nVehicule:\n" + Exemplaire + "\nCourse:" + Exemplaire.getCourse()
				+ "\nCout:" + cout() + " ";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Emprunteur == null) ? 0 : Emprunteur.hashCode());
		result = prime * result + ((Exemplaire == null) ? 0 : Exemplaire.hashCode());
		result = prime * result + ((debut == null) ? 0 : debut.hashCode());
		result = prime * result + ((fin == null) ? 0 : fin.hashCode());
		result = prime * result + numero;
		result = prime * result + (ramener ? 1231 : 1237);
		result = prime * result + ((stipuler == null) ? 0 : stipuler.hashCode());
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
		Location other = (Location) obj;
		if (Emprunteur == null) {
			if (other.Emprunteur != null)
				return false;
		} else if (!Emprunteur.equals(other.Emprunteur))
			return false;
		if (Exemplaire == null) {
			if (other.Exemplaire != null)
				return false;
		} else if (!Exemplaire.equals(other.Exemplaire))
			return false;
		if (debut == null) {
			if (other.debut != null)
				return false;
		} else if (!debut.equals(other.debut))
			return false;
		if (fin == null) {
			if (other.fin != null)
				return false;
		} else if (!fin.equals(other.fin))
			return false;
		if (numero != other.numero)
			return false;
		if (ramener != other.ramener)
			return false;
		if (stipuler == null) {
			if (other.stipuler != null)
				return false;
		} else if (!stipuler.equals(other.stipuler))
			return false;
		return true;
	}

	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		Location.num = num;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDebut() {
		return debut;
	}

	public void setDebut(Date debut) {
		this.debut = debut;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public Date getStipuler() {
		return stipuler;
	}

	public void setStipuler(Date stipuler) {
		this.stipuler = stipuler;
	}

	public Emprunteur getEmprunteur() {
		return Emprunteur;
	}

	public void setEmprunteur(Emprunteur emprunteur) {
		Emprunteur = emprunteur;
	}

	public Exemplaire getExemplaire() {
		return Exemplaire;
	}

	public void setExemplaire(Exemplaire exemplaire) {
		Exemplaire = exemplaire;
	}

	public boolean isRendre() {
		return ramener;
	}

	public void setRendre(boolean ramener) {
		this.ramener = ramener;
	}

	public boolean isAssurance() {
		return assurance;
	}

	public void setAssurance(boolean assurance) {
		this.assurance = assurance;
	}
}
