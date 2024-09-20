package classicos;
import java.util.Scanner;
public class med {
	  public static void main(String[] args) {
	      Scanner input = new Scanner (System.in);
	      int ni, nf , i=0, r=0, e=0;
	      double m=0;
	      System.out.print("Insira um número inicial: ");
	      ni = input.nextInt ();
	      System.out.print("Insira um número final: ");
	      nf = input.nextInt ();
	      i = ni;
	      while (i<=nf) {
	        r = i+r;
	        i++;
	        e++;
	      }
	      r = r/e;
	      System.out.println(r);
	    }
}
