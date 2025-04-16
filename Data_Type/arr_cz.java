package Data_Type;

import java.util.Scanner;

public class arr_cz {
    public void arr_cs(){
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数组元素：");
        int n = input.nextInt();
        double[] arr2 = new double[n];
        for (int i=0;i<n;i++)
        {
            arr2[i] = input.nextDouble();
        }
        for (int i=0;i<n;i++){
            System.out.println(arr2[i]);
        }
    }
}
