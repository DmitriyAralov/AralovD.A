/*
 * Дан массив b(n). Переписать в массив C(n) положительные элементы массива b(n),
 * умноженные на 5.(сжатие массива)
 */
public class N_1 {
    public static void main (String[] args) {
        int[] b = {1, 4, -5, 50, 3, -6};
        int c[] = new int [b.length];
        int i=-1;
        for (int k: b) {
            if (k>0) {
                i++;
                c[i] = k*5;
            }
        }
        for (int a: c) {
            System.out.println(a);
        }
    }
}