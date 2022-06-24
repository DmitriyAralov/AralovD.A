/*
 * Дан массив c (n). Переписать в массив x(n) все ненулевые элементы c(n), возведенные в квадрат (с сжатием, без пустых
 * элементов внутри). Затем упорядочить методом "выбора и перестановки" по возрастанию новый массив.
 */
public class N_2 {
	public static void main(String[] args) {
		int[] c = new int[] {3, 0, 3, -6, 0, 0, 8, -8, 0, 2};
		int[] x = N_2.createNonZeroVector(c);
		N_2.sortVector(x);
		N_2.printVector(x);
	}
	
	public static int[] createNonZeroVector(int[] vector) {
		int new_size = 0;
		for (int i: vector) {
			if (i != 0)
				new_size++;
		}
		
		int[] new_vector = new int[new_size];
		int j = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] != 0) {
				new_vector[j] = (int)Math.pow(vector[i], 2);
				j++;
			}
		}
		return new_vector;
	}
	
	public static void sortVector(int[] vector) {
		int tmp;
		for (int i = 0; i < vector.length; i++) {
			for (int w = i; w < vector.length; w++) {
				if (vector[i] > vector[w]) {
					tmp = vector[i];
					vector[i] = vector[w];
					vector[w] = tmp;
				}
			}
		}
	}
	
	public static void printVector(int[] vector) {
		for (int i: vector) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}