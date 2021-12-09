package be.h20one.delta.csv.converter;

import be.h20one.delta.csv.converter.internal.coinbase.DefaultCoinbaseCsvParser;
import be.h20one.delta.csv.converter.internal.coinbasePro.DefaultCoinbaseProCsvParser;
import be.h20one.delta.csv.converter.internal.cryptoDotCom.DefaultCryptoDotComCsvParser;
import be.h20one.delta.csv.converter.internal.delta.DefaultDeltaCsvEntityMapper;
import be.h20one.delta.csv.converter.internal.delta.DefaultDeltaCsvParser;
import be.h20one.delta.csv.converter.internal.delta.DeltaCsvEntity;
import be.h20one.delta.csv.converter.internal.uphold.DefaultUpholdCsvParser;
import be.h20one.delta.csv.converter.internal.uphold.UpholdCsvEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DeltaCsvConverterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeltaCsvConverterApplication.class, args);

        DefaultCoinbaseCsvParser defaultCoinbaseCsvParser = new DefaultCoinbaseCsvParser();
        defaultCoinbaseCsvParser.parseFromCsvToObject("/Users/joerivancleven/Workspace/personal/delta-csv-converter/src/main/resources/csvFile/Coinbase-5b2caee5fbc7c30172da2c00-TransactionsHistoryReport-2021-11-24-12_05_59.csv");
        DefaultCoinbaseProCsvParser defaultCoinbaseProCsvParser = new DefaultCoinbaseProCsvParser();
        defaultCoinbaseProCsvParser.parseFromCsvToObject("/Users/joerivancleven/Workspace/personal/delta-csv-converter/src/main/resources/csvFile/fills.csv");
        DefaultUpholdCsvParser defaultUpholdCsvParser = new DefaultUpholdCsvParser();
        List<UpholdCsvEntity> upholdCsvEntityList = defaultUpholdCsvParser.parseFromCsvToObject("/Users/joerivancleven/Workspace/personal/delta-csv-converter/src/main/resources/csvFile/2655809756-transactions.csv");
        DefaultCryptoDotComCsvParser defaultCryptoDotComCsvParser = new DefaultCryptoDotComCsvParser();
        defaultCryptoDotComCsvParser.parseFromCsvToObject("/Users/joerivancleven/Workspace/personal/delta-csv-converter/src/main/resources/csvFile/crypto_transactions_record_20211124_132830.csv");


        List<DeltaCsvEntity> deltaCsvEntityList = new ArrayList<>();

        DeltaCsvEntity deltaCsvEntity = new DeltaCsvEntity("date", "type", "exchange", "baseAmount", "baseCurrency", "quoteAmount", "quoteCurrency", "fee", "feeCurrency", "costProceeds", "costsProceedsCurrency", "syncHoldings", "sentReceivedFrom", "sentTo", "notes");
        upholdCsvEntityList.forEach(upholdCsvEntity -> deltaCsvEntityList.add(new DefaultDeltaCsvEntityMapper().UpholdCsvEntityToDeltaCsvEntity(upholdCsvEntity)));

        DefaultDeltaCsvParser defaultDeltaCsvParser = new DefaultDeltaCsvParser();
        defaultDeltaCsvParser.parseFromObjectToCsv(deltaCsvEntityList, DeltaCsvEntity.class, Path.of("/Users/joerivancleven/Workspace/personal/delta-csv-converter/src/main/resources/csvFile/Delta_output.csv"));
    }
}
