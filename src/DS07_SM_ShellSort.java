/** Course Code: EYF649
 *  Submission:  DS07_ShellSort
 *  Due Date:    20181203
 *  Author:      Sean Mis
 *  Description: This program creates the Shell
 *               Sort method
 */

public class DS07_SM_ShellSort
        extends DS07_SM_QuickSort_2 {

    private static <T extends Comparable<? super T>>
    void incrementalInsertionSort(T[] a, int first,
                             int last, int space) {
        T nextToInsert = null;
        for (int unsorted = first + space; unsorted < last;
             unsorted++) {
            nextToInsert = a[unsorted];
            int index = unsorted - space;
            while ((index >= first) &&
                    (nextToInsert.compareTo(a[index]) < 0)) {
                a[index + space] = a[index];
                index = index - space;
            }
            a[index + space] = nextToInsert;
        }
    }

    public static <T extends Comparable<? super T>>
    void shellSort(T[] a, int first, int last) {

        int n = 0, space;
        space = n / 2;

        while (space > 0) {
            for (int begin = first;
                 begin < first + space - 1; begin++) {
                incrementalInsertionSort(a, begin, last, space);
            }
            space = space / 2;
        }
    }
}
