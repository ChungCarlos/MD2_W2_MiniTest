package minitest;

import java.util.ArrayList;
import java.util.List;

public class BookManage {
    private List<Book> dList;

    public BookManage(){
        this.dList = new ArrayList<>();
    }
    public List<Book> getBook() {
        return dList;
    }
    public void addBook(Book book){
        this.dList.add(book);
    }

}
