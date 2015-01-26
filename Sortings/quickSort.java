class quickSort {
    public static void main(String[] args) {
        int A[] = {3, 1, 4, 3, 6, 8, 9, 5, 2};
        new quickSort().quickSort(0, A.length - 1, A);
        
        for(int i : A) {
            System.out.print(Integer.toString(i) + ' ');
        }
        System.out.println();
    }

    public void quickSort(int leftBound, int rightBound, int[] unsortedArray) {
        if(rightBound - leftBound <= 1)
            return;

        int pivot = unsortedArray[leftBound];
        int leftTmp = leftBound;
        int rightTmp = rightBound;

        while(leftTmp <= rightTmp) {
            while(unsortedArray[leftTmp] < pivot) {
                leftTmp++;
            }

            while(unsortedArray[rightTmp] > pivot) {
                rightTmp--;
            }

            if(leftTmp <= rightTmp) {
                swap(unsortedArray, leftTmp, rightTmp);
                
                leftTmp++;
                rightTmp--;
            }
        }

        quickSort(leftBound, rightTmp, unsortedArray);
        quickSort(leftTmp, rightBound, unsortedArray);
    }

    public void swap(int[] Array, int a, int b) {
        int tmp = Array[a];
        Array[a] = Array[b];
        Array[b] = tmp;
    }
} 
