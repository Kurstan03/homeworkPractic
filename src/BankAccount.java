import java.math.BigDecimal;
import java.util.Objects;

public class BankAccount implements Cloneable{
    private String name;
    private String cardNumber;
    private BigDecimal schet;

    public BankAccount(String name, String cardNumber, BigDecimal schet) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.schet = schet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BigDecimal getSchet() {
        return schet;
    }

    public void setSchet(BigDecimal schet) {
        this.schet = schet;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(name, that.name) && Objects.equals(cardNumber, that.cardNumber) && Objects.equals(schet, that.schet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cardNumber, schet);
    }

    @Override
    protected BankAccount clone() throws CloneNotSupportedException {
        return new BankAccount(name, cardNumber, schet);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", schet=" + schet +
                '}';
    }
}
