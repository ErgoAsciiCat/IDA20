import java.awt.Color;

public class Generator {
    private int pixelSize = 1; // Standardupplösning
    private int MAX_ITER = 200; // Högsta antalet iterationer
    private int count = 0; // Räknare för absolutbeloppet

    /** Ritar en bild i fönstret i användargränssnittet gui */
    public void render(MandelbrotGUI gui) {
        gui.disableInput(); // Gör att knapparna i
        // användargränssnittet inte reagerar på tryck och
        // att beräkningarna inte störs av att användaren
        // gör operationer i fönstret.

        // Anropar mesh för att skapa matrisen med komplexatal.
        Complex[][] complex = mesh(gui.getMinimumReal(), gui.getMaximumReal(),
                gui.getMinimumImag(), gui.getMaximumImag(), gui.getWidth(),
                gui.getHeight());

        Color[] colorScale = new Color[MAX_ITER + 1];

        // Beräknar färgen för varje iteration
        for (int i = 0; i < MAX_ITER; i++) {
            colorScale[i] = new Color(i + 1, i, i + 50);

        }

        switch (gui.getResolution()) {
// 1x1
            case MandelbrotGUI.RESOLUTION_VERY_HIGH -> pixelSize = 1;
// 3x3
            case MandelbrotGUI.RESOLUTION_HIGH -> pixelSize = 3;
// 5x5
            case MandelbrotGUI.RESOLUTION_MEDIUM -> pixelSize = 5;
// 7x7
            case MandelbrotGUI.RESOLUTION_LOW -> pixelSize = 7;
// 9x9
            case MandelbrotGUI.RESOLUTION_VERY_LOW -> pixelSize = 9;
        }

        // Skapar matrisen som innehåller bildpunkterna som ska ritas.
        Color[][] picture = new Color[gui.getHeight() / pixelSize][gui
                .getWidth() / pixelSize];

        for (int i = 0; i < complex.length / pixelSize; i++) {
            for (int j = 0; j < complex[i].length / pixelSize; j++) {
                Complex c = complex[i * pixelSize + pixelSize / 2][j
                        * pixelSize + pixelSize / 2];
                Complex z = new Complex(0, 0);

                while (count < MAX_ITER && z.getAbs2() <= 4) {
                    z.mul(z);
                    z.add(c);
                    count++;
                }

                // Programmet i färg eller i svartvitt.
                switch (gui.getMode()) {
                    case MandelbrotGUI.MODE_COLOR:
                        if (count < MAX_ITER) {
                            picture[i][j] = colorScale[count];
                        } else {
                            picture[i][j] = Color.MAGENTA;
                        }
                        break;
                    case MandelbrotGUI.MODE_BW:
                        if (z.getAbs2() <= 4) {
                            picture[i][j] = Color.BLACK;
                        } else {
                            picture[i][j] = Color.WHITE;
                        }
                }
                count = 0;
            }
        }
        // När varje element har fått en färg ritas bilden med putData i
        // MandelbrotGUI.
        gui.putData(picture, pixelSize, pixelSize);
        gui.enableInput(); // Återställer funktionen hos
        // användargränssnittets
        // knappar.
    }

    /**
     * Skapar en matris där varje element är ett komplext tal som har rätt
     * koordinater
     */
    private Complex[][] mesh(double minRe, double maxRe, double minIm,
                             double maxIm, int width, int height) {

        // Generera komplexa tal till matrisen.
        Complex[][] mesh = new Complex[height][width];

        for (int i = 0; i < mesh.length; i++) {
            for (int j = 0; j < mesh[i].length; j++) {
                double x = minRe + (-minRe + maxRe) / (width - 1) * j;
                double y = maxIm - (-minIm + maxIm) / (height - 1) * i;
                mesh[i][j] = new Complex(x, y);
            }
        }
        return mesh;
    }
}
