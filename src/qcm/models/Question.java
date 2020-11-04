package qcm.models;

public abstract class Question {
	private String intitule;
	
	
	public abstract boolean estValide(String response);

	public String getIntitule() {
		return intitule;
	}


	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
}
