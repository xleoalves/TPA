package classicos;
import java.util.Scanner;
public class fibo {
	 public static void main(String[] args) {
         int n, n2=0, n3=1, f=0, i=0;
         Scanner input = new Scanner(System.in);
         System.out.print("Digite um Número: ");
         n = input.nextInt();
         while (i<n){
         System.out.println(f+"");
         f = n2+n3;
         n2=n3;
         n3=f;
         i++;
     }
 }
}
