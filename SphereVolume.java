import java.util.Scanner;
public class SphereVolume
{
   public static void main(String[] args)
   {
       //Scanner object
       Scanner scanner=new Scanner(System.in);
       //Declare double variables diameter and volume
       double dia;
       double volume;
       System.out.println("CALCULATION OF VOLUME OF SPHERE");
      
       System.out.println("Enter diameter of sphere : ");
       //read diamter of the sphere
       dia=Double.parseDouble(scanner.nextLine());
      
       //calculate the radius of the sphere
       double radius=dia/2;
      
       //find the volume of the sphere
       volume=(4/3.0)*Math.PI*Math.pow(radius, 3.0);
       //print the volume of the sphere
       System.out.println("Volume of the sphere : "+volume);
      
   }//end of the main
  
}//end of the class