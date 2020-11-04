package qcm.models;

public class ProgQCM {

	public static void main(String[] args) {
		QCM qcm=new QCM();
		Question q=new QuestionToujoursBonne();
		qcm.poser(q);
		
		Question q2=new QuestionTexte("Quelle est l'année de sortie de la première version de Java", "1995");
		qcm.poser(q2);
	}

}
