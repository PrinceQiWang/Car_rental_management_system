package location;

public class Exemplaire {
	private static int num = 0;
	private int numero;
	private double kilometres;
	private double course;
	private Vehicule vehicule;
	// private Location location;
	private Emprunteur emprunteur;
	private int carburant = 0;
	/*
	 * 0 1   plein
	 * 1 3/4 du reservoir
	 * 2 1/2 du reservoir
	 * 3 1/4 du reservoir
	 * 4 0/4 vide
	 */
	private int etat = 0;
	/*
	 * 0 0    non endommage
	 * 1 1/4  endommage
	 * 2 1/2  endommage
	 * 3 3/4  endommage
	 * 4 1    endommage
	 */
	private static final int kilometres_Max = 180000;
	private int id;

	public Exemplaire(Vehicule vehicule, int numero, double kilometres) {
		this.vehicule = vehicule;
		this.numero = numero;
		this.kilometres = kilometres;
		this.id = num++;
	}

	@Override
	public String toString() {
		return vehicule + " " + numero + " " + kilometres;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + carburant;
		long temp;
		temp = Double.doubleToLongBits(course);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((emprunteur == null) ? 0 : emprunteur.hashCode());
		result = prime * result + etat;
		result = prime * result + id;
		temp = Double.doubleToLongBits(kilometres);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + numero;
		result = prime * result + ((vehicule == null) ? 0 : vehicule.hashCode());
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
		Exemplaire other = (Exemplaire) obj;
		if (carburant != other.carburant)
			return false;
		if (Double.doubleToLongBits(course) != Double.doubleToLongBits(other.course))
			return false;
		if (emprunteur == null) {
			if (other.emprunteur != null)
				return false;
		} else if (!emprunteur.equals(other.emprunteur))
			return false;
		if (etat != other.etat)
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(kilometres) != Double.doubleToLongBits(other.kilometres))
			return false;
		if (numero != other.numero)
			return false;
		if (vehicule == null) {
			if (other.vehicule != null)
				return false;
		} else if (!vehicule.equals(other.vehicule))
			return false;
		return true;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getKilometres() {
		return kilometres;
	}

	public void setKilometres(double kilometres) {
		this.kilometres = kilometres;
	}

	public double getCourse() {
		return course;
	}

	public void setCourse(double course) {
		this.course = course;
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public Emprunteur getEmprunteur() {
		return emprunteur;
	}

	public void setEmprunteur(Emprunteur emprunteur) {
		this.emprunteur = emprunteur;
	}

	public int getCarburant() {
		return carburant;
	}

	public void setCarburant(int carburant) {
		this.carburant = carburant;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public static int getKilometresMax() {
		return kilometres_Max;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
