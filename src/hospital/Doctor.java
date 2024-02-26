package hospital;

public class Doctor {
    private String name;
    private String specialization;
    private String contact;

    public Doctor(String name, String specialization, String contact) {
        this.name = name;
        this.specialization = specialization;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void scheduleAppoint() {
    }
}
