// WRITE A PROGRAM TO GENERATE FIBONACCI SERIES OF N NUMBERS.

import java.util.Scanner;

public class practical_24 {
    public static void main(String[] args) {

        int n1=0,n2=1,n3,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");
        int count = sc.nextInt();
        System.out.print(n1+" "+n2);//printing 0 and 1    
           
        for(i=2;i<count;++i)
        {    
         n3=n1+n2;    
         System.out.print(" "+n3);    
         n1=n2;    
         n2=n3;    
        }    
    }
}
