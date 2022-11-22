/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
 
    
	public static void main(String[] args) {
		int arr[]={10,20,30,40,50};
		int n=arr.length;
	    int low=0;
	    int high=n-1;
        while(low<high){
            
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                
                low++;
                high--;
       
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    
		
	}
}
