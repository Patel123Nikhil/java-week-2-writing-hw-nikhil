package java_writing_homework;
/*Write a Java programme using the following steps.
        * 3.1 Declare one instance and one static variable.
        * 3.2 Declare one instance method.
        * 3.3 Declare one static method.
        * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
        * 3.5 Declare the Main method.
        * 3.6 Call both instance and static methods into the Main method and run the programme.*/


public class Prg3 {
    //3.1 Declare one instance and one static variable.
    String name = "Prime";
    static String surname = "Testing";

    //3.2 Declare one instance method.
    //3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod() {
        System.out.println(name);
        System.out.println(Prg3.surname);
    }

    //3.3 Declare one static method.
    //3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    public static void staticMethod() {
        Prg3  prg3 = new Prg3();
        System.out.println(prg3.name);
        System.out.println(surname);
    }

    //3.5 Declare the Main method.
    //3.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Prg3 prg3 = new Prg3();
        prg3.instanceMethod();
        staticMethod();
    }
}



