public class Car implements IVehical {
    String vehicalNo;
    VehicalType vehicalType;
    String color;

    public Car(String vehicalNo,VehicalType vehicalType,String color){

        this.vehicalNo =vehicalNo;
        this.vehicalType =vehicalType;
        this.color =color;

    }

    public VehicalType getVehicalType() {
        return vehicalType;
    }

    public String getVehicalNo() {
        return vehicalNo;
    }

    public String getColor() {
        return color;
    }


}
