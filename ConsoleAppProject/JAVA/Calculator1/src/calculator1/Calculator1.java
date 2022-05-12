package calculator1;


import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
class Calculator{
    float a,b;
    Calculator(float a, float b){
        this.a=a;
        this.b=b;
    }
    float add(){return a+b;}
    float sub(){return a-b;}
    float mul(){return a*b;}
    float div(){return a/b;}
    float mod(){return a%b;}
    
}
public class Calculator1{
    public static void main(String args []){
        Scanner sr=new Scanner(System.in);
        System.out.print("Enter a : ");
        float a=sr.nextFloat();
        System.out.print("Enter b : ");
        float b=sr.nextFloat();
        System.out.print("Enter the operation (+,-,*,/,%) : ");
        String op=sr.next();
        float c=0;
        Calculator obj=new Calculator(a,b);
        switch(op){
            case "+": c=obj.add(); break;
            case "-": c=obj.sub(); break;
            case "*": c=obj.mul(); break;
            case "/": c=obj.div(); break;
            case "%": c=obj.mod(); break;
            default: System.out.println("Invalid operation");
        }
        System.out.println(a+op+b+"="+c);
    }
    
}
