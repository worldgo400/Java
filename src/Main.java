import Book.BookList;
import User.Admin;
import User.NormalUser;
import User.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      1：  准备数据
        BookList bookList=new BookList();
//      2：建立用户
        User user=login();
        while (true){
            int choice=user.menu();
            user.doAction(choice,bookList);

        }
    }
    public static User login(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入登录系统");
        System.out.println("请输入您的姓名");
        String name=scanner.next();
        System.out.println("亲输入您的身份：1 表示管理员  2  表示普通用户");
        int who=scanner.nextInt();
        if (who==1){
            return new Admin(name);
        }else {
            return new NormalUser(name);
        }
    }
}
