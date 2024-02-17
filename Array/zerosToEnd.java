package Array;

public class zerosToEnd {

  static void moveZeroesToEnd(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        for (int j = i + 1; j < n; j++) {
          if (arr[j] != 0) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
        }
      }
    }
  }

  static void efficientZeroesToEnd(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        int temp = arr[i];
        arr[i] = arr[count];
        arr[count] = temp;

        count++;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = { 8, 5, 0, 10, 0, 8, 20, 1 };

    // moveZeroesToEnd(arr);

    efficientZeroesToEnd(arr);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
