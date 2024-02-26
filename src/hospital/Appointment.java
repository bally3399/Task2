package hospital;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Appointment {
    private Date date;
    private final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private String reason;
    private Doctor doctor;
    private  Patient patient;
    private boolean confirmed = true;

    public Appointment(Date date, String reason, Doctor doctor, Patient patient) {
        this.date = date;
        this.reason = reason;
        this.doctor = doctor;
        this.patient = patient;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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

    public boolean isConfirmed() {
        return confirmed;
    }
}
