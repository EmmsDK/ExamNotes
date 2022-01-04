package Exeptions;

public class Main {

    public static void main(String[] args) {
        try{
            int[] myNums = {1,2,3};
            System.out.println(myNums[10]);
        } catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}

