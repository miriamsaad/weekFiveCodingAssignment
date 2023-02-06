package weekFiveCodingAssignment;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String Log) {
		System.out.println("***" + Log + "***");
		
	}

	@Override
	public void Error(String Error) {
		for (int i = 0; i < Error.length() + 13; i++) {
		System.out.print("*");
		}
		System.out.println();
		System.out.println("***" + "Error: " + Error + "***");
		for (int i = 0; i < Error.length() + 13; i++) {
			System.out.print("*");
			}
		
		
		
	}
	
	
	
	

}
