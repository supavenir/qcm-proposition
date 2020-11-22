package qcm.models;

import java.util.Arrays;
import java.util.List;

public class QuestionMultipleBonnesReponses extends Question {
	private List<String> bonnesReponse;
	public QuestionMultipleBonnesReponses(String intitule,String ...strings) {
		super(intitule);
		bonnesReponse=Arrays.asList(strings);
	}

	@Override
	public boolean estValide(String response) {
		return bonnesReponse.indexOf(response)!=-1;
	}

}
