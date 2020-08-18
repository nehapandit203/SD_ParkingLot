 class Slot {
    // unique slot identifier
    private int slotNumber;
    // boolean status to maintain isAvailable => true=available, false=not available
    private boolean status;

    Slot(int slotNumber) {
        this.slotNumber = slotNumber;
        this.status = false;
    }

     public int getSlotNumber() {
         return slotNumber;
     }

     public void setSlotNumber(int slotNumber) {
         this.slotNumber = slotNumber;
     }

     public boolean isStatus() {
         return status;
     }

     public void setStatus(boolean status) {
         this.status = status;
     }

     @Override
     public String toString() {
         return "Slot{" +
                 "slotNumber=" + slotNumber +
                 ", status=" + status +
                 '}';
     }
 }