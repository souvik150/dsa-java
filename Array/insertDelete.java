package Array;

public class insertDelete {
  public static int insertToArray(int[] arr, int len, int data, int cap, int pos) {
    if (len == cap) {
      return len;
    }

    int idx = pos - 1;

    for (int i = len - 1; i >= idx; i--) {
      arr[i + 1] = arr[i];
    }

    arr[idx] = data;

    return len + 1;
  }

  public static int deleteFromArray(int[] arr, int len, int data) {
    int i;
    for (i = 0; i < len; i++) {
      if (arr[i] == data) {
        break;
      }
    }

    // element is not present
    if (i == len) {
      return len;
    }

    for (int j = i; j < len - 1; j++) {
      arr[j] = arr[j + 1];
    }

    return (len - 1);
  }

  public static void main(String[] args) {
    int arr[] = new int[5], cap = 5, len = 3;
    arr[0] = 5;
    arr[1] = 10;
    arr[2] = 20;

    System.out.println("Before Insertion");
    for (int i = 0; i < len; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    int data = 7, pos = 2;

    len = insertToArray(arr, len, data, cap, pos);

    System.out.println("After Insertion");
    for (int i = 0; i < len; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    len = deleteFromArray(arr, len, 7);

    System.out.println("After Deletion");
    for (int i = 0; i < len; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
