import java.util.Scanner;

class simple {
  public static void main(String args[]) {
    Float p, t, r;
    Float si, ta;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the principal amount:");
    p = sc.nextFloat();
    System.out.println("Enter total number of months:");
    t = sc.nextFloat();
    System.out.println("Enter the rate of interest:");
    r = sc.nextFloat();
    si = (p * t * r) / 100;
    ta = p + si;
    System.out.println("simple interest is:" + si);
    System.out.println("Total amount is:" + ta);
  }
}