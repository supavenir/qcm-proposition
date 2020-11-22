package qcm;

import qcm.models.QCM;
import qcm.models.Question;
import qcm.models.QuestionEntiere;
import qcm.models.QuestionEntiereMarge;
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
		
		Question q4=new QuestionEntiere("En quelle année somme nous ?",2020);
		qcm.poser(q4);
		
		Question q5=new QuestionEntiereMarge("Quelle est la hauteur de la tour Eiffel en m à 10% près ?",300,.1f);
		qcm.poser(q5);
	}

}
