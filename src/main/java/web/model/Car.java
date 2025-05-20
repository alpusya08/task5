package web.model;

public class Car {
    private String model;
    private int series;
    private String color;

    public Car (String model, int series, String color) {
        this.color = color;
        this.series = series;
        this.model = model;
    }

    public Car () {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
