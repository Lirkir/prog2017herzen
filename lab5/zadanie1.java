package lab5;

/**
 * Created by kiril on 25.09.2017.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zadanie1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число от нуля до девяти");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] words = new String[10];
        for (int j=0;j<10;j++)
        {
            words[0]="Ноль";
            words[1]="Один";
            words[2]="Два";
            words[3]="Три";
            words[4]="Четыре";
            words[5]="Пять";
            words[6]="Шесть";
            words[7]="Семь";
            words[8]="Весемь";
            words[9]="Девять";

        }

        int numb = Integer.parseInt(reader.readLine());
        while (numb<0 || numb >9)
        {
            System.out.println("Введите число от нуля до девяти");
            numb = Integer.parseInt(reader.readLine());
        }
        if (numb>=0 || numb<=9){
            System.out.println(words[numb]);}
    }

}