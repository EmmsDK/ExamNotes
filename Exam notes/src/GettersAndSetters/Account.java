package GettersAndSetters;

public class Account {


    static String name;
    static int age;

    public static void main(String[] args) {

        Account a = new Account();

        a.setAge(21);
        a.setName("Emilio");

        System.out.println(age);
        System.out.println(name);
        a.printDetails();
    }


    static String printDetails() {
        System.out.println(name + " , " + age);
        return null;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(int age) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
