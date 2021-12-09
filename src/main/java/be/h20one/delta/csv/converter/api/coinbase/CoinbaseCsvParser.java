package be.h20one.delta.csv.converter.api.coinbase;

public interface CoinbaseCsvParser {
    void parseFromCsvToObject(String fileUrl);

    void parseFromObjectToCsv(CoinbaseCsv coinbaseCsv);
}
