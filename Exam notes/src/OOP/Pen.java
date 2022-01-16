package OOP;

public class Pen {

    String type = "gel";
    String[] color = {"blue", "Green", "Red"};
    int point = 10;

    public static boolean clicked = false;
    public static boolean twisted = false;

    public static void click() {
        clicked = true;
    }

    public static void unclick() {
        clicked = false;
    }

    public static void twist(){
        if(twisted == false){
            twisted = true;
        }else if(twisted == true){
            twisted = false;
        }
    }

}
