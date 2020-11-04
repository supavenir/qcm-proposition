package qcm.models;
//Question 1
public abstract class Question {
	private String intitule;
	
	
	public Question(String intitule) {
		this.intitule=intitule;
	}

	public abstract boolean estValide(String response);

	public String getIntitule() {
		return intitule;
	}


	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
}
