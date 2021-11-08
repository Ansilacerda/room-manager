package com.ansi.roommanager.model;


import javax.persistence.*;

@Entity
@Table(name="meeting_room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String date;

    private String startHour;

    private String endHour;

    public Room() { }

    public Room(long id, String name, String date, String startHour, String endHour) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

    @Override
    public String toString() {
        return "Room[id=" + id +
                ", name='" + name +
                ", date='" + date +
                ", startHour='" + startHour +
                ", endHour='" + endHour +
                ']';
    }
}