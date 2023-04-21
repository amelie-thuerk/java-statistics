package student;

public class Statistics {
    public static int min(int[] numbers) {
        
        int minNumber = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        
        return minNumber;
    }
    
    public static int max(int[] numbers) {
        
        int maxNumber = numbers[0];
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        
        return maxNumber;
    }

    public static double mean(int[] numbers) {
        
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        double mean = (double) sum / numbers.length;
        
        return mean;   
    }
    
    public static double stddev(int[] numbers) {
        
        double sumOfSquares = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            sumOfSquares += Math.pow(numbers[i] - mean(numbers), 2);
        }
        
        double variance = sumOfSquares / numbers.length;
        double standardDeviation = Math.sqrt(variance);
        
        return standardDeviation;
    }
}