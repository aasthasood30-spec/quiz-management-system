

import java.util.Scanner;

public class Quizapp {
    static char getAnswer(Scanner input) {
        char ans = input.next().charAt(0);

        while (ans != 'a' && ans != 'b' && ans != 'c' && ans != 'd') {
            System.out.println("Invalid option! Please enter A, B, C, or D.");
            System.out.print("Pick an option: ");
            ans = input.next().charAt(0);
        }

        return ans;
    }
    public static void main(String[] args) {

        questions_answers questions = new questions_answers();
        questions_answers answers = new questions_answers();

        Scanner input = new Scanner(System.in);

        char ans;
        int correct = 0, wrong = 0;
     
        
        questions.question1();
        System.out.print("\nPick an option: ");
        ans = getAnswer(input); 
        

        if (ans == answers.answer1) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();


        
        questions.question2();
        System.out.print("\nPick an option: ");
        ans = getAnswer(input); 
        

        if (ans == answers.answer2) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();


    
        questions.question3();
        System.out.print("\nPick an option: ");
        ans = getAnswer(input); 
        

        if (ans == answers.answer3) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();


        
        questions.question4();
        System.out.print("\nPick an option: ");
        ans = getAnswer(input); 
        

        if (ans == answers.answer4) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();



        questions.question5();
        System.out.print("\nPick an option: ");
        ans = getAnswer(input); 
        

        if (ans == answers.answer5) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();


        questions.question6();
        System.out.print("\nPick an option: ");
        ans = getAnswer(input); 
        

        if (ans == answers.answer6) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();


        
        questions.question7();
        System.out.print("\nPick an option: ");
        ans = getAnswer(input); 
        

        if (ans == answers.answer7) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();


        
        questions.question8();
        System.out.print("\nPick an option: ");
        ans = getAnswer(input); 
        
        
        if (ans == answers.answer8) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();


        
        questions.question9();
        System.out.print("\nPick an option: "); 
        ans = getAnswer(input); 
       

        if (ans == answers.answer9) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();


        
        questions.question10();
        System.out.print("\nPick an option: ");
        ans = getAnswer(input); 
       

        if (ans == answers.answer10) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println();


    
        double percentage = ((double) correct / 10) * 100;

        System.out.println("========== RESULT ==========");
        System.out.println("The total marks are : 100");
        System.out.println("Your marks are : " + correct * 10);
        System.out.println("Total questions are : 10");
        System.out.println("Your correct answers are : " + correct);
        System.out.println("Your wrong answers are : " + wrong);
        System.out.println("Your percentage is : " + percentage + "%");

        input.close();
    }
}


class questions_answers {

    void question1() {
        System.out.println(
            "Q1 What is the orange part of an egg called?\n" +
            "A) Yolk\n" +
            "B) Shell\n" +
            "C) Albumen\n" +
            "D) Chalaza"
        );
    }

    void question2() {
        System.out.println(
            "Q2 How many legs do insects have?\n" +
            "A) Four\n" +
            "B) Six\n" +
            "C) Eight\n" +
            "D) Ten"
        );
    }

    void question3() {
        System.out.println(
            "Q3 What is a baby kangaroo called?\n" +
            "A) Cub\n" +
            "B) Pup\n" +
            "C) Joey\n" +
            "D) Calf"
        );
    }

    void question4() {
        System.out.println(
            "Q4 What is the closest planet to the Sun?\n" +
            "A) Venus\n" +
            "B) Mars\n" +
            "C) Mercury\n" +
            "D) Earth"
        );
    }

    void question5() {
        System.out.println(
            "Q5 In which country can you find the Eiffel Tower?\n" +
            "A) Italy\n" +
            "B) Spain\n" +
            "C) France\n" +
            "D) Germany"
        );
    }

    void question6() {
        System.out.println(
            "Q6 How many days are there in a year?\n" +
            "A) 365\n" +
            "B) 366\n" +
            "C) 360\n" +
            "D) 364"
        );
    }

    void question7() {
        System.out.println(
            "Q7 How many players are in a soccer team?\n" +
            "A) Nine\n" +
            "B) Eleven\n" +
            "C) Ten\n" +
            "D) Twelve"
        );
    }

    void question8() {
        System.out.println(
            "Q8 Where do polar bears live?\n" +
            "A) Antarctica\n" +
            "B) The Arctic\n" +
            "C) Greenland\n" +
            "D) Iceland"
        );
    }

    void question9() {
        System.out.println(
            "Q9 Which is faster, light or sound?\n" +
            "A) Light\n" +
            "B) Sound"
        );
    }

    void question10() {
        System.out.println(
            "Q10 How many letters are in the English alphabet?\n" +
            "A) Twenty-four\n" +
            "B) Twenty-five\n" +
            "C) Twenty-six\n" +
            "D) Twenty-seven"
        );
    }


    // Answer Key
    char answer1 = 'a';
    char answer2 = 'b';
    char answer3 = 'c';
    char answer4 = 'c';
    char answer5 = 'c';
    char answer6 = 'a';
    char answer7 = 'b';
    char answer8 = 'b';
    char answer9 = 'a';
    char answer10 = 'c';
}