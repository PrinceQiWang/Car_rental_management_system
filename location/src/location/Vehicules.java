package location;

import java.util.ArrayList;
import java.util.List;

public class Vehicules {
	private List<Vehicule> list;

	public Vehicules() {
		list=new ArrayList<Vehicule>();
	}

	public void add(Vehicule v) {
		getList().add(v);
	}

	public List<Vehicule> getList() {
		return list;
	}

	public void setList(ArrayList<Vehicule> list) {
		this.list = list;
	}

}
