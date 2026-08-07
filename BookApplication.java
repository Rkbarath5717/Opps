public class Book{
    private int id;
    private String title;
    private String author;
    private boolean issued;
    Book(int id,String title,String author,boolean issued){
        this.id=id;
        this.title=title;
        this.author=author;
        this.issued=false;
    }
    public int getId(){
        return id;
    }
    public boolean isIssued(){
        return issued;
    }
    public void setIssued(boolean issued){
        this.issued=issued;
    }
    @Override
    public String toString(){
        return id+
                title+
                author+
                (issued ? "Issued" : "Available");
    }
}
public class LibraryService{
    ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book is added");
    }
    public void viewBooks(){
        if(books.isEmpty()){
            System.out.println("No books are there");
            return;
        }
        for(Book b : books){
            System.out.println(b);
        }
    }
    public Book searchBook(int id){
        for(Book b : books){
            if(b.getId()==id){
                return b;
            }
        }
        return null;
    }
    public void issuedBook(int id){
        Book book = searchBook(id);
        if(book==null){
            System.out.println("book is not found");
            return;
        }
        if(book.isIssued()){
            
        }
    }
}











public class BookApplication {
    public static void main(String[] args) {
        
    }
}