public class Main {
    public static void main(String[] args) {

        int x = 5;
        int y = 6;
        System.out.printf("x=%d y=%d\n", x,y); //%d é como se puxasse o valor incluido no int



        //Incremento
        x+= 1;
        y+= 1;
        System.out.printf("x=%d y=%d\n", x,y);
        //------------
        x++;  // incremento de +1
        y--;  // incremento de -1
        System.out.printf("x=%d y=%d\n", x,y);
        //------------
        x=x+1;  // mais fácil, (valor atual + 1)
        y=y+1;
        System.out.printf("x=%d y=%d\n", x,y);
        }
}
