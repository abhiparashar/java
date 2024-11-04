import java.util.Scanner;

public class Printstring {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    // String str = scn.nextLine();
    // System.out.println(str);
    char ch = scn.nextLine().charAt(0);
    System.out.println(ch);
    scn.close();
  }
};