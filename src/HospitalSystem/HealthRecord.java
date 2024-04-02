package HospitalSystem;

import java.util.Objects;

public class HealthRecord {

    Integer id;
    String height;
    String weight;
    String bloodType;
    String allergies;
    String medications;
    String healthStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getMedications() {
        return medications;
    }

    public void setMedications(String medications) {
        this.medications = medications;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HealthRecord that = (HealthRecord) o;
        return Objects.equals(height, that.height) && Objects.equals(weight, that.weight) && Objects.equals(bloodType, that.bloodType) && Objects.equals(allergies, that.allergies) && Objects.equals(medications, that.medications) && Objects.equals(healthStatus, that.healthStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, weight, bloodType, allergies, medications, healthStatus);
    }

    @Override
    public String toString() {
        return "HealthRecord{" +
                "height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", allergies='" + allergies + '\'' +
                ", medications='" + medications + '\'' +
                ", healthStatus='" + healthStatus + '\'' +
                '}';
    }
}
