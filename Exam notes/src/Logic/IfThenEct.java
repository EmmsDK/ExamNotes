package Logic;

public class IfThenEct {

    public static void main(String[] args) {

        // Basic If Statement
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        // Else Statement

        int time = 20;
        if (time < 18) {
            System.out.println("Good Day Mate");
        } else {
            System.out.println("Good Evening Gentleman");
        }   // Output "Good Evening Gentleman

        // Else if Statement
        int minutes = 22;
        if (minutes < 10) {
            System.out.println("Good morning");
        } else if (minutes < 20) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }   // Output "Good evening"

        int day = 4;

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }   //Output "Thursday" (day 4)

    }

}
