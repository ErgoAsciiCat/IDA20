public class Mandelbrot {
    public static void main(String[] args) {
        MandelbrotGUI gui = new MandelbrotGUI();
        Generator g = new Generator();
        boolean hasImage = false;
        while (true) {
            switch (gui.getCommand()) {
                case MandelbrotGUI.QUIT:
                    System.exit(0); // Stänger ner programmet
                    break;
                case MandelbrotGUI.RESET:
                    gui.resetPlane(); // Återställer värden på koordinataxlarna
                    gui.clearPlane(); // Nollställer informationen i fönstret
                    hasImage = false;
                    break;
                case MandelbrotGUI.ZOOM: // Zoomar in på informationen i fönstret
                    if (hasImage) {
                        g.render(gui);
                    }
                    else{
                        gui.resetPlane();
                    }
                    break;
                case MandelbrotGUI.RENDER:
                    hasImage = true;
                    g.render(gui);
                    break;
            }
        }
    }
}