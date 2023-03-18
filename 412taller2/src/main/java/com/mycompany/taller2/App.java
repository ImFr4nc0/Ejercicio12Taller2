/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller2;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class App {

    public static void main(String[] args) {
        double nh,v,s,e1,e2;
        String name;
        
        Scanner ent=new Scanner(System.in);
        System.out.print("ingresa tu nombre: ");
        name = ent.nextLine();
        System.out.print("Ingrese el numero de horas:");
        nh=ent.nextDouble();
        System.out.print("Ingrese el valor de la hora");
        v=ent.nextDouble();
        e1=nh-48;
        e2=nh-e1-40;
        nh=nh-e1-e2;
        s=(nh*v)+(e2*2*v)+(e1*3*v);
        System.out.println("EL TRABAJADOR "+name+"DEVENGÓ: $"+s);
    }
}
