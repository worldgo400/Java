package User;

import Action.*;
import Book.BookList;

import java.util.Scanner;

public class NormalUser extends User {
    public NormalUser(String name) {
        this.name = name;
        actions = new IAction[]{
                new ExitAction(),
        new FindAction(),
        new BorrowAction(),
        new ReturnAction(),
                };
    }

    @Override
    public int menu() {
        System.out.println("==================");
        System.out.println("欢迎"+this.name+"使用图书管理系统");
        System.out.println("1.查找书籍");
        System.out.println("2.借书");
        System.out.println("3.还书");
        System.out.println("0.退出");
        System.out.println("==================");
        System.out.println("请输入你的选项");
        Scanner scanner=new Scanner(System.in);
         int choice=scanner.nextInt();
         return choice;
    }
}
