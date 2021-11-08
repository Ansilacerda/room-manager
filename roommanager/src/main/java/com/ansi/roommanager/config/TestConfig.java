package com.ansi.roommanager.config;

import com.ansi.roommanager.model.Room;
import com.ansi.roommanager.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private RoomRepository roomRepository;

    @Override
    public void run(String... args) throws Exception {

        var r1 = new Room(1L, "Room 01", "01-01-2021", "08:00", "12:00");
        var r2 = new Room(2L, "Room 02", "02-01-2021", "08:00", "12:00");
        var r3 = new Room(3L, "Room 03", "03-01-2021", "08:00", "12:00");
        roomRepository.saveAll(Arrays.asList(r1, r2, r3));

    }
}