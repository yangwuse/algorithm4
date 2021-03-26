package staticmethods;

public class BinarySearch {
  //recursion version of binarysearch
  //a must be sorted
  public static int rank(int key, int[] a) {
    return rank(key, a, 0, a.length - 1);
  }

  //overload rank
  public static int rank(int key, int[] a, int lo, int hi) {
    if (lo > hi) return -1;
    //note the operation priority
    int mid = lo + ((hi - lo) >> 1);
    if      (a[mid] < key)  return rank(key, a, mid + 1, hi);
    else if (a[mid] > key)  return rank(key, a, lo, mid - 1);
    else                    return mid;
  }

  public static void main(String[] args) {
    int[] a = new int[]{1, 2, 3, 6, 7, 8, 30};
    int index = rank(6, a);
    System.out.println(index);
    index = rank(4, a);
    System.out.println(index);
  }
}
