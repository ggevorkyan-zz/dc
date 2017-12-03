package com.dc;

import com.dc.entity.Daycare;
import com.dc.repository.DaycareRepository;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

    /*
    @Bean
    public CommandLineRunner demo(DaycareRepository daycareRepository) {
        return (args) -> {
            try {
                BufferedReader reader = new BufferedReader(
                        new FileReader("/Users/gayk.gevorkyan/Downloads/dc/ChildCareCenters11262017.csv"));
                CSVParser parser = CSVParser.parse(reader,
                    CSVFormat.DEFAULT.withFirstRecordAsHeader());
                parser.forEach(record -> {
                    Daycare daycare = new Daycare();
                    daycare.setType(record.get("Facility Type"));
                    daycare.setNumber(record.get("Facility Number"));
                    daycare.setName(record.get("Facility Name"));
                    daycare.setLicensee(record.get("Licensee"));
                    daycare.setAdministrator(record.get("Facility Administrator"));
                    daycare.setPhone(record.get("Facility Telephone Number"));
                    daycare.setAddress(record.get(6));
                    daycare.setCity(record.get(7));
                    daycare.setState(record.get(8));
                    daycare.setZip(record.get(9));
                    daycare.setCounty(record.get(10));
                    daycare.setRegion(record.get(11));
                    daycare.setCapacity(StringUtils.isNotEmpty(record.get(12)) ? Integer.parseInt(record.get(12)) : -1);
                    daycare.setStatus(record.get(13));
                    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
                    try {
                        daycare.setLicenseDate(StringUtils.isNotEmpty(record.get(14)) ? format.parse(record.get(14)) : null);
                        daycare.setClosedDate(StringUtils.isNotEmpty(record.get(15)) ? format.parse(record.get(15)): null);
                        daycare.setLastVisitDate(StringUtils.isNotEmpty(record.get(16)) ? format.parse(record.get(16)): null);
                    } catch (ParseException e) {
                        logger.error(e.getMessage());
                    }
                    daycare.setNumberOfInspections(
                            StringUtils.isNotEmpty(record.get(17)) ? Integer.parseInt(record.get(17)) : -1);
                    daycare.setTotalVisits(
                            StringUtils.isNotEmpty(record.get(20)) ? Integer.parseInt(record.get(20)) : -1);
                    daycareRepository.save(daycare);
                });
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        };
    }
    */
}
