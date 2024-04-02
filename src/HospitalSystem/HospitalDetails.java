package HospitalSystem;

import java.util.List;
import java.util.Objects;

public class HospitalDetails {
    Integer id;
    String name;
    Address address;
    Contact contact;
    List<Department> departments;
    List<Doctor>doctors;
    List<Patient>patients;
    Financial financial;
    List<Medicine> medicines;
    List<Nurse>nurses;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
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

    public List<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(List<Nurse> nurses) {
        this.nurses = nurses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HospitalDetails that = (HospitalDetails) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(contact, that.contact) && Objects.equals(departments, that.departments) && Objects.equals(doctors, that.doctors) && Objects.equals(patients, that.patients) && Objects.equals(financial, that.financial) && Objects.equals(medicines, that.medicines) && Objects.equals(nurses, that.nurses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, contact, departments, doctors, patients, financial, medicines, nurses);
    }

    @Override
    public String toString() {
        return "HospitalDetails{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", contact=" + contact +
                ", departments=" + departments +
                ", doctors=" + doctors +
                ", patients=" + patients +
                ", financial=" + financial +
                ", medicines=" + medicines +
                ", nurses=" + nurses +
                '}';
    }
}
