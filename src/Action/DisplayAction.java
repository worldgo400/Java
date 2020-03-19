package Action;

import Book.Book;
import Book.BookList;

public class DisplayAction implements IAction {
    @Override
    public void work(BookList bookList) {
        for (int i=0;i<bookList.getSize();i++){
            Book book=bookList.getBooks(i);
            System.out.println(book);
        }
    }
}
