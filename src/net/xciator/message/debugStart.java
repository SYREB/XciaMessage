package net.xciator.message;

import java.util.Scanner;
import net.xciator.message.Client.ClientLogin;

public class debugStart {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        do{
            System.out.println("选择模拟系统：1、客户端；2、服务端\n");
            if (choice == 1){
                new ClientLogin();
            } else if (choice == 2) {

            }else System.out.println("输入有误，重新输入\n");
        }while (choice != 1 && choice !=2);
    }
}
