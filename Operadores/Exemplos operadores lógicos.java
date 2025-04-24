public class Main {
    public static void main(String[] args) {
        System.out.println(3*(5+5));
        System.out.println(10+2*20);
        System.out.println(12-9/3);
        System.out.println(10+2==6*2); //true, por

        int x=3, y=4, z=5;
        System.out.println(x<y && z>y); // true
        System.out.println(x>z || x<z); //true
        System.out.println(y<x != y>x); //os três são relacionais, um falso e um true, o resultado será true
        System.out.println(!(x<y) == x>y); // falso + falso = true
        System.out.println(!(y<x) && x>z || z<y); // falso

         //                                    true
        //                            false          true
        //                    false           true        true
       //                    3       2      5       1    4    2
        System.out.println(x == z - y && z != y - x || y != z - x);
        }
}
