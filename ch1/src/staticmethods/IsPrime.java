package staticmethods;

import java.util.Scanner;

public class IsPrime {
  //judge a num is a prime aka: 2 3 5 7 11 13 17 ...
  public static boolean isPrime(int N) {
    if (N < 2) return false;
    for (int i = 2; i*i <= N; i++)
      if (N % i == 0) return false;
    return true;
  }

  //test
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    while (N != 0) {
      boolean f = isPrime(N);
      System.out.println(N + " is prime? " + f);
      N = sc.nextInt();
    }
  }
}
