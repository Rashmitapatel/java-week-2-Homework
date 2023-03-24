package homeWork;
/*Write a Java programme using the following steps.
        4.1 Declare two instance and two static variables.
        4.2 Declare one instance method.
        4.3 Declare one static method.
        4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
        4.5 Declare the Main method.
        4.6 Call both instance and static methods into the Main method and run the programme.*/

public class programmeNo_4 {
    // 4.1 Declare two instance and two static variables.
    //instance veriable
    String Name = "Prime";
    String Surname = "Testing";
    // satic variabel
    static boolean a = true;
    static boolean b = false;
   // 4.2 Declare one instance method.
    //  4.4 Call all four instance and static variables into both instance and static methods inside
    public void instanceMethod(){
        System.out.println(Name);
        System.out.println(Surname);
        System.out.println(programmeNo_4.a);
        System.out.println(programmeNo_4.b);
    }
    // 4.3 Declare one static method.
    //4.4 Call all four instance and static variables into both instance and static methods insid

    public static void staticMethod(){
        programmeNo_4 programmeNo_4 = new programmeNo_4();
        System.out.println(programmeNo_4.Name);
        System.out.println(programmeNo_4.Surname);
        System.out.println(a);
        System.out.println(b);
    }
    // 4.5 Declare the Main method.
     // 4.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        System.out.println();
        programmeNo_4 programmeNo_4 =new programmeNo_4();
        programmeNo_4 instanceMethod;
    }

    }
