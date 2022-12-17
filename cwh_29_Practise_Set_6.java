public class cwh_29_Practise_Set_6 {
    public static void main(String[] args) {
       /* float []marks = {12.4f,3.4f,5.6f,6.6f,7.7f};
        float sum=0;
        for(float i : marks){ //35.7
        sum = sum + i ;
        }
        System.out.println(sum);*/
            //Practise pr 2
        /*
        float []num = {45.5f,56.6f,66.7f,64.5f};
        float num1 = 45.0f;
        boolean isInArray = false;
        for(float i : num){
            if (num1==i) {
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in array!");
        }else{
            System.out.println("The value is not present in array!");
        }
        */
        //Practise Problem 3
        // float []marks = {50.6f,50.6f,50.6f,50.6f,50.6f};
        // float sum = 0 ;
        // for(float i : marks){
        //     sum = sum + i;
        // }
        // System.out.println("Your total sum is: "+ sum/marks.length);

        //Practice problem 4 add two matrices.
         int [][]mat1 =   {{1,2,3},
                          {4,5,6}};
        int [][]mat2 =   {{2,6,13},
                          {3,7,1}};
        int [][]result = {{0,0,0},
                          {0,0,0}};
                          for(int i = 0; i<mat1.length;i++){ //row number of iterate
                            for(int j = 0;j<mat1[i].length;j++){ //column number of iterate
    System.out.format("Setting value for i = %d and j = %d\n",i,j);
result[i][j] = mat1[i][j]+mat2[i][j];
                            }
                          }
                          for(int i = 0; i<mat1.length;i++){ //row number of iterate
                            for(int j = 0;j<mat1[i].length;j++){ //column number of iterate
    System.out.print(result[i][j] + " ");
result[i][j] = mat1[i][j]+mat2[i][j];
                            }
                            System.out.println(" ");
                          }
                          
        //Practice problem 5.
        // int []arr = {1,2,3,4,5,6};
        // int l = arr.length;
        // int temp;
        // int n = Math.floorDiv(l, 2);
        // for(int i = 0; i< n;i++){
        //     //swap a[i] and a[l-1-i]
        //     temp = arr[i];
        //     arr[i] = arr[l-1-i];
        //     arr[l-1-i] = temp;
        // }
        // for(int element:arr){
        //     System.out.print(element+ " ");
        // }

        //Practice problem 6
        // int []arr = {56,36,555,56};
        // int max = 0;
        // for(int e:arr){
        //    if(e>max){
        //     max = e;
        //    }

        // }
        // System.out.println(max);

        //Practice problem 7
    //     int arr[] = {4,5,3,55,8,6,-2};
    //     int min = arr.length;
    //     for(int e:arr){
    //         if(e<min){
    //             min = e;
    //         }
    //     }
    //     System.out.println(min);
        //Problem 8.
        // int arr[] = {10,2,3,4,5,6};
        // boolean isSorted = true;
        // for(int i = 0;i < arr.length-1;i++){
        //     if(arr[i]>arr[i+1]){
        //         isSorted = false;
        //         break;
        //     }
            
        // }
        // if(isSorted){
        //     System.out.println("The Array is sorted!");
        // }else{
        //     System.out.println("The Array is not sorted!");
        // }
    }
}
