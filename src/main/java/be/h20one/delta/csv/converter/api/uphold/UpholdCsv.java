package be.h20one.delta.csv.converter.api.uphold;

public interface UpholdCsv {
    String getDate();

    String getDestination();

    String getDestinationAmount();

    String getDestinationCurrency();

    String getFeeAmount();

    String getFeeCurrency();

    String getId();

    String getOrigin();

    String getOriginAmount();

    String getOriginCurrency();

    String getStatus();

    String getType();
}
