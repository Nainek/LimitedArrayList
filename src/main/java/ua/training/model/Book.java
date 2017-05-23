package ua.training.model;


public final class Book{

    private Page page;
    private int cost;

    public Book(Page page, int cost) {
        super();
        this.page = page.clone();
        this.cost = cost;
    }

    public Page getPage() {
        return page.clone();
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "page=" + page +
                ", cost=" + cost +
                '}';
    }

    @Override
    public Book clone() {
        try{
            Book result = new Book(page, cost);
            return result;
        }catch(Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
