package be.h20one.delta.csv.converter.internal.uphold;

public class UpholdCsvEntity implements be.h20one.delta.csv.converter.api.uphold.UpholdCsv {
    private String date;
    private String destination;
    private String destinationAmount;
    private String destinationCurrency;
    private String feeAmount;
    private String feeCurrency;
    private String id;
    private String origin;
    private String originAmount;
    private String originCurrency;
    private String status;
    private String type;

    public UpholdCsvEntity() {

    }

    public UpholdCsvEntity(String date, String destination, String destinationAmount, String destinationCurrency, String feeAmount,
                           String feeCurrency, String id, String origin, String originAmount, String originCurrency, String status, String type) {
        this.date = date;
        this.destination = destination;
        this.destinationAmount = destinationAmount;
        this.destinationCurrency = destinationCurrency;
        this.feeAmount = feeAmount;
        this.feeCurrency = feeCurrency;
        this.id = id;
        this.origin = origin;
        this.originAmount = originAmount;
        this.originCurrency = originCurrency;
        this.status = status;
        this.type = type;
    }

    @Override
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String getDestinationAmount() {
        return destinationAmount;
    }

    public void setDestinationAmount(String destinationAmount) {
        this.destinationAmount = destinationAmount;
    }

    @Override
    public String getDestinationCurrency() {
        return destinationCurrency;
    }

    public void setDestinationCurrency(String destinationCurrency) {
        this.destinationCurrency = destinationCurrency;
    }

    @Override
    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    @Override
    public String getFeeCurrency() {
        return feeCurrency;
    }

    public void setFeeCurrency(String feeCurrency) {
        this.feeCurrency = feeCurrency;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String getOriginAmount() {
        return originAmount;
    }

    public void setOriginAmount(String originAmount) {
        this.originAmount = originAmount;
    }

    @Override
    public String getOriginCurrency() {
        return originCurrency;
    }

    public void setOriginCurrency(String originCurrency) {
        this.originCurrency = originCurrency;
    }

    @Override
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "UpholdCsv{" +
                "date='" + date + '\'' +
                ", destination='" + destination + '\'' +
                ", destinationAmount='" + destinationAmount + '\'' +
                ", destinationCurrency='" + destinationCurrency + '\'' +
                ", feeAmount='" + feeAmount + '\'' +
                ", feeCurrency='" + feeCurrency + '\'' +
                ", id='" + id + '\'' +
                ", origin='" + origin + '\'' +
                ", originAmount='" + originAmount + '\'' +
                ", originCurrency='" + originCurrency + '\'' +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
