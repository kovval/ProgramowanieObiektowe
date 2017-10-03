// Sortowanie przez scalanie (mergesort)
// www.algorytm.org

package Strategia.Sorter;

class MergeSort {
    public static void mergeSort(int[] tab, int l, int r){

        int DividePoint = dividePoint(l,r);

        if (r!=l){
            mergeSort(tab, l, DividePoint);
            mergeSort(tab, DividePoint+1, r);

            //pointers used to refer to content of arrays
            int ptrA = l;
            int ptrB = DividePoint+1;

            int i = 0;
            int[] temptab = new int[r-l+1];

            //join two arrays into one sorted array
            while(ptrA<=DividePoint && ptrB<=r){
                if (compare(tab[ptrA], tab[ptrB])){
                    temptab[i++] = tab[ptrA++];
                }else{
                    temptab[i++] = tab[ptrB++];
                }
            }
            if (ptrA>dividePoint(l,r)){         //if all elements of first array
                                                //were used add rest of second
                                                //array to the end of temporary
                                                //array
                for (int j = ptrB; j<=r; j++){
                    temptab[i++] = tab[j];
                }
            }else{                              //opposite case
                for (int j = ptrA; j<=dividePoint(l,r); j++){
                    temptab[i++] = tab[j];
                }
            }
            //copy results
            copy(tab, temptab, l,r);
        }

    }
  
  private static int dividePoint(int l, int r){
      //calculates divide point of array
      int tabLength = r-l+1;
      if (tabLength%2 == 0){
          return l-1+(tabLength)/2;
      }else{
          return l+tabLength/2;
      }
  }

  private static boolean compare(int num1, int num2){
      if (num1 > num2) return false;
      if (num1 < num2) return true;
      else
          return true;
  }

  private static void copy(int tab[], int temptab[], int l, int r){
      //copies result from temporary array to original array
      int j=0;
      for (int i=l; i<=r; i++){
          tab[i] = temptab[j++];
      }

  }

    public static void main(String[] args) {
      int[] tablica = {1, 12, 2,43, 54,65,12, 3, 4, 5, 4, 31};
        MergeSort sort = new MergeSort();

        mergeSort(tablica,1,4);



    }

}
