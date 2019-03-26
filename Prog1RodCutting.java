
import java.util.*;
class Prog1RodCutting {
    public static void main(String args[] ){

        Scanner sc = new Scanner(System.in);
          int numOfTestCases=sc.nextInt();
          while((numOfTestCases--)>0)
          {
              int RodLenRange=sc.nextInt();
              int count=0;

              for(int i=3;i<=RodLenRange;)
              {
                  count=count+1;
                  i=2*i+1;
              }

              System.out.println(count);
}
    }
}
