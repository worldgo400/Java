package Action;

import Book.BookList;

import java.sql.SQLOutput;

public class ExitAction implements IAction {
    @Override
    public void work(BookList bookList) {
        System.out.println("GoodBye!");
        System.exit(0);
    }
}
