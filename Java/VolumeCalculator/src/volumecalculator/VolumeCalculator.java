/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package volumecalculator;

/**
 *
 * @author 100175255
 */
import java.util.*; 
public class VolumeCalculator {
    double volCube=0;
    double volSphere=0;
    double volCuboid=0;
    
    void vol(int side)
    {
        volCube = side*side*side;
        System.out.println("Vol of cube is:  "+ volCube);
    } 
    
    
    void vol(float radius)
    {
        volSphere = (4/3)*(22/7)*radius*radius*radius;
        System.out.println("Vol of sphere is: "+ volSphere);
    }
    
    void vol(int length, int breadth, int height)
    {
        volCuboid = length * breadth * height;
        System.out.println("Vol of cube is: "+ volCuboid);
    }
    
    
    public static void main(String[] args) {
        
        int side;
        int length;
        int breadth;
        int height;
        
        float radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input side of cube");
        side = sc.nextInt();
        System.out.println("Input radius of sphere");
        radius = sc.nextFloat();
        System.out.println("Input the length, breadth and height of the cuboid");
        
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();
        
        VolumeCalculator obj=new VolumeCalculator();
        
        obj.vol(side);
        obj.vol(radius);
        obj.vol(length, breadth, height);
        
    }
    
}
