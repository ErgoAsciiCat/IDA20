public class TestComplex {

    public static void main(String[] args) {
        Complex a = new Complex(0.4, -0.8);
        Complex b = new Complex(1, 2);
        b.add(a); // b = 1.4 + 1.2i
        a.mul(b); // b = (1.4 + 1.2i) * (0.4 - 0.8i) = 1.52 - 0.64i
        System.out.println(b.getRe()); // Skriver ut realdelen
        System.out.println(b.getIm()); // Skriver ut imaginärdelen
        System.out.println(a.getRe()); // Skriver ut realdelen
        System.out.println(a.getIm()); // Skriver ut imaginärdelen
    }

}