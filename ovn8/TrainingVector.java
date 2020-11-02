public class TrainingVector {
    public int[] v;

    public TrainingVector(int i) {
        this.v = new int[i];
    }

    public int[] add(int value, int index) {
        int[] newArray = new int[v.length + 1];
        for (int i = 0, k = 0; i < newArray.length; i++) {
            if (i == index) {
                newArray[i] = value;
            } else {
                newArray[i] = v[k++];
            }
        }
        return newArray;
    }

    public int[] remove(int index) {
        int[] newArray = new int[v.length - 1];
        for (int i = 0, k = 0; i < v.length; i++) {
            if (i == index) {
                //System.out.println("Index: " + i + " K= " + k + " Bokstav " + (char)v[i]);
                continue;

            } else {
                //System.out.println("Index: " + i + " K= " + k);
                newArray[k++] = v[i];

            }
        }
        return newArray;
    }

    public boolean checkForPositives() {
        for (int i : v) {
            if (i <= 64) {
                return false;
            }
        }
        return true;
    }

    public int length() {
        return v.length;
    }
}

