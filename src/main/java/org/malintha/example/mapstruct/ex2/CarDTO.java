package org.malintha.example.mapstruct.ex2;

public class CarDTO {

    private String yearOfMake;
    private int seatCount;
    private String type;

    public String getYearOfMake() {
        return yearOfMake;
    }

    public void setYearOfMake(String yearOfMake) {
        this.yearOfMake = yearOfMake;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "yearOfMake='" + yearOfMake + '\'' +
                ", seatCount=" + seatCount +
                ", type='" + type + '\'' +
                '}';
    }
}
