public class NullPointerExceptionProgram{

	public void demostrateException(String str){
		// Generate a NullPointerException
        try {
            System.out.println("The length of the string is: " + getLength(str));
        } catch (NullPointerException e) {
            System.out.println("Attempted to access a null object. " + e.getMessage());
        }
		
	}
    public static void main(String[] args){
        String str = null; // A string variable is declared but not initialized

        //Create the object of the the class NullPointerExceptionProgram
        NullPointerExceptionProgram NullPointerExceptionProgram = new NullPointerExceptionProgram();

		NullPointerExceptionProgram.demostrateException(str); 
    }

    // Method to get the length of a string
    public int getLength(String str){
        // This will throw NullPointerException if str is null
        return str.length();
    }
}