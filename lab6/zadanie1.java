package lab6;

/**
 * Created by kiril on 21.10.2017.
 */
import java.util.Random;

public class zadanie1 {
    private int[] A = new int[25];
    private int[] B = new int[25];
    private int[] C = new int[20];
    private int[] D = new int[30];
    private int[][] array = new int[3][5];
    private static final int MIN = 0;
    private static final int MAX = 1;
    private static final int ODD = 0;
    private static final int EVEN = 1;

    zadanie1() {
        System.out.println("------------ Задание 1 -------------");
        generateVector(A);
        printer("Первый массив: ", A);
        swap(A);
        printer("Первый массив после того как сменили местами максимальный и минимальный элемент: ", A);
        System.out.println("------------- Конец задания 1 ------------");
        System.out.println();
        System.out.println("------------- Задание 2 ------------");
        generateVector(B);
        printer("Второй массив: ", B);
        orderVec(B);
        printer("Второй массив после сортировки: ", B);
        System.out.println("------------- Конец задания 2 ------------");
        System.out.println();
        System.out.println("------------- Задание 3 ------------");
        generateVector(C);
        printer("Третий массив: ", C);
        System.out.println("Среднее значение: " + findAverage(C));
        System.out.println("------------- Конец задания 3 -------------");
        System.out.println();
        System.out.println("------------ Задание 4 -------------");
        generateVector(D);
        printer("Четвёртый массив: ", D);
        System.out.println("Сумма чётных элементов: " + getSum(D, EVEN));
        System.out.println("Сумма нечётных элементов: " + getSum(D, ODD));
        System.out.println("------------- Конец задания 4 -------------");
        System.out.println();
        System.out.println("------------- Задание 5 -------------");
        generateArray(array, 3, 5);
        printer("Матрица: ", array);
        System.out.println("------------- Конец задания 5 -------------");
        System.out.println();
        System.out.println("------------- Задание 6 -------------");
        System.out.println("");
        System.out.println("------------- Конец задания 6 -------------");
        System.out.println();
        System.out.println("------------- Задание 7 -------------");
        String s1 = "Text";
        String s2 = "Hello";
        String s3 = "World";
        String s4 = "equal";
        String s5 = "notEqual";
        taskSix(s1, s2, s3, s4, s5);
        System.out.println("------------- Конец задания 7 --------------");

    }

    public static void main(String[] args) {
        new zadanie1();
    }

    /**
     * Метод шестого задания
     */
    private void taskSix(String s1, String s2, String s3, String s4, String s5) {
        if (s4.equals(s5)) {
            System.out.println(s1 + s2);
        } else {
            System.out.println(s1 + s3);
        }
    }

    /**
     * Метод четвёртого задания
     */
    private int getSum(int[] vec, int type) {
        int sum = 0;
        for (int i = 0; i < vec.length; i++) {
            if (i % 2 == 0 && type == EVEN) {
                sum += vec[i];
            } else if (i % 2 != 0 && type == ODD) {
                sum += vec[i];
            }
        }
        return sum;
    }

    /**
     * Метод для третьего задания
     */
    private double findAverage(int[] vec) {
        double sum = 0;
        for (int i : vec) {
            sum += i;
        }
        return sum / vec.length;
    }

    /**
     * Метод для второго задания
     */
    private void orderVec(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < vec.length; j++) {
                if (vec[i] < vec[j]) {
                    int tmp = vec[j];
                    vec[j] = vec[i];
                    vec[i] = tmp;
                }
            }
        }
    }

    /**
     * Метод для первого задания
     */
    private void swap(int[] vec) {
        int minIndex = getIndex(vec, MIN);
        int maxIndex = getIndex(vec, MAX);

        int minElement = vec[minIndex];
        int maxElement = vec[maxIndex];
        vec[minIndex] = maxElement;
        vec[maxIndex] = minElement;
    }

    /**
     * Метод ищет индекс минимального или максимального значения (в зависимости
     * от второго параметра)
     */
    private int getIndex(int[] vec, int type) {
        int index = 0;
        int element = vec[0];
        for (int i = 0; i < vec.length; i++) {
            if (type == MIN && element > vec[i]) {
                element = vec[i];
                index = i;
            } else if (type == MAX && element < vec[i]) {
                element = vec[i];
                index = i;
            }
        }
        return index;
    }

    /**
     * Метод который генерирует массив из случайных чисел
     */
    private void generateVector(int[] vec) {
        Random random = new Random();
        for (int i = 0; i < vec.length; i++) {
            vec[i] = random.nextInt(10) - 5;
        }
    }

    /**
     * Метод который выводит массив в консоль
     */
    private void printer(String prefix, int[] vec) {
        String res = prefix;
        for (int i : vec) {
            res += i + " ";
        }
        System.out.println(res);
    }

    /**
     * Метод который генерирует двумерный из случайных чисел
     */
    private void generateArray(int[][] array, int N, int M) {
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = random.nextInt(10) - 5;
            }
        }
    }

    /**
     * Метод который выводит двумерный в консоль
     */
    private void printer(String prefix, int[][] array) {
        String res = prefix + "\n";
        for (int vec[] : array) {
            for (int i : vec) {
                res += i + "\t";
            }
            res += "\n";
        }
        System.out.println(res);
    }
}
