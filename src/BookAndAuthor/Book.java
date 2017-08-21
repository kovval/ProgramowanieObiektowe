package BookAndAuthor;

/**
 * Created by RENT on 2017-08-21.
 */
public class Book {
    private String _name;
    private Author _author;
    private double _price;
    private int _qty = 0;

    public Book(String name, Author author, double price){
        _name = name;
        _author = author;
        _price = price;
    }

    public String getName() {
        return _name;
    }

    public Author getAuthor() {
        return _author;
    }

    public double getPrice() {
        return _price;
    }

    public int getQty() {
        return _qty;
    }

    public void setPrice(double price) {
        this._price = price;
    }

    public void setQty(int qty) {
        this._qty = qty;
    }

    public Book(String name, Author author, double price, int qty){
        _name = name;
        _author = author;
        _price = price;
        _qty = qty;
    }

    public String toString(){
        return String.format("book[name= %s, Author[name=%s, email=%s, gender=%s], price= %f, qty= %d]",
                _name, _author, _author.getEmail(), _author.getGender(), _price, _qty );
    }



}
