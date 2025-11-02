package com.janvier;

import java.util.Scanner;

public class NFASimulator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input: ");
        String input = scanner.nextLine();
        
        // Check if string contains "ab" as substring
        boolean isAccepted = input.contains("ab");
        
        if (isAccepted) {
            System.out.println("Output: Accepted");
        } else {
            System.out.println("Output: Rejected");
        }
        
        scanner.close();
    }
}
