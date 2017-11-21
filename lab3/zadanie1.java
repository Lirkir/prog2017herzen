package lab3;

/**
 * Created by kiril on 20.09.2017.
 */
public class zadanie1 {
    static int b=2;

    static void stepen (int n) {

        int result =1;

        for (int i=0; i<n; i++) {

            result*=b;
        }

        System.out.println(result);

    }

    public static void main (String[] args) {

        stepen (5);
    }

}