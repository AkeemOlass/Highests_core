import java.util.Scanner;

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
     * @param name
     * @param score
     * @param lrgscore
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
