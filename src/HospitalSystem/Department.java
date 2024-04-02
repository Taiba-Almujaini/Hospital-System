package HospitalSystem;

import java.util.List;
import java.util.Objects;

public class Department {
    Integer id;
    String name;
    String head;
    List<Doctor> doctors;
    List<Patient> patients;
    List<Nurse> nurses;

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

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
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
        Department that = (Department) o;
        return Objects.equals(name, that.name) && Objects.equals(head, that.head) && Objects.equals(doctors, that.doctors) && Objects.equals(patients, that.patients) && Objects.equals(nurses, that.nurses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, doctors, patients, nurses);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", head='" + head + '\'' +
                ", doctors=" + doctors +
                ", patients=" + patients +
                ", nurses=" + nurses +
                '}';
    }
}
