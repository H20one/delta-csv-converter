package be.h20one.delta.csv.converter.internal.coinbase;

public class CoinbaseCsvEntity implements be.h20one.delta.csv.converter.api.coinbase.CoinbaseCsv {
    private String timestamp;
    private String transactionType;
    private String asset;
    private String quantityTransacted;
    private String spotPriceCurrency;
    private String spotPriceAtTransaction;
    private String subtotal;
    private String total; //including fees
    private String fees;
    private String notes;

    public CoinbaseCsvEntity() {
    }

    public CoinbaseCsvEntity(String timestamp, String transactionType, String asset, String quantityTransacted, String spotPriceCurrency, String spotPriceAtTransaction, String subtotal, String total, String fees, String notes) {
        this.timestamp = timestamp;
        this.transactionType = transactionType;
        this.asset = asset;
        this.quantityTransacted = quantityTransacted;
        this.spotPriceCurrency = spotPriceCurrency;
        this.spotPriceAtTransaction = spotPriceAtTransaction;
        this.subtotal = subtotal;
        this.total = total;
        this.fees = fees;
        this.notes = notes;
    }

    @Override
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    @Override
    public String getQuantityTransacted() {
        return quantityTransacted;
    }

    public void setQuantityTransacted(String quantityTransacted) {
        this.quantityTransacted = quantityTransacted;
    }

    @Override
    public String getSpotPriceCurrency() {
        return spotPriceCurrency;
    }

    public void setSpotPriceCurrency(String spotPriceCurrency) {
        this.spotPriceCurrency = spotPriceCurrency;
    }

    @Override
    public String getSpotPriceAtTransaction() {
        return spotPriceAtTransaction;
    }

    public void setSpotPriceAtTransaction(String spotPriceAtTransaction) {
        this.spotPriceAtTransaction = spotPriceAtTransaction;
    }

    @Override
    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    @Override
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "CoinbaseCsvEntity{" +
                "timestamp='" + timestamp + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", asset='" + asset + '\'' +
                ", quantityTransacted='" + quantityTransacted + '\'' +
                ", spotPriceCurrency='" + spotPriceCurrency + '\'' +
                ", spotPriceAtTransaction='" + spotPriceAtTransaction + '\'' +
                ", subtotal='" + subtotal + '\'' +
                ", total='" + total + '\'' +
                ", fees='" + fees + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
