package lab3;

/**
 * Created by kiril on 20.09.2017.
 */
public class zadanie2 {
    public static Integer fac(int n){

        int result = 1;

        for (int i = 1; i <= n; i++) {

            result *= i;

        }

        System.out.println(result);

        return(result);

    }

    public static void main (String[] args) {

        fac(6);

    }

}
