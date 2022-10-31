import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your RJ: ");
         Float roney = in.nextFloat();
        System.out.print("Please enter your name: ");
        String ju= in.next();
        roney -= 5;
        String name = "Congratulations Prof " + ju;
        System.out.println(name);

        System.out.println("**************************************");
        for (int i = 0; i < roney; i++) {

             if (i==0){
                System.out.println("Still Propergating at Zero " +i);
                System.out.println("**************************************");
            }

            else if (i % 2==0){
                System.out.println("even number " +i);
                 System.out.println("**************************************");
            }

            else if (i % 2==1){
                System.out.println("An odd number found " + i);
                 System.out.println("**************************************");
            }
            else{
                System.out.println("Trying out working with java! " + i);
                 System.out.println("**************************************");
            }

        }
        Person alex = new Person("Roney Juma");
        System.out.println(alex);

    }
    static class Person{
        String name;

        Person(String name){
            this.name= name;
        }
    }
}