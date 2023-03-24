import java.util.*;
public class Pascal{
    //this function is used to find the factorial of any number
    public static int combination(int x){
        int fact=1;
        for (int i=1;i<=x;i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of the n=");
        int n=sc.nextInt();
        //this for loop is used for row
        for (int i = 0; i<=n; i++) {
            //this for loop is used for space
            for(int k=0;k<n-i;k++){
                System.out.print(" ");
            }
            //this for loop is used for column
            for (int j = 0; j <= i; j++) {
                int nfact=combination(i);
                int rfact=combination(j);
                int nrfact=combination(i-j);
                int ncr=nfact/(nrfact*rfact);
                System.out.print(ncr+" ");
            }
            //this is used for new line
            System.out.println(" ");
        }
    }
}
