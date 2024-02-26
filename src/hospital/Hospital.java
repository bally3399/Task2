package hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private String address;
    private String contactInformation;
    private final List<Department> departments = new ArrayList<>();


    public Hospital(String name, String address, String contactInformation) {
        this.name = name;
        this.address = address;
        this.contactInformation = contactInformation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }
}
