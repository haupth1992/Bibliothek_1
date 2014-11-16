/**
 *
 * @author Axel
 */
public class Bibliothek {
	
	static int count; //ist wichtig für die Anzahl der Bücher in der Bib

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Buch buch1 = new Buch(1234567890123L, "Dörte");
        Buch buch2 = new Buch(1234567890123L, "Dörte");
        Buch buch3 = new Buch(1234567890123L, "Dörte");
        Buch buch4 = new Buch(1234567890123L, "Dörte");
        Buch buch5 = new Buch(1234567890123L, "Dörte");
        Buch buch6 = new Buch(1234567890123L, "Dörte");
        Buch buch7 = new Buch(1234567890123L, "Dörte");
        Buch buch8 = new Buch(1234567890123L, "Dörte");
        Buch buch9 = new Buch(1234567890123L, "Dörte");
        Buch buch10 = new Buch(1234567890123L, "Dörte");
        Buch buch11 = new Buch(1234567890123L, "Dörte");
        
        Buch borrow = buch1.borrowBook();
        
        System.out.println("Yeah du bist der Beste! Du hast das Buch " + borrow.getTitle() + " mit der ISBN Nummer " + borrow.getIsbn() + ".");
    }
    
}
