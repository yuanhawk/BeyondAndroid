package tech.yuanhawk.fragmentsample.models;

public class ExchangeRate {

    private String unitA;
    private String unitB;

    public ExchangeRate(String unitA, String unitB) {
        this.unitA = unitA;
        this.unitB = unitB;
    }

    public String getUnitA() {
        return unitA;
    }

    public void setUnitA(String unitA) {
        this.unitA = unitA;
    }

    public String getUnitB() {
        return unitB;
    }

    public void setUnitB(String unitB) {
        this.unitB = unitB;
    }
}
