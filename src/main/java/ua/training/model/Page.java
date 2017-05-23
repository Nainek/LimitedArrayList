package ua.training.model;


public class Page implements Cloneable{

    private int numberOfPages;

    public Page(int numberOfPages) {
        super();
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Page{" +
                "numberOfPages=" + numberOfPages +
                '}';
    }

    @Override
    public Page clone() {
        try{
            return (Page)super.clone();
        } catch(Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
