package hospital;

public class Medication {
    private String name;
    private String dosage;
    private String frequency;
    private Doctor doctor;
    private Patient patient;

    public Medication(String name, String dosage, String frequency, Doctor doctor, Patient patient) {
        this.name = name;
        this.dosage = dosage;
        this.frequency = frequency;
        this.doctor = doctor;
        this.patient = patient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
