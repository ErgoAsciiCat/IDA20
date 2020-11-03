public class Library {

    private static final String Author = "Ange författare:";
    private static final String Title = "Ange titel:";
    private static final String File = "Ange filnamn:";

    public static void main(String[] args) {

        Dialog dialog = new Dialog();
        Register register = new Register();
        String inputAuthor;
        String inputTitle;
        String inputFile;

        while (true) {
            int command = dialog.readInt(Meny());
            //  Fråga efter författare;
            // Fråga efter titel;
            // Sätt in boken i registret;
            //  Fråga efter författare;
            switch (command) {
// 1. Sätta in en ny bok med författare och titel.
                case 1 -> {
                    inputAuthor = dialog.readString(Author);
                    inputTitle = dialog.readString(Title);
                    Book input = new Book(inputAuthor, inputTitle);
                    register.add(input);
                }
// 2. Ta bort alla böcker av en viss författare.
                case 2 -> {
                    inputAuthor = dialog.readString(Author);
                    register.purgeAuthor(inputAuthor);
                }
/* 3. Söka upp alla böcker som gäller för en viss författare. Det skall räcka att man anger en
                    del av författarnamnet. Samtliga böcker vars författare passar in skall presenteras med
                    både författare och titel.*/
                case 3 -> {
                    inputAuthor = dialog.readString(Author);
                    dialog.printString(register.searchAuthor(inputAuthor));
                }
/* 4. Söka upp den eller de böcker som har en viss titel. Böckerna skall presenteras med både
        författare och titel.*/
                case 4 -> {
                    inputTitle = dialog.readString(Title);
                    dialog.printString(register.searchTitle(inputTitle));
                }
// 5. Presentera alla böcker sorterade efter författare.
                case 5 -> dialog.printString(register.contentsAuthor());
// 6. Presentera alla böcker sorterade efter titel.
                case 6 -> dialog.printString(register.contentsTitle());
// 7. Spara registret på en fil.
                case 7 -> {
                    inputFile = dialog.readString(File);
                    register.writeToFile(inputFile);
                }
//  8. Hämta uppgifterna till registret från en fil.
                case 8 -> {
                    inputFile = dialog.readString(File);
                    register.readFromFile(inputFile);
                }
                default -> System.exit(0);
            }
        }

    }


    private static String Meny() {

        return "~Välkommen till Bibblan~\n" +
                "1. Sätt in en ny bok.\n" +
                "2. Ta bort alla böcker av en viss författare.\n" +
                "3. Sök författares bibliografi.\n" +
                "4. Sök efter boktitel.\n" +
                "5. Registrets alla böcker ; sorterade efter författare.\n" +
                "6. Presentera alla böcker ; sorterade efter titel.\n" +
                "7. Spara registret på en fil.\n" +
                "8. Hämta uppgifterna till registret från en fil.\n";
    }

}