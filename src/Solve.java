import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arr[] ={1,2,3,4};
        int arr1[] ={5,6,7,8};
        gopMang(arr,arr1);

    }

    public static void gopMang(@NotNull int inputArr1[], @NotNull int inputArr[]){
        int newArr[] = new int[inputArr.length+inputArr1.length];
        int viTri =0;
        int width= newArr.length-inputArr1.length;
        for (int i=0;i<inputArr1.length;i++){
            newArr[i] = inputArr1[i];
        }
        for (int j =width;j<newArr.length;j++){
            newArr[j] = inputArr[viTri];
            viTri++;
        }

        for (int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+"\t");
        }
    }
}
