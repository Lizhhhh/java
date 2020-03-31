package com.marron_03;

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {
        // 已知用户名和密码,定义两个字符串即可
        String username = "marron";
        String password = "lzhhc";

        for (int i = 3; i > 0; i--) {


            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名: ");
            String name = sc.nextLine();
            System.out.println("请输入密码: ");
            String pwd = sc.nextLine();

            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i - 1 == 0) {
                    System.out.println("登录失败");
                } else {
                    System.out.printf("登录失败,你还有" + (i - 1) + "次机会");
                }
            }
        }

    }
}
