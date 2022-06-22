package lab5;

import java.util.Scanner;

/**
 * Prints out numbers from a string using while loop.
 */
public class LoopExample
{
  /**
   * Try out loops.
   * @param args
   */
  public static void main(String[] args)
  {
	int i = 0;
	String s = "1 2 3 4 5";
	Scanner scan = new Scanner(s);
	while(scan.hasNext()){
		int num = scan.nextInt();
		System.out.println(num);
	}
	
  }
}
