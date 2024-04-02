package HospitalSystem;

import java.util.Objects;

public class Financial {

    Integer id;
    String accountNumber;
    String bankName;
    Double salary;
    Double taxRate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Financial financial = (Financial) o;
        return Objects.equals(accountNumber, financial.accountNumber) && Objects.equals(bankName, financial.bankName) && Objects.equals(salary, financial.salary) && Objects.equals(taxRate, financial.taxRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, bankName, salary, taxRate);
    }

    @Override
    public String toString() {
        return "Financial{" +
                "accountNumber='" + accountNumber + '\'' +
                ", bankName='" + bankName + '\'' +
                ", salary=" + salary +
                ", taxRate=" + taxRate +
                '}';
    }
}
