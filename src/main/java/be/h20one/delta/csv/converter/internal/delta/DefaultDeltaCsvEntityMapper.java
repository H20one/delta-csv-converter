package be.h20one.delta.csv.converter.internal.delta;

import be.h20one.delta.csv.converter.api.delta.DeltaCsvEntityMapper;
import be.h20one.delta.csv.converter.exceptions.UpholdDateFormatException;
import be.h20one.delta.csv.converter.internal.uphold.UpholdCsvEntity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DefaultDeltaCsvEntityMapper implements DeltaCsvEntityMapper {

    @Override
    public DeltaCsvEntity UpholdCsvEntityToDeltaCsvEntity(UpholdCsvEntity upholdCsvEntity) {
        DeltaCsvEntity deltaCsvEntity = new DeltaCsvEntity();
        deltaCsvEntity.setDate(formatUpholdDate(upholdCsvEntity.getDate()));
        deltaCsvEntity.setType(upholdCsvEntity.getType());
        deltaCsvEntity.setExchange("Uphold");
//        deltaCsvEntity.setBaseAmount();
//        deltaCsvEntity.setBaseCurrency();
//        deltaCsvEntity.setQuoteAmount();
//        deltaCsvEntity.setQuoteCurrency();
//        deltaCsvEntity.setFee();
//        deltaCsvEntity.setFeeCurrency();
//        deltaCsvEntity.setCostsProceeds();
//        deltaCsvEntity.setCostsProceedsCurrency();
//        deltaCsvEntity.setSyncHoldings();
//        deltaCsvEntity.setSentReceivedFrom();
//        deltaCsvEntity.setSentTo();
//        deltaCsvEntity.setNotes();

        return deltaCsvEntity;
    }

    private String formatUpholdDate(String upholdDate) {

        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        try {
            DateFormat inputFormat = new SimpleDateFormat(
                    "E MMM dd yyyy HH:mm:ss 'GMT'z", Locale.ENGLISH);
            Date date = inputFormat.parse(upholdDate);
            System.out.println(date);

            return date.toString();

        } catch (ParseException e) {
            throw new UpholdDateFormatException(e.getCause(), "Failed parsing uphold date.");
        }
    }
}
