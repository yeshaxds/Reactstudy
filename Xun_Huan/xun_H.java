package Xun_Huan;

import java.util.Scanner;

public class xun_H {
    public void for_XH() {
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println("普通for循环");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            System.out.print(",");
        }
        System.out.print("\n");
        System.out.println("增强for循环");
        for (int num : nums) {
            System.out.print(num);
            System.out.print(",");
        }
        System.out.println("\n");
    }

    public void While_XH() {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 2) {
                System.out.println("跳过本次循环");
                continue; // 跳过本次循环
            }
            System.out.print(i);
            if (i == 8) {
                System.out.println("跳出去咯");
                break; // 跳出循环
            }

        }
    }

    public void DoWhile_XH() {
        int i = 0;
        do {
            System.out.print(i);
            i++;
        } while (i < 10);
        System.out.println("\n");
    }

    public void Switch_XH() {
        // 输入
        Scanner input = new Scanner(System.in);
        System.out.println("输入成绩：");
        char score = input.next().charAt(0);
        // 匹配
        switch (score) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }
        System.out.println(score);
    }
}
