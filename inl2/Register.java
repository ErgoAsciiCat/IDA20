import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Register {
    private final ArrayList<Book> reg;

    // registret skall lagras i en ArrayList
//... Konstruktor och alla metoderna för registerhanteringen'
    public Register() {
        reg = new ArrayList<>();
    }

    public int find(Book b) {
        for (int i = 0; i < reg.size(); i++) {
            int res = b.compareTo(reg.get(i));
            if (res == 0) return i;
            if (res < 0) return -(i + 1);
        }
        return -(reg.size() + 1);
    }

    public void add(Book b) {
        int pos = find(b);
        if (pos >= 0) return;
        reg.add(-(pos + 1), b);
    }

    /*public void remove(Book b) {
        int pos = find(b);
        if (pos < 0) return;
        reg.remove(pos);
    }*/

    private void swap(int i, int j) {
        Book c = reg.get(i);
        Book d = reg.get(j);
        reg.set(i, d);
        reg.set(j, c);
    }

    public void sort() {
        for (int i = 0; i < reg.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < reg.size(); j++)
                if (reg.get(j).compareTo(reg.get(min)) < 0) min = j;
            swap(i, min);
        }
    }


    public void purgeAuthor(String input) {
        reg.removeIf(registeredBook -> registeredBook.getAuthor().equals(input));
    }

    public String searchAuthor(String input) {
        StringBuilder response = new StringBuilder();

        for (Book registeredBook : reg) {
            if (registeredBook.getAuthor().toLowerCase().contains(input.toLowerCase())) {
                response.append(registeredBook);
                response.append("\n");
            }
        }

        return response.toString();
    }

    public String searchTitle(String input) {
        StringBuilder response = new StringBuilder();

        for (Book registeredBook : reg) {
            if (registeredBook.getTitle().toLowerCase().contains(input.toLowerCase())) {
                response.append(registeredBook);
                response.append("\n");
            }
        }

        return response.toString();
    }

    public String contentsAuthor() {
        StringBuilder response = new StringBuilder();
        for (Book registeredBook : reg) {
            response.append(registeredBook);
            response.append("\n");
        }
        return response.toString();
    }

    public String contentsTitle() {
        ArrayList<Book> regTitles = sortedByTitle();
        StringBuilder response = new StringBuilder();
        for (Book registeredBook : regTitles) {
            response.append(registeredBook);
            response.append("\n");
        }
        return response.toString();
    }

    public ArrayList<Book> sortedByTitle() {
        ArrayList<Book> temp = new ArrayList<>(reg);
        for (int i = 0; i < temp.size() - 1; i++) { // Sortering
            int min = i;
            for (int j = i + 1; j < temp.size(); j++) {
                String jTitle = temp.get(j).getTitle();
                String titleMin = temp.get(min).getTitle();
                if (jTitle.compareTo(titleMin) < 0)
                    min = j;
            }
            Book b = temp.get(i);
            Book d = temp.get(min);
            temp.set(i, d);
            temp.set(min, b); // Swap
        }
        return temp;
    }
        /** Läser registret från filen med namn fileName. */
   public void readFromFile(String fileName) {
        Scanner scan = null;
        try {
        scan = new Scanner(new File(fileName + ".txt"));
        } catch (FileNotFoundException e) {
        System.err.println("Filen kunde inte öppnas");
        System.exit(1);
        }
       while (scan.hasNextLine()){
           Book b = new Book(scan.nextLine(), scan.nextLine());
           reg.add(b);
           if(scan.hasNextLine()) scan.nextLine();
       }
       sort();
   }


    /** Sparar registret på fil med namnet fileName. */
    public void writeToFile(String fileName) {
//... Se ledning för filhanteringen sist i uppgiften
        PrintWriter out = null;
        try {
            out = new PrintWriter(new File(fileName+".txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Filen kunde inte öppnas");
            System.exit(1);
        }
        for (Book b : reg){
            out.println(b);
        }
        out.close(); // stänger filen

    }


}
