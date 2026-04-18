import java.util.Scanner;
import javax.swing.JOptionPane;

public class filter_functions {
    public static boolean div_zero=false;
    public static double parseFraction(String input) {
        if (input.contains("/")) {
            String[] parts = input.split("/");
            if (parts.length == 2) {
                try {
                    double numerator = Double.parseDouble(parts[0].trim());
                    double denominator = Double.parseDouble(parts[1].trim());
                    if (denominator != 0) {
                        return numerator / denominator;
                    } else {
                        System.out.println("Invalid. Division by zero");
                        JOptionPane.showMessageDialog(null, "Division by Zero");
                        div_zero=true;
                        return Double.NaN;
                    }
                } catch (NumberFormatException e) {
                    
                    return Double.NaN;
                }
            } else {
                
                return Double.NaN;
            }
        } 
        
        /*else if(input.contains("pi/")||input.contains("/pi")){
            if(input.equalsIgnoreCase("pi/")){
                String[] p = input.split("/");
                
            }s
        }*/
        else {
            try {
                return Double.parseDouble(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + input);
                return Double.NaN;
            }
        }
    }
    
    public static boolean isValidFractionOrDouble(String input) {
        if (input.contains("/")) {
            return input.matches("\\d+/\\d+");
        } else {
            return new Scanner(input).hasNextDouble();
        }
    }
    
}