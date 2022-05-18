package entities;

public class Temperatures  {

    private String month;
    private double temp;

    public Temperatures(String month, Double temp) {
        this.month = month;
        this.temp = temp;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Double getTemp(int i) {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    /* @Override
    public String toString() {
        return "[" + month + ", " + temp + "]\n";
    } */

}
