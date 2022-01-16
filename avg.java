
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		int num,sum=0,i;
		
		Scanner sc = new Scanner(System.in);
       
        //System.out.println("enter how many numbers: ");
        //n=sc.nextInt();
          System.out.println("Enter numbers: ");
          
          for(i=1;i<=10;i++)
          {
        	  num=sc.nextInt();
        	  sum =num+sum;
        	  
        	 
          }
          
           int avg= (int)sum/10;
           

System.out.println("the Avrage a numbers is: "+ avg);
	}

}

  
