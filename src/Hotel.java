public class Hotel {
    private String hotelName;
    private String roomNumber;
    private double price;

    public Hotel(String hotelName, String roomNumber, double price) {
        this.hotelName = hotelName;
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public Hotel(){
        hotelName = "Mirage";
        roomNumber = "218";
        price = 70;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", price=" + price +
                '}';
    }
}
