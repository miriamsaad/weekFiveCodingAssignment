package weekFiveCodingAssignment;



public class App {

	

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		logger.Log("Hello");
		logger.Error("Goodbye");
		
		
		
		Logger logger2 = new SpacedLogger();
		logger2.Log("Goodbye");
		logger2.Error("Hello");
		

	}

}
