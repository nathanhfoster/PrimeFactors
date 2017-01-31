import java.util.concurrent.ThreadLocalRandom;

public class PrimeFactors {
    public static void main(String[] args) {
        int autoTotal = 1000;

        for(int i = 0; i < autoTotal; i++){
            // Generate random number 1 - autoTotal
            int randomNumber = ThreadLocalRandom.current().nextInt(1, autoTotal + 1);
            System.out.printf("Number: ", randomNumber);
            PrimeFactors(randomNumber, 2);
            System.out.printf("\n");
        }

    }
    private static void PrimeFactors(int n, int factor) {
        // Base case
        if (n < 2)
            return;

        // If factor divides the number evenly
        if (n % factor == 0){
            PrimeFactors(n / factor, factor);
            System.out.printf("%d\t", factor);
        }

        // Else increment and then return the factor
        else
            PrimeFactors(n, ++factor);
    }
}

/*
 * d : decimal integer   [byte, short, int, long] 
 * f : floating-point number    [float, double] 
 * s : String  Capital S will uppercase all the letters in the string  
 * h : hashcode A hashcode is like an address. This is useful for printing  a reference  
 * n : newline Platform specific newline character- use %n instead of \n for greater compatibility
 */