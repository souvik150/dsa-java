package Array;

public class removeDuplicateSorted {
  static int remDup(int[] arr, int n) {
    int res = 1;
    for (int i = 0; i < n; i++) {
      if (arr[i] != arr[res - 1]) {
        arr[res] = arr[i];
        res++;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 20, 20, 30, 30, 30 };
    int n = arr.length;

    int x = remDup(arr, n);

    for (int i = 0; i < x; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
