package lab4;

import javax.swing.*;

/**
 * Created by kiril on 20.09.2017.
 */
public class zadanie1 {

    public static void main(String[] args) {

        int n1;

        double a;

        double s = 0,m=0;

        String n;

        n= JOptionPane.showInputDialog("Введите n");

        n1 = Integer.parseInt(n);

        for (int i=1; i<=n1; i++){

            m=i;

            a=(Math.pow((-1),(m+1)))*(1/m);

            s+=a;

        }

        System.out.println(s);

    }

}
