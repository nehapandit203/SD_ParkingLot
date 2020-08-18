public class Customer implements ParkingConstant {
    String liscence;
    String customerName;
    IVehical vehical;
    ParkingTicket parkingTicket;
    // PaymentMode paymentMode;
    //ParkingStatus parkingStatus;

    public Customer(String customerId, String customerName, IVehical vehical) {
        this.customerName = customerName;
        this.liscence = customerId;
        this.vehical = vehical;
    }

    public void setParkingTicket(ParkingTicket parkingTicket) {
        this.parkingTicket = parkingTicket;
    }

    void cutomerRequest(String request) {
        TicketingSystem ticketingSystem = TicketingSystem.getInstance();

        if (ParkingState.CREATE_PARKING.equals(request)) {// Statements

            ParkingLot parkingLot = ticketingSystem.getParkingLot();
        } else if (ParkingState.PARK.equals(request)) {// Statements

            System.out.println(ticketingSystem.issueTicket(ParkingState.PARK, this));

        } else if (ParkingState.LEAVE.equals(request)) {// Statements
            System.out.println(ticketingSystem.leaveParking(ParkingState.LEAVE, this, 1).toString());

        }

    }

    @Override
    public String toString() {
        return "Customer{" +
                "liscence='" + liscence + '\'' +
                ", customerName='" + customerName + '\'' +
                ", vehical=" + vehical +
                ", parkingTicket=" + parkingTicket +
                '}';
    }
}
