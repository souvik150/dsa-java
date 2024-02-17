package Array;

public class reverseArray {

  static void reverseAnArray(int[] arr, int n) {
    int low = 0, high = n - 1;
    while (low < high) {
      int temp = arr[low];
      arr[low] = arr[high];
      arr[high] = temp;
      low++;
      high--;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 10, 20, 50, 40, 10, 32 };

    reverseAnArray(arr, arr.length);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
