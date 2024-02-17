package Array;

public class checkIfSorted {
  static boolean isSorted(int[] arr) {
    boolean isTrue = true;

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] < arr[i + 1]) {
        continue;
      } else {
        isTrue = false;
        break;
      }
    }

    return isTrue;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50 };

    boolean first = isSorted(arr);
    System.out.println(first);

    int[] sec = { 10, 20, 40, 50, 30 };

    boolean second = isSorted(sec);
    System.out.println(second);

  }
}
