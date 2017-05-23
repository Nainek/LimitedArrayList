package ua.training;

import static org.junit.Assert.*;

import org.junit.Test;
import ua.training.model.Book;
import ua.training.model.LimitedBookList;
import ua.training.model.Page;
import ua.training.view.View;


public class LimitedBookListTest {

    @Test
    public void testListImmutability() {

        LimitedBookList limitedBookList = new LimitedBookList();
        Page page1 = new Page(100);
        Book book1 = new Book(page1, 50);

        limitedBookList.add(book1);

        Book book2 = limitedBookList.get(0);
        book2.setCost(70);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        String expected = "Book{page=Page{numberOfPages=100}, cost=50}";
        String actual = book1.toString();
        assertEquals(expected, actual);


    }

}





