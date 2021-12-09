package be.h20one.delta.csv.converter.internal.coinbase;

import be.h20one.delta.csv.converter.api.coinbase.CoinbaseCsv;
import be.h20one.delta.csv.converter.api.coinbase.CoinbaseCsvParser;
import be.h20one.delta.csv.converter.exceptions.FailedReadingFromCsvException;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import lombok.extern.slf4j.Slf4j;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class DefaultCoinbaseCsvParser implements CoinbaseCsvParser {

    @Override
    public void parseFromCsvToObject(String fileUrl) {
        try {
            CSVReader reader = new CSVReaderBuilder(new FileReader(fileUrl))
                    .withSkipLines(8)
                    .build();

            List<CoinbaseCsvEntity> coinbaseCsvEntityList = reader.readAll().stream().map(data -> {
                CoinbaseCsvEntity coinbaseCsvEntity = new CoinbaseCsvEntity();
                coinbaseCsvEntity.setTimestamp(data[0]);
                coinbaseCsvEntity.setTransactionType(data[1]);
                coinbaseCsvEntity.setAsset(data[2]);
                coinbaseCsvEntity.setQuantityTransacted(data[3]);
                coinbaseCsvEntity.setSpotPriceCurrency(data[4]);
                coinbaseCsvEntity.setSpotPriceAtTransaction(data[5]);
                coinbaseCsvEntity.setSubtotal(data[6]);
                coinbaseCsvEntity.setTotal(data[7]);
                coinbaseCsvEntity.setFees(data[8]);
                coinbaseCsvEntity.setNotes(data[9]);

                return coinbaseCsvEntity;
            }).collect(Collectors.toList());

            coinbaseCsvEntityList.forEach(coinbaseCsvEntity -> System.out.println(coinbaseCsvEntity.toString()));

        } catch (CsvException | IOException e) {
            log.error("Failed reading from Coinbase csv file.", e);
            throw new FailedReadingFromCsvException(e.getCause(), "Failed reading from Coinbase csv file.");
        }
    }

    @Override
    public void parseFromObjectToCsv(CoinbaseCsv coinbaseCsv) {
        System.out.println("No implementation found!");
    }
}


