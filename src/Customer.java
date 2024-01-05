import java.util.Objects;

public class Customer {

    private String name;

    private long NationalNumber;

    public Customer() {
    }

    public Customer(String name, long nationalNumber) {
        this.name = name;
        NationalNumber = nationalNumber;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public long getNationalNumber() {
        return NationalNumber;
    }

    public Customer setNationalNumber(long nationalNumber) {
        NationalNumber = nationalNumber;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return NationalNumber == customer.NationalNumber && name.equals(customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, NationalNumber);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", NationalNumber=" + NationalNumber +
                '}';
    }
}

