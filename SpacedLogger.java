package weekFiveCodingAssignment;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String Log) {
		
		StringBuilder word = new StringBuilder();
		for (int i = 0; i < Log.length(); i++) { 
			if (i > 0) {
				word.append(" ");
			}
			word.append(Log.charAt(i));
		}
			
		System.out.println();
		System.out.println(word.toString());
		
		
		}
		
		
	

	@Override
	public void Error(String Error) {
		StringBuilder word = new StringBuilder();
		for (int i = 0; i < Error.length(); i++) { 
			if (i > 0) {
				word.append(" ");
			}
			word.append(Error.charAt(i));
		}
		System.out.println("ERROR: " + word.toString());
		
		
		
	}

}
