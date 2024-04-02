package HospitalSystem;

import java.util.List;
import java.util.Objects;

public class Patient {
    Integer id;
    PersonalDetails personalDetails;
    Contact contact;
    Address address;
    HealthRecord healthRecord;
    Department department;
    Financial financial;
    List<Medicine> medicines;
    Doctor doctor;
    Nurse nurse;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public HealthRecord getHealthRecord() {
        return healthRecord;
    }

    public void setHealthRecord(HealthRecord healthRecord) {
        this.healthRecord = healthRecord;
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

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(personalDetails, patient.personalDetails) && Objects.equals(contact, patient.contact) && Objects.equals(address, patient.address) && Objects.equals(healthRecord, patient.healthRecord) && Objects.equals(department, patient.department) && Objects.equals(financial, patient.financial) && Objects.equals(medicines, patient.medicines) && Objects.equals(doctor, patient.doctor) && Objects.equals(nurse, patient.nurse);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "personalDetails=" + personalDetails +
                ", contact=" + contact +
                ", address=" + address +
                ", healthRecord=" + healthRecord +
                ", department=" + department +
                ", financial=" + financial +
                ", medicines=" + medicines +
                ", doctor=" + doctor +
                ", nurse=" + nurse +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalDetails, contact, address, healthRecord, department, financial, medicines, doctor, nurse);
    }
}
