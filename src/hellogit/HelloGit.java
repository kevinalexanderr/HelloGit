/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellogit;
    import java.util.Scanner;
/**
 *
 * @author Student
 */
public class HelloGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Your Name:");
        String name = input.nextLine();
        System.out.println("Hello "+ name);
    }
    
}
