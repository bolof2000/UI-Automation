package paypalapi;

import java.util.List;

public class PayloadOrder {
    private String intent;
    private List<Amount> amounts;
    private List<PurchaseUnit> purchaseUnits;


    public PayloadOrder(String intent, List<Amount> amounts, List<PurchaseUnit> purchaseUnits) {
        this.intent = intent;
        this.amounts = amounts;
        this.purchaseUnits = purchaseUnits;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public void setAmounts(List<Amount> amounts) {
        this.amounts = amounts;
    }

    public void setPurchaseUnits(List<PurchaseUnit> purchaseUnits) {
        this.purchaseUnits = purchaseUnits;
    }

    public String getIntent() {
        return intent;
    }

    public List<Amount> getAmounts() {
        return amounts;
    }

    public List<PurchaseUnit> getPurchaseUnits() {
        return purchaseUnits;
    }
}
