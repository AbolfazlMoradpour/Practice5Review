package p02_Non_Access_Modifier;

public class Main {
        /*
        * final fields:
        * */
        final int age = 20;
        final  int age2;

        public Main(int Age){    /*set value in cons_method*/
            this.age2=Age;
        }
        final int age3;
    {   /*set value in initBlock*/
        age3=20;
    }
    /*
    * static & final_static fields:
    * */
    public static void main(String[] args) {
        Static_Demo st1 = new Static_Demo();
        System.out.println(Static_Demo.number1);    /*should use class name to access fields*/
        System.out.println(Static_Demo.number1);
        System.out.println(Static_Demo.number2);    /*cant change this value*/
        System.out.println(Static_Demo.number4);    /*print number of obj that created*/
    }
    /*
     * Tips:
     * - we can set value for final_static fields with+
     * with static methods.
     * Example:
     * */
    public final static int number3 = m1();
    public static int m1(){
        return 22;  /*returned value set on number3*/
    }

}
