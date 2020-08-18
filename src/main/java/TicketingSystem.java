public class TicketingSystem {
    private ParkingLot parkingLot;
    private static TicketingSystem ticketingSystem;

    private TicketingSystem() {
        parkingLot = ParkingLot.getInstance();
    }

    public static TicketingSystem getInstance() {
        if (ticketingSystem == null) {
            ticketingSystem = new TicketingSystem();
        }
        return ticketingSystem;
    }

    public ParkingTicket issueTicket(String state, Customer customer) {
        TicketingSystem ticketingSystem = TicketingSystem.getInstance();
        Slot slotNo = ticketingSystem.getParkingLot().getParkingSlots();
        ticketingSystem.getParkingLot().updateParkingSlotRemoval(state, slotNo);

        ParkingTicket parkingTicket = new ParkingTicket(slotNo.getSlotNumber());
        customer.setParkingTicket(parkingTicket);
        return parkingTicket;

    }

    ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket leaveParking(String leave, Customer customer, int slotNo) {
        TicketingSystem ticketingSystem = TicketingSystem.getInstance();
         ticketingSystem.getParkingLot().updateParkingSlotRemoval(leave, slotNo);

        ParkingTicket parkingTicket = new ParkingTicket(slotNo);
        customer.setParkingTicket(parkingTicket);
        return parkingTicket;

    }
}
