package HospitalSystem;

import java.util.List;
import java.util.Objects;

public class Nurse {
    Integer id;
    PersonalDetails personalDetails;
    Contact contact;
    Department department;
    HealthRecord healthRecord;
    Address address;
    Financial financial;
    List<Medicine> medicines;
    List<Patient> patients;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public HealthRecord getHealthRecord() {
        return healthRecord;
    }

    public void setHealthRecord(HealthRecord healthRecord) {
        this.healthRecord = healthRecord;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Financial getFinancial() {
        return financial;
    }

    public void setFinancial(Financial financial) {
        this.financial = financial;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<Medicine> medicines) {
        this.medicines = medicines;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nurse nurse = (Nurse) o;
        return Objects.equals(personalDetails, nurse.personalDetails) && Objects.equals(contact, nurse.contact) && Objects.equals(department, nurse.department) && Objects.equals(healthRecord, nurse.healthRecord) && Objects.equals(address, nurse.address) && Objects.equals(financial, nurse.financial) && Objects.equals(medicines, nurse.medicines) && Objects.equals(patients, nurse.patients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalDetails, contact, department, healthRecord, address, financial, medicines, patients);
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "personalDetails=" + personalDetails +
                ", contact=" + contact +
                ", department=" + department +
                ", healthRecord=" + healthRecord +
                ", address=" + address +
                ", financial=" + financial +
                ", medicines=" + medicines +
                ", patients=" + patients +
                '}';
    }
}
