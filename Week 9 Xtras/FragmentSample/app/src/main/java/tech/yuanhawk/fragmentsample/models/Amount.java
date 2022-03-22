package tech.yuanhawk.fragmentsample.models;

public class Amount {

    private String amount;
    private String value;

    public Amount(String amount, String value) {
        this.amount = amount;
        this.value = value;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
