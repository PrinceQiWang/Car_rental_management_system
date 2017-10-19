package location;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Flotte {
	private ArrayList<Exemplaire> list;
	private HashMap<Vehicule, Integer> type;

	public Flotte() {
		list = new ArrayList<Exemplaire>();
		type = new HashMap<Vehicule, Integer>();
	}

	public Flotte(Vehicules vehicules) {
		list = new ArrayList<Exemplaire>();
		type = new HashMap<Vehicule, Integer>();
	}

	@Override
	public String toString() {
		return "Flotte [list=" + list + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Flotte other = (Flotte) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public Vehicule containsKey(Vehicule vehicule) {
		for (Entry<Vehicule, Integer> entry : type.entrySet()) {
			Vehicule vehiculekey = entry.getKey();
			if (vehiculekey.equals(vehicule))
				return vehiculekey;
		}
		return null;
	}

	public void add(Exemplaire exemplaire) {
		Vehicule vehicule = exemplaire.getVehicule();

		if (!type.isEmpty()) {
			Vehicule vehiculekey = containsKey(vehicule);
			if (vehiculekey != null) {
				type.put(vehiculekey, type.get(vehiculekey) + 1);
			} else {
				type.put(vehicule, new Integer(1));
			}
		} else
			type.put(vehicule, new Integer(1));
		list.add(exemplaire);
	}

	public void print() {
		Iterator<Map.Entry<Vehicule, Integer>> it = type.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Vehicule, Integer> entry = it.next();
			Vehicule vehicule = entry.getKey();
			System.out.println(entry.getValue() + " " + vehicule.getType());
			for (Exemplaire exemplaire : list) {
				if (exemplaire.getVehicule().equals(vehicule))
					System.out.println(exemplaire);
			}
		}
	}

}
/*
 * import java.util.ArrayList; import java.util.HashMap;
 * 
 * public class Flotte { private ArrayList<Exemplaire> list; Flotte(){ list=new
 * ArrayList<Exemplaire>(); } public void add(Exemplaire e){ list.add(e); } }
 */
