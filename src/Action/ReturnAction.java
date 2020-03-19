package Action;

import Book.Book;
import Book.BookList;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReturnAction implements IAction {
    @Override
    public void work(BookList bookList) {
        System.out.println("请执行还书操作");
        System.out.println("请输入你要归还书籍的书名");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        for (int i=0;i<bookList.getSize();i++){
            Book book=bookList.getBooks(i);
            if (book.getName().equals(name)){
                if (book.isBorrowed()){
                    book.setBorrowed(false);
                    System.out.println("还书成功");
                    return;
                }
            }

        }
    }
}
