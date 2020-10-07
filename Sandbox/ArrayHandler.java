public class ArrayHandler {
    /** Returnerar en ny vektor med samma tal som i v men med de
        negativa talen ersatta med nollor. */
    public static int[] negate(int[] v) {
        int[] vCopy = new int[v.length];
        for (int i = 0; i < v.length; i++) {
            if (v[i] < 0) {
                vCopy[i] = 0;
            } else {
                vCopy[i] = v[i];
            }
        }
        return vCopy;
    }

    // övriga metoder i klassen
}