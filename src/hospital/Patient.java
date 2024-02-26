package hospital;

public class Patient {
    private String name;
    private final String gender;
    private int age;
    private String contact;
    private String currentCondition;
    private String medicationHistory;

    public Patient(String name, String gender, int age, String contact, String currentCondition, String medicationHistory) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.contact = contact;
        this.currentCondition = currentCondition;
        this.medicationHistory = medicationHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCurrentCondition() {
        return currentCondition;
    }

    public void setCurrentCondition(String currentCondition) {
        this.currentCondition = currentCondition;
    }

    public String getMedicationHistory() {
        return medicationHistory;
    }

    public void setMedicationHistory(String medicationHistory) {
        this.medicationHistory = medicationHistory;
    }
}
