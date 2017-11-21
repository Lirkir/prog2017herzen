package lab7;

/**
 * Created by kiril on 27.10.2017.
 */
public class zadanie1 {
    public static class fclass1 {

        protected static int v = 1;
        public static void main(String[] args) {

        }
        static void f1_method(){System.out.println("Hello from fclass1");};
    }
    public static class fclass2 extends fclass3{
        public static void main(String[] args) {
            f1_method();
            f3_method();
            System.out.println(get_var());
        }
        public static int get_var()
        {
            //Доступ к protected полю родителя
            return v;
        }
    }
    public static class fclass3 extends fclass1 {
        public static void main(String[] args) {
            f1_method();
        }
        public static void f3_method() {
            System.out.println("Hello from fclass3");
        }
    }
}
