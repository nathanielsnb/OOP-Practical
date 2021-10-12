package practical.pkg7;

public class InpatientBill extends PatientBill {
    private double specialistCharges, labCharges;
    private char roomType;
    private int duration;
    private static double stdRate = 100;
    private static double privateRate = 200;

     public InpatientBill() {
     }

     public InpatientBill(String name, double specialistCharges, double labCharges, char roomType, int duration) {
            super(name);
            this.specialistCharges = specialistCharges;
            this.labCharges = labCharges;
            this.roomType = roomType;
            this.duration = duration;
     }

    public double getSpecialistCharges() {
        return specialistCharges;
    }

    public double getLabCharges() {
        return labCharges;
    }

    public char getRoomType() {
        return roomType;
    }

    public int getDuration() {
        return duration;
    }

    public void setSpecialistCharges(double specialistCharges) {
        this.specialistCharges = specialistCharges;
    }

    public void setLabCharges(double labCharges) {
        this.labCharges = labCharges;
    }

    public void setRoomType(char roomType) {
        this.roomType = roomType;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

     public double calcTotalCharges() {
              double roomCharges = 0;
              switch(roomType) {
                  case 'S' : roomCharges = duration * stdRate; break;
                  case 'P' : roomCharges = duration * privateRate; break;
              }
              return specialistCharges + labCharges + roomCharges;
    }
}
