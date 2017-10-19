package location;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {
	private int jour;
	private int mois;
	private int annee;
	//private int[] m={31,28,31,30,31,30,31,31,30,31,30,31};
	public Date(int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
		
	}
	
	public int compare(Date date)//Compter la date
	{
		String date1=this.jour+"-"+this.mois+"-"+this.annee;	
		String date2=date.getJour()+"-"+date.getMois()+"-"+date.getAnnee();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Calendar cal=Calendar.getInstance();
		try {
			cal.setTime(sdf.parse(date1));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long time1=cal.getTimeInMillis();
		try {
			cal.setTime(sdf.parse(date2));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long time2=cal.getTimeInMillis();
		long days=(time2-time1)/(1000*3600*24);
		/*
		if(date.getMois()-this.getMois()==0)
		{
			n=n+date.getJour()+365*(date.getAnnee()-this.annee)-this.jour;
		}	
		else
		{
			int i=date.getMois()-2;
			if(date.getMois()<this.getMois())
				i=i+12*(date.getAnnee()-this.annee);
			for(;i>this.getMois()+1;i--)
			{
				n=n+m[i%12];
			}
		n=n+date.getJour()+m[this.mois-1]-this.jour;
		}*/
		return Integer.parseInt(String.valueOf(days));
	}

	@Override
	public String toString() {
		return "" + jour + "-" + mois + "-" + annee + "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + annee;
		result = prime * result + jour;
		result = prime * result + mois;
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
		Date other = (Date) obj;
		if (annee != other.annee)
			return false;
		if (jour != other.jour)
			return false;
		if (mois != other.mois)
			return false;
		return true;
	}
	
	public int getJour() {
		return jour;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
}
