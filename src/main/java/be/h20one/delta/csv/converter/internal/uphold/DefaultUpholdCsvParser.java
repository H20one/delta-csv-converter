package be.h20one.delta.csv.converter.internal.uphold;

import be.h20one.delta.csv.converter.api.uphold.UpholdCsv;
import be.h20one.delta.csv.converter.api.uphold.UpholdCsvParser;
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
public class DefaultUpholdCsvParser implements UpholdCsvParser {

    @Override
    public List<UpholdCsvEntity> parseFromCsvToObject(String fileUrl) {
        try {
            CSVReader reader =
                    new CSVReaderBuilder(new FileReader(fileUrl))
                            .withSkipLines(1) // Skipping first line as it is header
                            .build();

            List<UpholdCsvEntity> upholdCsvEntityList = reader.readAll().stream().map(data -> {
                UpholdCsvEntity upholdCsvEntity = new UpholdCsvEntity();
                upholdCsvEntity.setDate(data[0]);
                upholdCsvEntity.setDestination(data[1]);
                upholdCsvEntity.setDestinationAmount(data[2]);
                upholdCsvEntity.setDestinationCurrency(data[3]);
                upholdCsvEntity.setFeeAmount(data[4]);
                upholdCsvEntity.setFeeCurrency(data[5]);
                upholdCsvEntity.setId(data[6]);
                upholdCsvEntity.setOrigin(data[7]);
                upholdCsvEntity.setOriginAmount(data[8]);
                upholdCsvEntity.setOriginCurrency(data[9]);
                upholdCsvEntity.setStatus(data[10]);
                upholdCsvEntity.setType(data[11]);

                return upholdCsvEntity;
            }).collect(Collectors.toList());

            upholdCsvEntityList.forEach(upholdCsvEntity -> System.out.println(upholdCsvEntity.toString()));
            return upholdCsvEntityList;

        } catch (CsvException | IOException e) {
            log.error("Failed reading from Uphold csv file.", e);
            throw new FailedReadingFromCsvException(e.getCause(), "Failed reading from Uphold csv file.");
        }
    }

    @Override
    public void parseFromObjectToCsv(UpholdCsv upholdCsv) {
        System.out.println("No implementation found!");
    }
}


