public class Buch {
    
    //Variablen in der Klasse Buch
    //private beduetet das nur die Klasse Buch darauf zugreifen kann
    
    private String title;
    private long isbn;
    
    
    //Konstruktor
    
    Buch(long isbn, String title){
        this.isbn = isbn;       //hier wird der übergabe wert isbn diesem isbn übergeben.
        this.title = title;     //hier wird der übergabe title isbn diesem title übergeben.
        Bibliothek.count++;
        checkIfFull(Bibliothek.count);
        System.out.println(Bibliothek.count);
    }
    
    private void checkIfFull (int count){
        if (count>10){
            Bibliothek.count--;
            System.out.println("Die Bibliothek quillt über! Du kannst dein Buch behalten!");
        }
    }
    
    public Buch borrowBook(){
        return this;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public Long getIsbn(){
        return this.isbn;
    }
    
}
