/*
 * Дан массив b(n). Переписать в массив C(n) положительные элементы массива b(n),
 * умноженные на 5.(сжатие массива)
 */
public class N_1 {
    public static void main (String[] args) {
        int[] k = {1, 4, -5, 50, 3, -6};
        int f[] = new int [k.length];
        int i=-1;
        for (int a: k) {
            if (a>0) {
                i++;
                f[i] = a*5;
            }
        }
        for (int w: f) {
            System.out.println(w);
        }
    }
}