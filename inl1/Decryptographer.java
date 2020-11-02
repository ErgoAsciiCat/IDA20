import se.lth.cs.p.inl1.nbr14.*;

public class Decryptographer {
    private Key key;
    private StringBuilder decryptedKey = new StringBuilder();

    /** Skapar ett objekt för dechiffrering där nyckeln key används */
    public Decryptographer(Key key) {
    this.key = key;

    }

    public void DecryptKey (){
        for (int i = 0 ; i <= 25 ; i++){
            decryptedKey.append(key.getLetter(i));
        }
    }


    public String decrypt(String text){
        StringBuilder decodedText = new StringBuilder();
        /** Caesar chiffer med given key och start antal steg i chiffret,
         *  antal steg ökar med ett efter varje översättning **/
        int count = 0;
        int start = key.getStart();
        char ch;


        for (int index = 0; index < text.length(); index++){
            ch = text.charAt(index);
            if(ch!=' ') {

                /** För varje textsymbol i textraden, gå tillbaka start och count antal steg **/
                int decodeSymbol = (int)ch - start - count++;


                /** Loopa Z - A **/
                while (decodeSymbol < 65) decodeSymbol += 26;


                /** Sök det överrensstämmande indexet i Key, som är samma som bokstavens ASCII - 65 **/
                int search = 0;
                while (decodeSymbol != key.getLetter(search)){
                    search++;
                }


                /** Lägg till symbolen i stringbuilder **/

                char c = (char)(search + 'A');
                    decodedText.append(c);

            } else {
                /** Ifall symbolen är mellanslag, addera ett sådant**/
                decodedText.append(' ');
            }

        }


        return decodedText.toString();
    }
}