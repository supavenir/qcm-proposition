package qcm.models;

public class QuestionEntiere extends AbstractQuestionEntiere {

	public QuestionEntiere(String intitule, int reponse) {
		super(intitule, reponse);
	}

	@Override
	public boolean estValide(String response) {
		if (super.estValide(response)){
			int rep=Integer.parseInt(response);
			return rep==bonneReponse;
		}
		return false;
	}

}
