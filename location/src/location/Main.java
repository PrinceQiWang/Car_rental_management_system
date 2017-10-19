package location;

public class Main {

	public static void main(String args[]) {
		Moto m1 = new Moto("HONDA", 8);//Moto:Marque,Cylindree
		Moto m2 = new Moto("KAWAZAKI", 9);
		Auto a1 = new Auto("FERRARI Testarossa", "DE LUXE");//Auto:Marque,Type
		Auto a2 = new Auto("MAZDA MX5", "STANDARD");
		Auto a3 = new Auto("TOYOTA YARIS", "STANDARD");

		Exemplaire e1 = new Exemplaire(m1, 1, 10000);//Exemplaire:Vehicule,Numero,Course
		Exemplaire e2 = new Exemplaire(m1, 2, 20000);
		Exemplaire e3 = new Exemplaire(m1, 3, 30000);
		Exemplaire e4 = new Exemplaire(m2, 4, 5000);
		Exemplaire e5 = new Exemplaire(m2, 5, 8000);
		Exemplaire e6 = new Exemplaire(a1, 1, 10000);
		Exemplaire e7 = new Exemplaire(a1, 2, 20000);
		Exemplaire e8 = new Exemplaire(a1, 3, 30000);
		Exemplaire e9 = new Exemplaire(a2, 1, 10000);
		Exemplaire e10 = new Exemplaire(a3, 2, 20000);
		Exemplaire e11 = new Exemplaire(a3, 3, 30000);

		Emprunteur em1 = new Emprunteur("Wang", "Ziqi",
				new Adresse(33, "Rue des Blancs Murs", 94400, "Vitry-sur-Seine"));//L'information d'Emprunteur

		Date date_debut = new Date(1, 1, 2016);//Date debut
		Date date_stipuler = new Date(1, 2, 2016);//Date prevue de ramener
		Location l1 = em1.louer(e1, date_debut, date_stipuler,true);//Location：Exemplaire，Date debut，Date prevue de ramener，assurance
		Date date_fin = new Date(1, 2, 2016);//Date effectivement de rendre
		em1.ramener(e1, l1, date_fin,3,1,10000);//Ramener：Exemplaire，Commande，Date effectivement de rendre，Consommation de carburant  X/4, L'état de endommage du véhicule X/4,Course encore
		System.out.println(l1);//output Commande，la cout output avant Ramener est la Caution

		Flotte f = new Flotte();
		f.add(e1);
		f.add(e2);
		f.add(e3);
		f.add(e4);
		f.add(e5);
		f.add(e6);
		f.add(e7);
		f.add(e8);
		f.add(e9);
		f.add(e10);
		f.add(e11);
		System.out.print("\n");
		f.print();//输出车辆列表
	}
	/*
	 * 5 MOTOS HONDA 8 1 10000 HONDA 8 2 20000 HONDA 8 3 30000 KAWAZAKI 9 4 5000
	 * KAWAZAKI 9 5 8000 3 AUTOS DE LUXE FERRARI Testarossa 1 10000 FERRARI
	 * Testarossa 2 20000 FERRARI Testarossa 3 30000 3 AUTOS STANDARDS MAZDA MX5
	 * 1 10000 TOYOTA YARIS 2 20000 TOYOTA YARIS 3 30000
	 */
}
