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
//    int N = Integer.parseInt(args[1]);
//    int key = Integer.parseInt(args[1] + 1);
//    int[] a = new int[N];
//    int index = rank(key, a);
//    System.out.println(index);
    System.out.println(args[0] + " " + args[1]);
  }
}
