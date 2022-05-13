package Temperature;

import javax.swing.*;

public class MyListModel extends AbstractListModel<String> {

    private int min, max;

    public MyListModel(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public int getSize() {
        return max - min + 1;
    }

    public double getCelsius(int index) {
        return index + min;
    }

    public double getFahrenheit(int index) {
        return getCelsius(index) * 1.8 + 32;
    }

    @Override
    public String getElementAt(int index) {
        return getCelsius(index) + " degrees C = " + getFahrenheit(index) + " degrees F";
    }
}
