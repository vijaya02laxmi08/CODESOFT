import java.util.Scanner;

public class StudentMarks{
 
    public static void main(String args[]){
 
        int n, total = 0; 
        int Avg_percentage;

        int Scanner;
 
        Scanner sub = new Scanner(System.in);
 
        System.out.println("Enter no of subjects:");
 
        n=sub.nextInt();

         int marks[] = new int[n];

         System.out.println("Enter marks out of 100:");
         for(int i=0; i<n; i++){

            marks[i]=sub.nextInt();
            total= total+marks[i];

         }
         
         System.out.println("Sum:"+total);
         System.out.print("Grade: ");
         if(total>=450){
            System.out.println("A");
         } else if(total>=350&&total<450){
            System.out.println("B");
        
         }
         else{
            System.out.println("C");
         }

         Avg_percentage = total/n;

         System.out.println("Average percentage:"+ Avg_percentage+ "%");



        } 

}
