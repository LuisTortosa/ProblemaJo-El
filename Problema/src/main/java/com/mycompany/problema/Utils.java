/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Utils {
    
    static List<String> reptils = new ArrayList();
    
    
    public static void afegirReptils(){
        reptils.add("serpiente");
        reptils.add("tortuga");
        reptils.add("cocodrilo");
        reptils.add("tuátara");
        reptils.add("caiman");
                
    }
    
    
    public static boolean ComprobarReptil(String tipo){
        boolean esReptil = false;
        afegirReptils();
        
        
        if (reptils.contains(tipo.toLowerCase())){
            System.out.println("El tipo " + tipo + " es un tipo de reptil");
            esReptil = true;
        }else{
            System.out.println("El tipo " + tipo + " no es un tipo de reptil");
        }
        
        
        return esReptil;
    }
}
