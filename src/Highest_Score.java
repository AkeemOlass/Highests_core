/**
 * GNU GENERAL PUBLIC LICENSE
 Version 3, 29 June 2007
 Copyright (C) 2014  Author Akeem Prince Olass.
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.
 *

 */
import java.util.Scanner;
/**Adds two random numbers*/
public class Highest_Score {
    public static void main(String[] args) {
        /** Prompts user to enter number of students, each students name and score
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of students ");
        int num_students = input.nextInt();
        String name_of_student = "";
        String prev_name = name_of_student;

        int count = 0 ;
        float Largestscore = 0 ;
        System.out.println("Please enter each students' name and score ");
        while (
                count < num_students) {
            name_of_student = input.next();
            float score = input.nextFloat();
            count++;
            System.out.println(count + " student entered " + (num_students - count) + " to go");

            H_score(name_of_student, score, Largestscore, prev_name);
            Largestscore = score;
            prev_name = name_of_student;
        }

             ;


         }



/** Computes the highest score by comparing the new score with the current highest
     * score
     * @param name name of student entered
     * @param score score of student of name
     * @param lrgscore it holds the score of the previous student initialize to zero for first entry
     */


    public static float H_score(String name, float score,float lrgscore, String prev_name) {
        float hscore = lrgscore;
        // new score > current highest score?
        if (score > lrgscore) {

            System.out.println("The highest score is " + name + " with " + score);
        }
         else {

            System.out.println("The highest score is not " + name + " with " + score );
            System.out.println("The highest score is " + prev_name + " with " + lrgscore);

        }

        return lrgscore;

    }
}
