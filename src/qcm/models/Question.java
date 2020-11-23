package qcm.models;
//Question 1
public abstract class Question {
	private String intitule;
	
	
	public double evaluer(EvaluationInterface evaluation) {
		return evaluation.evaluer(this);
	}
	
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
