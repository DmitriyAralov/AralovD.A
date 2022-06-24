/*
 * Реализовать программу, получающую на вход в качестве аргумента 
 * имя человека и выводящую “Hello ” + имя, в противном случае, 
 * если параметр не передавался, “Hello world”.
 */
public class Ex_1 {
	public static void main(String args[]) {
		if (args.length > 0)
			System.out.println("Hello " + args[0]);
		else
			System.out.println("Hello world");
	}
}