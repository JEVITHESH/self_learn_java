import java.util.*;
class Main {
    public static void main(String[] args) {
        int [][] arr = { {1,2,3},   //3*2
                         {4,5,6} }; //2*3
        int col =rar[0].length  //3
        int row = arr.length;   //2
        for(int i =0 ; i < col ; i++ ){
            for(int j = 0 ; j < row ; j++){
                System.out.print(arr[j][i]);
            }
            System.out.print("\n");
        }
    }
}
//output
// 1 4
// 2 5
// 3 6
