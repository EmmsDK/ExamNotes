package OOP;

public class Main {

    public static void main(String[] args) {

        Pen p1 = new Pen();

        System.out.println("Pen one is " + p1.color[0]);
        System.out.println("Pen one is " + p1.point);
        System.out.println("Pen one is " + p1.type + "\n");

        if (p1.clicked == true) {
            System.out.println("Watch out, pen is clicked already!");
        } else {
            System.out.println("Pen is not clicked");
        }

        p1.click();

        if (p1.clicked == true) {
            System.out.println(p1.clicked + " Pen is clicked\n");
        }


        Pen p2 = new Pen();

        System.out.println("\nPen two is " + p2.color[2]);
        System.out.println("Pen two is " + p2.point);
        System.out.println("Pen two is " + p2.type + "\n");

        if(p2.twisted == true){
            System.out.println("Watch out, pen is twisted already!");
        } else{
            System.out.println("Pen is not twisted");
        }

        p2.twist();

        if(p2.twisted == true){
            System.out.println(p2.twisted + " Pen is twisted");
        }

    }


}
