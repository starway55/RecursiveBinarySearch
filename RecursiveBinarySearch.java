public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 7, 12, 14, 15, 18, 19, 20, 22, 25};

        System.out.println("Searching 1 in the array, the index is: " + search(7 , array, 0, array.length));
    }

    public static int search( int target, int[] array, int p, int q){
        int r = (p + q) / 2;

        if( target < array[r]){
            if(p == q){
                System.out.println("Cannot find target int!");
                return -1;
            } else {
                return search(target, array, p, r-1);
            }
        } else if( target > array[r]){
            if(p == q){
                System.out.println("Cannot find target int!");
            } else {
                return search(target, array, r+1, q);
            }
        } else if( target == array[r]){
            return r;
        }

        return -1;
    }
}
