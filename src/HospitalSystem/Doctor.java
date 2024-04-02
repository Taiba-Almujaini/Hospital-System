package HospitalSystem;

import java.util.List;
import java.util.Objects;

public class Doctor {
    Integer id;
    PersonalDetails personalDetails;
    Address address;
    Contact contact;
    List<HealthRecord> healthRecords;
    Department department;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<HealthRecord> getHealthRecords() {
        return healthRecords;
    }

    public void setHealthRecords(List<HealthRecord> healthRecords) {
        this.healthRecords = healthRecords;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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
        Doctor doctor = (Doctor) o;
        return Objects.equals(personalDetails, doctor.personalDetails) && Objects.equals(address, doctor.address) && Objects.equals(contact, doctor.contact) && Objects.equals(healthRecords, doctor.healthRecords) && Objects.equals(department, doctor.department) && Objects.equals(financial, doctor.financial) && Objects.equals(medicines, doctor.medicines) && Objects.equals(patients, doctor.patients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalDetails, address, contact, healthRecords, department, financial, medicines, patients);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "personalDetails=" + personalDetails +
                ", address=" + address +
                ", contact=" + contact +
                ", healthRecords=" + healthRecords +
                ", department=" + department +
                ", financial=" + financial +
                ", medicines=" + medicines +
                ", patients=" + patients +
                '}';
    }
}
