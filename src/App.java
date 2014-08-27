
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrainingClass Class1 = new TrainingClass("Agility", "Copthorn", 25);
		
		TrainingClass Class2 = new TrainingClass("Walking on a Lead", "Bexhill", 50);
		
		Class2.getCourseDetails();
		Class2.setLocation("Hastings");
		Class2.getCourseDetails();
	}

}
