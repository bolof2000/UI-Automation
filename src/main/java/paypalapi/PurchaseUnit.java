package paypalapi;

public class PurchaseUnit {
    private Amount amount;

    public PurchaseUnit(String curency_code,String value) {
        this.amount = new Amount(curency_code,value);
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }
}
