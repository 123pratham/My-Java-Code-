import java.lang.*;
class MaxOnes{
    public static int findMaxConsecutiveOnes(int [] arr){
        int maximum = 0;
        int i = 0;
        while(i< arr.length) {
            int conOnes = 0;
            while(i<arr.length && arr[i]==1) {
                conOnes++;
                i++;
            }
            maximum=Math.max(maximum,conOnes);
            i++;
        }

        return maximum;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,1,1,0,0,0,0,0,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
