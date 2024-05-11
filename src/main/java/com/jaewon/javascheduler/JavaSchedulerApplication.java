package com.jaewon.javascheduler;

import com.jaewon.javascheduler.event.*;
import com.jaewon.javascheduler.reader.EvenvtCsvReader;
import com.opencsv.CSVReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class JavaSchedulerApplication {

    public static void main(String[] args) throws IOException {

        Schedule schedule = new Schedule();

        EvenvtCsvReader csvReader = new EvenvtCsvReader();
        String meetingCsvPath = "/data/meeting.csv";

        List<Meeting> meetings = csvReader.readMeetings(meetingCsvPath);
        meetings.forEach(schedule::add);

        schedule.printAll();
    }

}
