package lab3;

/**
 * Created by kiril on 21.09.2017.
 */
public class zadanie4 {
    public static final Double G=9.8;

    public static double vis(double h){

        double t= Math.sqrt(2*h/G);

        return t;

    }

    public static void main(String[] args) {

        System.out.println(vis(100));

    }

}
