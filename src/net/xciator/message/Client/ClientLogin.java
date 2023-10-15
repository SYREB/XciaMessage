package net.xciator.message.Client;

import java.util.Scanner;
import net.xciator.sha512hash.SHA512Util;

public class ClientLogin {
    public boolean ClientLogin(){
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();

        System.out.println("登录请求");
        System.out.println("Waiting for login request");
        String choice = scanner.next();

        if (choice.equals("Login")) {
            System.out.println("Waiting for login name");

            // 查询数据库，检索用户名

            if (/*检索数据库是否存在用户*/true) {
                System.out.println("Waiting for login password");
                String password = scanner.next();

                SHA512Util sha512Util = new SHA512Util();
                String pwd = sha512Util.getSHA512hash(password);
                System.out.println("SHA512 output: " + pwd);

                // 查询数据库，核对密码


                if (/*检索数据库核对密码*/true) {
                    System.out.println("Login success");
                    // 进行其他操作
                } else {
                    System.out.println("Login failed ");
                }
            } else {
                System.out.println("账号或密码错误");
            }
        } else if (choice.equals("register")) {
            System.out.println("请输入用户名（3~16位数字、字母或中文字符）：");
            System.out.println("请输入手机号：");

            // 检查手机号格式
        }

        // 检查手机号格式是否正确
            // 此处添加检查手机号格式的逻辑
        return true;
    }

}
