package be.h20one.delta.csv.converter.internal.cryptoDotCom;

import be.h20one.delta.csv.converter.api.cryptoDotCom.CryptoDotComCsv;
import be.h20one.delta.csv.converter.api.cryptoDotCom.CryptoDotComCsvParser;
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
public class DefaultCryptoDotComCsvParser implements CryptoDotComCsvParser {

    @Override
    public void parseFromCsvToObject(String fileUrl) {
        try {
            CSVReader reader =
                    new CSVReaderBuilder(new FileReader(fileUrl))
                            .withSkipLines(1) // Skipping first line as it is header
                            .build();

            List<CryptoDotComCsvEntity> cryptoDotComCsvEntityList = reader.readAll().stream().map(data -> {
                CryptoDotComCsvEntity cryptoDotComCsvEntity = new CryptoDotComCsvEntity();
                cryptoDotComCsvEntity.setTimestampUTC(data[0]);
                cryptoDotComCsvEntity.setTransactionDescription(data[1]);
                cryptoDotComCsvEntity.setCurrency(data[2]);
                cryptoDotComCsvEntity.setAmount(data[3]);
                cryptoDotComCsvEntity.setToCurrency(data[4]);
                cryptoDotComCsvEntity.setToAmount(data[5]);
                cryptoDotComCsvEntity.setNativeCurrency(data[6]);
                cryptoDotComCsvEntity.setNativeAmount(data[7]);
                cryptoDotComCsvEntity.setNativeAmountInUsd(data[8]);
                cryptoDotComCsvEntity.setTransactionKind(data[9]);

                return cryptoDotComCsvEntity;
            }).collect(Collectors.toList());

            cryptoDotComCsvEntityList.forEach(cryptoDotComCsvEntity -> System.out.println(cryptoDotComCsvEntity.toString()));

        } catch (CsvException | IOException e) {
            log.error("Failed reading from Crypto.com csv file.", e);
            throw new FailedReadingFromCsvException(e.getCause(), "Failed reading from Crypto.com csv file.");
        }
    }

    @Override
    public void parseFromObjectToCsv(CryptoDotComCsv cryptoDotComCsv) {
        System.out.println("No implementation found!");
    }
}


