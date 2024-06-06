/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grades;

import java.util.Scanner;

/**
 *
 * @author laila
 */
public class Grades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade:");
        int grade = scanner.nextInt();
        if (grade<70){
            System.out.println("Out of Range");
        }
        
        else if (grade <= 75){
            System.out.println("Failed");
        }
        
        else if (grade > 100){
            System.out.println("Out of Range");
        }
        
        else{
            System.out.println("Passed");
        }
        
        scanner.close();
    }
    
}
