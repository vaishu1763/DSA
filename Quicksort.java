package Sortings;
import java.util.*;
public class Quicksort {
 public static void main(String[] args)
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size: ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter elements of the array: ");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    sc.close();
    System.out.println("Before sorting: ");
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+ " ");
    }
    quicksort(arr, 0, arr.length-1);
    System.out.println("\nAfter Sorting: ");
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+ " ");
    }
 }   
 public static int partition(int arr[],int low,int high)
 {
    int pivot=arr[high];
    int i=low-1;
    for(int j=low;j<high;j++)
    {
        if(arr[j]<pivot)
        {
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    int temp=arr[i+1];
    arr[i+1]=arr[high];
    arr[high]=temp;
    return (i+1);
 }
  public static void quicksort(int arr[],int low,int high)
  {
    if(low<high)
    {
        int pi=partition(arr, low, high);
        quicksort(arr, low, pi-1);
        quicksort(arr, pi+1, high);
    }
  }
}
