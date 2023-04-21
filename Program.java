package student;

import student.Statistics;

public class Program {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Ungenügende Anzahl Parameter");
            return;
        } 
        
        String command = args[0];
        
        int[] numbers = new int[args.length - 1];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(args[i + 1]);
        }
        
        switch (command) {
            case "min":
                System.out.println("Minimum: " + Statistics.min(numbers));  
                break;
            
            case "max":
                System.out.println("Maximum: " + Statistics.max(numbers));  
                break;
                
            case "mw":
                System.out.printf("Mittelwert: %.2f", Statistics.mean(numbers));  
                break;
                
            case "saw":
                System.out.printf("Standardabweichung: %.4f", Statistics.stddev(numbers));  
                break;
                
            default: 
                System.out.println("Unbekannte Operation");
            
        }
    }
}