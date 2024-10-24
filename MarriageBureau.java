package practiceprograms;

import java.util.Scanner;

class TooYoungException extends Exception {
    public TooYoungException(String message) {
        super(message);
    }
}

class TooOldException extends Exception {
    public TooOldException(String message) {
        super(message);
    }
}


public class MarriageBureau {
    
    public void registerApplicant(int age) throws TooYoungException, TooOldException {
        if (age < 18) {
            throw new TooYoungException("Applicant is too young to register for marriage. Minimum age is 18.");
        } else if (age > 40) {
            throw new TooOldException("Applicant is too old to register for marriage. Maximum age is 40.");
        } else {
            System.out.println("Applicant registered successfully.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MarriageBureau bureau = new MarriageBureau();

        System.out.print("Enter the age of the applicant: ");
        int age = scanner.nextInt();

        try {
            bureau.registerApplicant(age);
        } catch (TooYoungException | TooOldException e) {
            System.out.println("Registration failed: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
