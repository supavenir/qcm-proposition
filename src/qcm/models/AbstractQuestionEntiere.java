package qcm.models;

public class AbstractQuestionEntiere extends Question{
	protected int bonneReponse;
	public AbstractQuestionEntiere(String intitule,int reponse) {
		super(intitule);
		bonneReponse=reponse;
	}

	@Override
	public boolean estValide(String response) {
		try{
			Integer.parseInt(response);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}

}
