public class cwh_28_Multi_Dim_Array {
 public static void main(String[] args) {
//     int []marks; //1->D array
//     int [] []flats; // 2->D arrays
// flats = new int [2][3];
// flats[0][0] = 101;
// flats[0][1] = 102;
// flats[0][2] = 103;
// flats[1][0] = 201;
// flats[1][1] = 202;
// flats[1][2] = 203;
// System.out.println("Printing a 2-D Array using for loop!");
// for(int i = 0;i<flats.length;i++){
//     for(int j = 0;j<flats[i].length;j++){
//     System.out.print(flats[i][j]);
//             }
//             System.out.print(" ");
//         } 
//         System.out.print("\n");
int bench[][] = new int[3][6];
    bench[0][0] = 001;
    bench[0][1] = 002;
    bench[0][2] = 003;
    bench[0][3] = 004;
    bench[0][4] = 005;
    bench[0][5] = 006;
    bench[1][0] = 011;
    bench[1][1] = 012;
    bench[1][2] = 013;
    bench[1][3] = 014;
    bench[1][4] = 015;
    bench[1][5] = 016;
    bench[2][0] = 021;
    bench[2][1] = 022;
    bench[2][2] = 023;
    bench[2][3] = 024;
    bench[2][4] = 025;
    bench[2][5] = 026;
    for(int i = 0;i<bench.length;i++){
        for(int j = 0;j<bench[i].length;j++){
            System.out.print(bench[i][j]);
        }
        System.out.print(" ");
    }
    System.out.print(" ");
     }   
}
