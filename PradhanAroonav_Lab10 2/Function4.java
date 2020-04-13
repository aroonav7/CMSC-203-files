public class Function4 extends Function
{
   @Override
   public double fnValue(double x)
   {
       double fun3 = (8*x-Math.sqrt(x))/(Math.pow(x,3)
               - (7*Math.pow(x,2)) + 15*x - 9);
       /*
       * where the function goes to zero, which will
       * of course, make function #3 undefined
       */
       if(fun3<=0)
           return x;
       else
           return fun3;
   }  
   public String toString () {
   return "(8*x-sqrt(x))/x^3 - 7*x^2 + 15*x – 9 {INFINITY}";
   }  
}