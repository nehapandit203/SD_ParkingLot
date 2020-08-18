import java.util.HashMap;
import java.util.Map;

public class ParkingLot implements ParkingConstant {
    Integer totalNoOfParking = 10;
    private Map<Integer, Slot> slots;
    private static ParkingLot parkingLot;

    private ParkingLot() {
        fillParkingSlots();
    }

    public static ParkingLot getInstance() {
        if (parkingLot == null) {
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }

    public void fillParkingSlots() {
        slots = new HashMap<Integer, Slot>();
        for (int i = 1; i <= totalNoOfParking; i++) {
            slots.put(i, new Slot(i));
        }
    }

    public Slot getParkingSlots() {
        Slot slot = null;
        for (int i = 1; i <= 10; i++) {
            if (slots.get(i).isStatus() == false) {
                slot = slots.get(i);
                break;

            }
        }
        return slot;
    }

    public void updateParkingSlotRemoval(String state, Slot slot) {
        if (state.equalsIgnoreCase(ParkingState.PARK)) {
            if (slots.get(slot.getSlotNumber()).isStatus() == false) {
                slot.setStatus(true);
                slots.put(slot.getSlotNumber(), slot);
            } else
                throw new IllegalStateException("Sorry, Parking is full");

        }
    }

    public void updateParkingSlotRemoval(String state, int slotNo) {
        if (state.equalsIgnoreCase(ParkingState.LEAVE)) {
            if (slots.get(slotNo).isStatus()) {
                slots.get(slotNo).setStatus(false);
                slots.put(slots.get(slotNo).getSlotNumber(), slots.get(slotNo));
            } else
                throw new IllegalStateException("At Exit : state found true should be false");
        }

    }

}
