package homeWork;
/*Write a Java programme using the following steps.
       * 1.1 Declare two instance variables.
        *1.2 Declare one instance method.
        *1.3 Call both instance variables into the instance method inside the print statement.
        *  1.4 Declare the Main method.
        *1.5 Call the above instance method into the Main method and Run the programme.*/

public class ProgrammeNo_1 {

    //1.1 Declare two instance variables.
    int a = 10;
    int b = 20;
    //1.2 declare one istance metod.
    //1.3 cll both instance variablea into the instance method inside the print statement.
    public void instanceMethod() {
        System.out.println(a);
        System.out.println(b);
    }
    //1.4 Declare the main Method.
    // 1.5 Call the above instance method into the Main method and Run the programme
        public static void main(String[] args){
        ProgrammeNo_1 proGramme1 = new ProgrammeNo_1();
        proGramme1.instanceMethod();
        }



        }

