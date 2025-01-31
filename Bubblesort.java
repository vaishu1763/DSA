import java.util.*;
public class Bubblesort{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array: ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the elements of an array: ");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    sc.close();
    System.out.println("Before sorting: ");
    for(int i=0;i<n;i++)
    {
        System.out.println(arr[i]+ " ");
    }
    bubble(arr,n);
    System.out.println("\nAfter sorting:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+ " ");
        }
  }    
  public static void bubble(int arr[],int n)
  {
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        }
    }
  }
}
