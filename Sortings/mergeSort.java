class mergeSort {
    public static void main(String[] args) {
        int A[] = {3, 1, 4, 3, 6, 8, 9, 5, 2};
        new mergeSort().mergeSort(0, A.length - 1, A);

        for(int i : A) {
            System.out.print(Integer.toString(i) + ' ');
        }
        System.out.println();
    }

    public void mergeSort(int lowerBound, int higherBound, int[] A) {
        if(lowerBound >= higherBound) {
            return;
        }

        int middle = (lowerBound + higherBound) / 2;
        mergeSort(lowerBound, middle, A);
        mergeSort(middle + 1, higherBound, A);

        merge(lowerBound, middle, higherBound, A);
    }

    public void merge(int lowerBound, int middle, int higherBound, int[] A) {
        int checkerOne = lowerBound;
        int checkerTwo = middle + 1;

        int mark = 0;
        int[] B = new int[higherBound - lowerBound + 1];
        while(checkerOne <= middle && checkerTwo <= higherBound) {
            if(A[checkerOne] > A[checkerTwo]) {
                B[mark++] = A[checkerTwo++];
            }
            else {
                B[mark++] = A[checkerOne++];
            }
        }
        if(checkerOne > middle) {
            while(checkerTwo <= higherBound) {
                B[mark++] = A[checkerTwo++];
            }
        }
        else if(checkerTwo > higherBound) {
            while(checkerOne <= middle) {
                B[mark++] = A[checkerOne++];
            }
        }

        for(int i = 0; i < higherBound - lowerBound + 1; i++) {
            A[i + lowerBound] = B[i];
        }
    }

}




