package qcm.models;

public class QuestionToujoursBonne extends Question {

	public QuestionToujoursBonne() {
		super("Cette question est tjrs bonne");
	}
	@Override
	public boolean estValide(String response) {
		return true;
	}

}
