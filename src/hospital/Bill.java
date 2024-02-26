package hospital;

public class Bill {
    private Patient patient;
    private int medicationCost;
    private int doctorFee;
    private int totalAmount = 0;

    public Bill(Patient patient, int medicationCost, int doctorFee, int totalAmount) {
        this.patient = patient;
        this.medicationCost = medicationCost;
        this.doctorFee = doctorFee;
        this.totalAmount = totalAmount;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getMedicationCost() {
        return medicationCost;
    }

    public void setMedicationCost(int medicationCost) {
        this.medicationCost = medicationCost;
    }

    public int getDoctorFee() {
        return doctorFee;
    }

    public void setDoctorFee(int doctorFee) {
        this.doctorFee = doctorFee;
    }

    public int getTotalAmount() {
        return totalAmount;
    }
}
