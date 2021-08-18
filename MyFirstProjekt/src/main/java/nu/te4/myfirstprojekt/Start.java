/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.myfirstprojekt;
import java.util.Scanner;

/**
 *
 * @author Elev
 */
public class Start {
private String name;
    public static void main(String[] args){
        System.out.println("Start");
        Scanner input = new Scanner (System.in);
        System.out.println("Ange namn: ");
        String name = input.next ();
        System.out.println("Ange HP");
        int dmg = input.nextInt();
        System.out.println(String.format("Hej %s du har %d HP.", name, HP));
    }
    
  
}


