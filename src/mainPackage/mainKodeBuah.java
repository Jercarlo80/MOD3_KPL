/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class mainKodeBuah {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Buah : ");
        String bu = input.nextLine();
        System.out.println(KodeBuah.getKodeBuah(bu));
        input.close();
    }
}
