package com.jaewon.javascheduler;

import com.jaewon.javascheduler.event.*;
import com.jaewon.javascheduler.event.update.UpdateMeeting;
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

        Meeting meeting = meetings.get(0);

        meeting.print();

        System.out.println("수정 후 .....");

        meetings.get(0).validateAndUpdate(
                new UpdateMeeting(
                        "new title",
                        ZonedDateTime.now(),
                        ZonedDateTime.now().plusHours(1),
                        null,
                        "A",
                        "new agenda"
                )
        );

        meeting.print();


        meeting.delete(true);
        System.out.println("삭제 후 수정 시도 ...");

        meetings.get(0).validateAndUpdate(
                new UpdateMeeting(
                        "new title 2",
                        ZonedDateTime.now(),
                        ZonedDateTime.now().plusHours(1),
                        null,
                        "B",
                        "new agenda 2"
                )
        );

//        schedule.printAll();
    }

}
