package qcm.models;

public class QuestionTexte extends Question {
	private String bonneReponse;
	public QuestionTexte(String intitule,String bonneReponse) {
		super(intitule);
		this.bonneReponse=bonneReponse;
	}

	@Override
	public boolean estValide(String reponse) {
		return this.bonneReponse.equals(reponse);
	}

}
