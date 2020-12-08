public class Complex {
    private double re;
    private double im;

    /** Skapar en komplex variabel med realdelen re och imaginärdelen im */
    Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    /** Tar reda på realdelen */
    double getRe() {
        return re;
    }

    /** Tar reda på imaginärdelen */
    double getIm() {
        return im;
    }

    /** Tar reda på talets absolutbelopp i kvadrat */
    double getAbs2() {
        return Math.pow(re, 2) + Math.pow(im, 2); // Metoden returnerar värdet
        // av det första argumentet
        // upphöjt till det andra.
        // Dvs (re+im)^2.
    }

    /** Adderar det komplexa talet c till detta tal */
    void add(Complex c) {
        im += c.getIm();
        re += c.getRe();
    }

    /** Multiplicerar detta tal med det komplexa talet c */
    void mul(Complex c) {
        double real = getRe() * c.getRe() - getIm() * c.getIm();
        im = getRe() * c.getIm() + getIm() * c.getRe();
        re = real;
    }

}