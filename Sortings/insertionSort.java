public class Sortings {
    public static void main(String[] args) {
        int A[] = {3, 1, 4, 3, 6, 8, 9, 5, 2};
        new Sortings().insertSort(A);

        for(int i : A) {
            System.out.print(Integer.toString(i) + " ");
        }
        System.out.println();
    }

    public void insertSort(int A[]) {
        for(int i = 1; i < A.length; i++) {
            
            for(int j = i; j > 0; j--) {
                if(A[j] < A[j - 1]) {
                    int temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                }
                else {
                    break;
                }
            }
        }
    }
}

