package Recurssion;

import java.util.Arrays;

public class BinarySearchTest {
    static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
                    if(arr[mid]==target)
                        return mid;
                    if (arr[mid]<target)
                            start=mid+1;
                    else
                        end=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {112, 25, 83, 42, 5, 6, 75, 81, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 112));
      if(binarySearch(arr, 113)==-1)
          System.out.println("404 Not Found");



    }
}
