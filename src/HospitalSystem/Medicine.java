package HospitalSystem;

import java.util.Objects;

public class Medicine {
    Integer id;
    String name;
    String description;
    Integer quantity;
    String expiryDate;
    String manufacturer;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medicine medicine = (Medicine) o;
        return Objects.equals(name, medicine.name) && Objects.equals(description, medicine.description) && Objects.equals(quantity, medicine.quantity) && Objects.equals(expiryDate, medicine.expiryDate) && Objects.equals(manufacturer, medicine.manufacturer);
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", expiryDate='" + expiryDate + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, quantity, expiryDate, manufacturer);
    }
}
