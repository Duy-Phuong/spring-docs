
public class Test {
    enum Color
    {
        RED, GREEN, BLUE;
    }

    public static int findLargestNumber(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public static void selectionSort(int[] a) {
        int n =a.length;
        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if (a[j] < min) min = j;
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;

        }
    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++){
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String s[] = { "a", "b", "c", "d"};
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        Color c1 = Color.RED;
        System.out.println(c1);

        int[] a = {1 , 2, 3, 8, 5};
        System.out.println(findLargestNumber(a));
    }
}
