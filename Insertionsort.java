import java.util.*;
public class Insertion {
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
        System.out.println("Before sorting: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        insert(arr,n);
        System.out.println("\nAfter sorting: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void insert(int arr[],int n)
    {
        for(int i=0;i<=n-1;i++)
        {
            int j=i;
            while(j>0&&arr[j-1]>arr[j])
            {
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
            }
        }
    }
}
