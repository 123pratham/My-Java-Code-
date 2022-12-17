public class cwh_26_arrays {
    public static void main(String[] args) {
        // There are three main ways to create an array in java!
        //This is type 1 declaretion 
        // int []marks = new int[5]; //this is objct memory allocate in heap
        // 2. int [] marks;
        // marks = new int[5];
        // marks[0] = 60; //Initilization 
        // marks[1] = 60;
        // marks[2] = 60;
        // marks[3] = 60;
        // marks[4] = 60;
        // int total = marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
        // float avg = (total)*100/500;
        // System.out.println(avg);

        int [] arr = {55,50,60,65,64};
         int total = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
         System.out.println(total);
        // float avg = (total)*100/500;
        // System.out.println(avg+"%");
//        int sum = 0 ;
//        for(int i = 0;i<arr[i];i++){
//            sum = sum +arr[i] ;
//            System.out.println(sum);
      //  }
    }
}
