package Array;

import java.util.Scanner;

public class largestElement {
  static int naiveReturnLargestElement(int[] arr, int n) {
    int largest = -1;
    for (int i = 0; i < n; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }

    return largest;
  }

  static int naiveSecondLargest(int[] arr, int n) {
    int largest = naiveReturnLargestElement(arr, n);
    int res = -1;

    for (int i = 0; i < n; i++) {
      if (arr[i] != largest) {
        if (res == -1) {
          res = i;
        } else if (arr[i] > arr[res]) {
          res = i;
        }
      }
    }

    return res == -1 ? -1 : arr[res];
  }

  static int secondLargest(int[] arr, int n) {
    int res = -1, largest = 0;
    for (int i = 1; i < n; i++) {
      if (arr[i] > arr[largest]) {
        res = largest;
        largest = i;
      } else if (arr[largest] > arr[i]) {
        if (res == -1 || arr[i] > arr[res]) {
          res = i;
        }
      }
    }
    return res == -1 ? -1 : arr[res];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of the array");
    int size = sc.nextInt();

    int[] arr = new int[size];

    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    int largest = naiveReturnLargestElement(arr, size);
    System.out.println("The largest element is " + largest);

    int secondlargestN = naiveSecondLargest(arr, size);
    System.out.println("The second largest element (naive) is " + secondlargestN);

    int secondlargest = secondLargest(arr, size);
    System.out.println("The second largest element is " + secondlargest);
    sc.close();
  }
}
