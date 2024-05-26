/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema;

import static com.mycompany.problema.Utils.*;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Problema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipo;
        
        System.out.println("Dime un tipo de reptil");
        tipo = sc.nextLine();
        ComprobarReptil(tipo);
    }
}
