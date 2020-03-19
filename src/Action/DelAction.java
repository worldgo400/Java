package Action;

import Book.Book;
import Book.BookList;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DelAction implements IAction {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要删除的书名");
        String name=scanner.next();
        int i=0;
        for (i=0;i<bookList.getSize();i++){
            Book book=bookList.getBooks(i);
            if (book.getName().equals(name)){
                break;
            }
        }
        if (i>=bookList.getSize()){
            System.out.println("删除失败！没有匹配的书名");
            return;
        }
        int size=bookList.getSize();
        bookList.setBooks(i,bookList.getBooks(size-1));
        bookList.setSize(size-1);


    }
}
