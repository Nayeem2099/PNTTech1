package practice;

public class TestTempConverter {
    public static void main(String[] args) {

        //USE CASE - tests one scenario, not all
        //from use case, you can have grab multiple test cases changing the options.
        //use case itself is a test case.
        //test data are the options you inserted (1) (12) and (2)

        //USE CASE EXAMPLE:

        //user launches the application --> user is able to see the welcome message and header
        //user chooses the conversion mode (1) ---> user will be asked the temp to convert
        //user enters the temp to convert (12) ---> user is able to get the temperature converted (53) and asked if he needs to convert other temperatures
        //user chooses either yes or no  (2) ---> user is able to see the "goodbye" message.

        //12c ---> 53f

        int tempToConvert = 12;
        int convertedTemp = 53;
        
        int actualConvertedTemp = 0;
        
        if (convertedTemp == actualConvertedTemp){
            System.out.println("test pass");
        } else{
            System.out.println("test fail");
        }

    }
}
