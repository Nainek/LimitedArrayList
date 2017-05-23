package ua.training.model;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class LimitedBookList {

    private List<Book> list = new ArrayList<Book>();


    public boolean add(Book t) {

        return list.add(t);
    }

    public boolean addAll(Collection<Book> c) {
        return list.addAll(c);
    }

    public boolean contains(Book book) {
        return list.contains(book);
    }

    public boolean containsAll(Collection<Book> c) {
        return list.containsAll(c);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public Book get(int index) {
        Book t = list.get(index);
        return t.clone();
    }

    public LimitedBookList(List<Book> list) {
        this.list = list;
    }

    public LimitedBookList() {
    }

}
