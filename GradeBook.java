/*Author: Aroonav Pradhan
 *Date: 02/20/20
 *Lab 6
 */
//Import required header files

import java.util.ArrayList;

//Declare the class GradeBook

public class GradeBook

{

      //Declare the local variables

      private double[] scores;

      private int scoresSize;

   

      public GradeBook(int capacity)

      {

            scores = new double[capacity];

            scoresSize = 0;

      }

      

      public boolean addScore(double score)

      {

            if (scoresSize < scores.length)

            {

                  scores[scoresSize] = score;

                  scoresSize++;

                  return true;

            }

            else

                  return false;     

      }

     

      public double sum()

      {

            double total = 0;

            for (int i = 0; i < scoresSize; i++)

            {

                  total = total + scores[i];

            }

            return total;

      }

     

      public double minimum()

      {

            if (scoresSize == 0) return 0;

            double smallest = scores[0];

            for (int i = 1; i < scoresSize; i++)

            {

                  if (scores[i] < smallest)

                  {

                        smallest = scores[i];

                  }

            }

            return smallest;

      }

    

      public double finalScore()

      {

            if (scoresSize == 0)

                  return 0;

            else if (scoresSize == 1)

                  return scores[0];

            else

                  return sum() - minimum();

      }

  //Implement the method to return the scores size

      public int getScoreSize()

      {

            return scoresSize;

      }

      //Implement the method toString()

      public String toString()

      {

            String result="";

            for (int i=0;i<scoresSize;i++)

            {

                  result+=scores[i]+" ";

            }

            return result;

      }

}
