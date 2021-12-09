package be.h20one.delta.csv.converter.internal.cryptoDotCom;

public class CryptoDotComCsvEntity implements be.h20one.delta.csv.converter.api.cryptoDotCom.CryptoDotComCsv {
    private String timestampUTC;
    private String transactionDescription;
    private String currency;
    private String amount;
    private String toCurrency;
    private String toAmount;
    private String nativeCurrency;
    private String nativeAmount;
    private String nativeAmountInUsd;
    private String transactionKind;

    public CryptoDotComCsvEntity() {
    }

    public CryptoDotComCsvEntity(String timestampUTC, String transactionDescription, String currency, String amount, String toCurrency,
                                 String toAmount, String nativeCurrency, String nativeAmount, String nativeAmountInUsd, String transactionKind) {
        this.timestampUTC = timestampUTC;
        this.transactionDescription = transactionDescription;
        this.currency = currency;
        this.amount = amount;
        this.toCurrency = toCurrency;
        this.toAmount = toAmount;
        this.nativeCurrency = nativeCurrency;
        this.nativeAmount = nativeAmount;
        this.nativeAmountInUsd = nativeAmountInUsd;
        this.transactionKind = transactionKind;
    }

    @Override
    public String getTimestampUTC() {
        return timestampUTC;
    }

    public void setTimestampUTC(String timestampUTC) {
        this.timestampUTC = timestampUTC;
    }

    @Override
    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    @Override
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    @Override
    public String getToAmount() {
        return toAmount;
    }

    public void setToAmount(String toAmount) {
        this.toAmount = toAmount;
    }

    @Override
    public String getNativeCurrency() {
        return nativeCurrency;
    }

    public void setNativeCurrency(String nativeCurrency) {
        this.nativeCurrency = nativeCurrency;
    }

    @Override
    public String getNativeAmount() {
        return nativeAmount;
    }

    public void setNativeAmount(String nativeAmount) {
        this.nativeAmount = nativeAmount;
    }

    @Override
    public String getNativeAmountInUsd() {
        return nativeAmountInUsd;
    }

    public void setNativeAmountInUsd(String nativeAmountInUsd) {
        this.nativeAmountInUsd = nativeAmountInUsd;
    }

    @Override
    public String getTransactionKind() {
        return transactionKind;
    }

    public void setTransactionKind(String transactionKind) {
        this.transactionKind = transactionKind;
    }

    @Override
    public String toString() {
        return "CryptoDotComCsv{" +
                "timestampUTC='" + timestampUTC + '\'' +
                ", transactionDescription='" + transactionDescription + '\'' +
                ", currency='" + currency + '\'' +
                ", amount='" + amount + '\'' +
                ", toCurrency='" + toCurrency + '\'' +
                ", toAmount='" + toAmount + '\'' +
                ", nativeCurrency='" + nativeCurrency + '\'' +
                ", nativeAmount='" + nativeAmount + '\'' +
                ", nativeAmountInUsd='" + nativeAmountInUsd + '\'' +
                ", transactionKind='" + transactionKind + '\'' +
                '}';
    }
}
