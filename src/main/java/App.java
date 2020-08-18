public class App {
    public static void main(String[] args) {
        Customer customer = new Customer("CS123", "Nanni", new Car("DL1234", VehicalType.Car, "BLUE"));

        customer.cutomerRequest(ParkingConstant.ParkingState.PARK);
        customer.cutomerRequest(ParkingConstant.ParkingState.LEAVE);
    }
}
