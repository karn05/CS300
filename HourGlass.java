import java.util.*;
public class HourGlass{
    
    public static int HourSum(int [][]matrix, int size){
        int max = 0;

        for(int i = 0; i < size - 2; i++){
            for(int j = 0; j < size - 2; j++){
                int sum = (matrix[i][j]+ matrix[i][j+1]+ matrix[i][j+2]
                		+ matrix[i+1][j]+matrix[i+1][j+1]+matrix[i+1][j+2]
                    + matrix[i+2][j]  + matrix[i+2][j+1]  + matrix[i+2][j+2]);
                    
                    if(max < sum)
                        max = sum;
            }
        }
        
        return max;
    }
    
    //================= main =======================
     public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] array = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                array[i][j] = sc.nextInt();
            }
        } //for end
        
        System.out.println(HourSum(array, size));
    }
}
