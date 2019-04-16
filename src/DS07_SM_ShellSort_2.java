/** Course Code: EYF649
 *  Submission:  DS07_ShellSort
 *  Due Date:    20181203
 *  Author:      Sean Mis
 *  Description: This program creates the Shell
 *               Sort method
 */

public class DS07_SM_ShellSort_2
        extends DS07_SM_QuickSort_2 {

    public static <T extends Comparable<? super T>>
    void shellSort(T[] a) {

        int j;
        for (int space = a.length / 2; space > 0; space /= 2) {
            for (int i = space; i < a.length; i++) {
                T temp = a[i];
                for (j = i; j >= space
                        && temp.compareTo(a[j - space]) < 0; j -= space) {
                    a[j] = a[j - space];
                }
                a[j] = temp;
            }
        }
    }
}
