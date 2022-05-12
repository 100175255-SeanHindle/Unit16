/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 100175255
 */
public class Main {
    public static void main(String[] args){
        Calculator2 c1 = new Calculator2();
        Calculator2 c2 = new Calculator2();
        
        c1.name = "Addition";
        c2.name = "Modulo";
        
        System.out.println(c1.name + " calculated "+ c1.add(65, 86));
        System.out.println(c2.name + " calculated "+ c2.modulus(67, 12));
        
    }
    
}
