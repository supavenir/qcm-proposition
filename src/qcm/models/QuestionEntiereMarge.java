package qcm.models;

public class QuestionEntiereMarge extends AbstractQuestionEntiere {
	private float marge;
	public QuestionEntiereMarge(String intitule, int reponse,float marge) {
		super(intitule, reponse);
		this.marge=marge;
	}

	@Override
	public boolean estValide(String response) {
		if (super.estValide(response)){
			int rep=Integer.parseInt(response);
			return rep>=(1-marge)*bonneReponse && rep<=(1+marge)*bonneReponse;
		}
		return false;
	}

}
