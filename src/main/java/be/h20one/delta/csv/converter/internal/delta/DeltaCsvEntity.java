package be.h20one.delta.csv.converter.internal.delta;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

public class DeltaCsvEntity implements be.h20one.delta.csv.converter.api.delta.DeltaCsv {

    @CsvBindByName(column = "Date")
    @CsvBindByPosition(position = 0)
    private String date;

    @CsvBindByName(column = "Type")
    @CsvBindByPosition(position = 1)
    private String type;

    @CsvBindByName(column = "Exchange")
    @CsvBindByPosition(position = 2)
    private String exchange;

    @CsvBindByName(column = "Base amount")
    @CsvBindByPosition(position = 3)
    private String baseAmount;

    @CsvBindByName(column = "Base currency")
    @CsvBindByPosition(position = 4)
    private String baseCurrency;

    @CsvBindByName(column = "Quote amount")
    @CsvBindByPosition(position = 5)
    private String quoteAmount;

    @CsvBindByName(column = "Quote currency")
    @CsvBindByPosition(position = 6)
    private String quoteCurrency;

    @CsvBindByName(column = "Fee")
    @CsvBindByPosition(position = 7)
    private String fee;

    @CsvBindByName(column = "Fee currency")
    @CsvBindByPosition(position = 8)
    private String feeCurrency;

    @CsvBindByName(column = "Costs/Proceeds")
    @CsvBindByPosition(position = 9)
    private String costsProceeds;

    @CsvBindByName(column = "Costs/Proceeds currency")
    @CsvBindByPosition(position = 10)
    private String costsProceedsCurrency;

    @CsvBindByName(column = "Sync Holdings")
    @CsvBindByPosition(position = 11)
    private String syncHoldings;

    @CsvBindByName(column = "Sent/Received from")
    @CsvBindByPosition(position = 12)
    private String sentReceivedFrom;

    @CsvBindByName(column = "Sent to")
    @CsvBindByPosition(position = 13)
    private String sentTo;

    @CsvBindByName(column = "Notes")
    @CsvBindByPosition(position = 14)
    private String notes;

    public DeltaCsvEntity() {
    }

    public DeltaCsvEntity(String date, String type, String exchange, String baseAmount, String baseCurrency, String quoteAmount, String quoteCurrency, String fee,
                          String feeCurrency, String costsProceeds, String costsProceedsCurrency, String syncHoldings, String sentReceivedFrom, String sentTo, String notes) {
        this.date = date;
        this.type = type;
        this.exchange = exchange;
        this.baseAmount = baseAmount;
        this.baseCurrency = baseCurrency;
        this.quoteAmount = quoteAmount;
        this.quoteCurrency = quoteCurrency;
        this.fee = fee;
        this.feeCurrency = feeCurrency;
        this.costsProceeds = costsProceeds;
        this.costsProceedsCurrency = costsProceedsCurrency;
        this.syncHoldings = syncHoldings;
        this.sentReceivedFrom = sentReceivedFrom;
        this.sentTo = sentTo;
        this.notes = notes;
    }

    @Override
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @Override
    public String getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(String baseAmount) {
        this.baseAmount = baseAmount;
    }

    @Override
    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    @Override
    public String getQuoteAmount() {
        return quoteAmount;
    }

    public void setQuoteAmount(String quoteAmount) {
        this.quoteAmount = quoteAmount;
    }

    @Override
    public String getQuoteCurrency() {
        return quoteCurrency;
    }

    public void setQuoteCurrency(String quoteCurrency) {
        this.quoteCurrency = quoteCurrency;
    }

    @Override
    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    @Override
    public String getFeeCurrency() {
        return feeCurrency;
    }

    public void setFeeCurrency(String feeCurrency) {
        this.feeCurrency = feeCurrency;
    }

    @Override
    public String getCostsProceeds() {
        return costsProceeds;
    }

    public void setCostsProceeds(String costsProceeds) {
        this.costsProceeds = costsProceeds;
    }

    @Override
    public String getCostsProceedsCurrency() {
        return costsProceedsCurrency;
    }

    public void setCostsProceedsCurrency(String costsProceedsCurrency) {
        this.costsProceedsCurrency = costsProceedsCurrency;
    }

    @Override
    public String getSyncHoldings() {
        return syncHoldings;
    }

    public void setSyncHoldings(String syncHoldings) {
        this.syncHoldings = syncHoldings;
    }

    @Override
    public String getSentReceivedFrom() {
        return sentReceivedFrom;
    }

    public void setSentReceivedFrom(String sentReceivedFrom) {
        this.sentReceivedFrom = sentReceivedFrom;
    }

    @Override
    public String getSentTo() {
        return sentTo;
    }

    public void setSentTo(String sentTo) {
        this.sentTo = sentTo;
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
        return "DeltaCsv{" +
                "date='" + date + '\'' +
                ", type='" + type + '\'' +
                ", exchange='" + exchange + '\'' +
                ", baseAmount='" + baseAmount + '\'' +
                ", baseCurrency='" + baseCurrency + '\'' +
                ", quoteAmount='" + quoteAmount + '\'' +
                ", quoteCurrency='" + quoteCurrency + '\'' +
                ", fee='" + fee + '\'' +
                ", feeCurrency='" + feeCurrency + '\'' +
                ", costsProceeds='" + costsProceeds + '\'' +
                ", costsProceedsCurrency='" + costsProceedsCurrency + '\'' +
                ", syncHoldings='" + syncHoldings + '\'' +
                ", sentReceivedFrom='" + sentReceivedFrom + '\'' +
                ", sentTo='" + sentTo + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
