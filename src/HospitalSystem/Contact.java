package HospitalSystem;

import java.util.Objects;

public class Contact {
  Integer id;
  String phoneNo;
  String email;
  String alternativeNumber;
  String officeNo;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getPhoneNo() {
    return phoneNo;
  }

  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAlternativeNumber() {
    return alternativeNumber;
  }

  public void setAlternativeNumber(String alternativeNumber) {
    this.alternativeNumber = alternativeNumber;
  }

  public String getOfficeNo() {
    return officeNo;
  }

  public void setOfficeNo(String officeNo) {
    this.officeNo = officeNo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Contact contact = (Contact) o;
    return Objects.equals(phoneNo, contact.phoneNo) && Objects.equals(email, contact.email) && Objects.equals(alternativeNumber, contact.alternativeNumber) && Objects.equals(officeNo, contact.officeNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNo, email, alternativeNumber, officeNo);
  }

  @Override
  public String toString() {
    return "Contact{" +
            "phoneNo='" + phoneNo + '\'' +
            ", email='" + email + '\'' +
            ", alternativeNumber='" + alternativeNumber + '\'' +
            ", officeNo='" + officeNo + '\'' +
            '}';
  }
}
