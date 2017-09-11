

public class InsertionSort {
    
        public static void sort(int[]arr){
            if(arr == null || arr.length == 0){
                return;
            }
            int n = arr.length;
            int current;
            int otherIndex;
            for(int i = 1; i < n; i++){
                current = arr[i];
                otherIndex = i;
                while(otherIndex > 0 && current < arr[otherIndex - 1]){
                    arr[otherIndex] = arr[otherIndex - 1];
                    otherIndex--;
                }
                arr[otherIndex] = current;
            }
        }

    public static void main(String[] args) {
            int[] tab = new int[args.length];
        for (int i = 0; i < args.length ; i++) {
            tab[i] = Integer.parseInt(args[i]);
        }
        sort(tab);
        for (Integer integer : tab) {
            System.out.print(integer+" ");
        }
    }

    }


