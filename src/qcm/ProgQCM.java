package qcm;

import qcm.models.QCM;
import qcm.models.Question;
import qcm.models.QuestionMultipleBonnesReponses;
import qcm.models.QuestionTexte;
import qcm.models.QuestionToujoursBonne;

public class ProgQCM {

	public static void main(String[] args) {
		QCM qcm=new QCM();
		Question q=new QuestionToujoursBonne();
		qcm.poser(q);
		
		Question q2=new QuestionTexte("Quelle est l'année de sortie de la première version de Java", "1995");
		qcm.poser(q2);
		
		Question q3=new QuestionMultipleBonnesReponses("PHP signifie", "Hypertext PreProcessor","Personal Home Page");
		qcm.poser(q3);
	}

}
