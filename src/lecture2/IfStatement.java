package lecture2;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your raw score: ");
        int rawScore = scanner.nextInt();

        String letterGrade;
        if (rawScore >= 90 && rawScore <= 100) {
            letterGrade = "[A] your score is good";
        } else if (rawScore >= 80 && rawScore <= 90) {
            letterGrade = "[B] your score is ok";
        } else if (rawScore >= 70 && rawScore <= 80) {
            letterGrade = "[C] your should work hard";
        } else {
            letterGrade = "[D] you failed";
        }

        System.out.println(letterGrade);

    }

}
