import java.util.*;

public class Main {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    System.out.println(num  +"! ="+  factorial(num));
}
static int factorial(int num) {
    int factorial = 1;
    for (int i = 2; i <= num; i++) {
        factorial = factorial * i;
    }
    return(factorial);
}
       
    }
