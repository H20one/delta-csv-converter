package be.h20one.delta.csv.converter.internal.coinbasePro;

import be.h20one.delta.csv.converter.api.coinbasePro.CoinbaseProCsv;
import be.h20one.delta.csv.converter.api.coinbasePro.CoinbaseProCsvParser;
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
public class DefaultCoinbaseProCsvParser implements CoinbaseProCsvParser {

    @Override
    public void parseFromCsvToObject(String fileUrl) {
        try {
            CSVReader reader =
                    new CSVReaderBuilder(new FileReader(fileUrl))
                            .withSkipLines(1) // Skipping first line as it is header
                            .build();

            List<CoinbaseProCsvEntity> coinbaseProCsvEntityList = reader.readAll().stream().map(data -> {
                CoinbaseProCsvEntity coinbaseProCsvEntity = new CoinbaseProCsvEntity();
                coinbaseProCsvEntity.setPortfolio(data[0]);
                coinbaseProCsvEntity.setTradeId(data[1]);
                coinbaseProCsvEntity.setProduct(data[2]);
                coinbaseProCsvEntity.setSide(data[3]);
                coinbaseProCsvEntity.setCreatedAt(data[4]);
                coinbaseProCsvEntity.setSize(data[5]);
                coinbaseProCsvEntity.setSizeUnit(data[6]);
                coinbaseProCsvEntity.setPrice(data[7]);
                coinbaseProCsvEntity.setFee(data[8]);
                coinbaseProCsvEntity.setTotal(data[9]);
                coinbaseProCsvEntity.setPriceFeeTotalUnit(data[10]);

                return coinbaseProCsvEntity;
            }).collect(Collectors.toList());

            coinbaseProCsvEntityList.forEach(coinbaseProCsvEntity -> System.out.println(coinbaseProCsvEntity.toString()));

        } catch (CsvException | IOException e) {
            log.error("Failed reading from Coinbase Pro csv file.", e);
            throw new FailedReadingFromCsvException(e.getCause(), "Failed reading from Coinbase Pro csv file.");

        }
    }

    @Override
    public void parseFromObjectToCsv(CoinbaseProCsv coinbaseProCsv) {
        System.out.println("No implementation found!");
    }
}


