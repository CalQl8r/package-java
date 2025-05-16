import calql8r.CalQl8R;

public class Main {
    

    public static void main(String[] args) {
        
        // Initialize CalQl8R object
        CalQl8R calculator = new CalQl8R();
        
        // Set the expression
        calculator.setExpression("5+1/4");

        // Get the answer
        String answer = calculator.getAnswer();
  
        // Print out the answer
        System.out.println(answer);
        
    }
}
