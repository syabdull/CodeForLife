import java.util.HashSet; 
import java.util.Scanner; 
public class UniquCharacters{
    // java program to find the no of unique characters in an array
    // hashset is a dataStructure  used find the unique values 
     public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
           HashSet<Integer>hs=new HashSet<Integer>();
           System.out.println("please enter the size of an array");
           int size=sc.nextInt();
            int [] A=new int[size];
          
             for(int i=0;i<size;i++){  // getting input from the user 
                System.out.println("please enter the elements of an array");
                  A[i]=sc.nextInt();
             }
              for(int i=0;i<size;i++){ // adds to the hashset
                    hs.add(A[i]);
              }
              System.out.println(hs.size());// return the no of unique charcters
            


     }

}