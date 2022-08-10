import java.util.*;
import java.io.*;

public class Factorial {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int fact=1;
      for(int i=1;i<n;i++){
        fact= fact*(i+1);
        
      }
      System.out.println(fact);//your code here
    }
}
