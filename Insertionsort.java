import java.util.Scanner;

public class Insertionsort{
    void sort(int[] arr){
        int n = arr.length;
        
        //traverse to i to n
        for(int i = 1 ; i < n ; ++i){
            int key = arr[i];
            int j = i - 1;
            
        
        
        while(j >= 0 && arr[j] > key){
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
        
    } 
        
       }
       
    static void Printarr(int[] arr){
        int n = arr.length;
        
        for(int i = 0 ; i < n ; ++i){
            System.out.print(arr[i] + " ");
           
        }
    System.out.println();
        
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the no.of elements in your array : ");
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of your array : ");
        
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        
        Insertionsort ob = new Insertionsort();
        
        ob.sort(arr);
        
        System.out.println("Sorted array : ");
        Printarr(arr);
        
        
    }
    
}



