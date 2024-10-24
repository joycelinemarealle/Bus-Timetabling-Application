package com.example.bus_timetabling.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "route_stop_schedule", schema = "bus_timetabling")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder

public class RouteStopSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "route_stop_id")
    private Long id;

    @Column(name = "stop_num")
    private int stopNum;

    // Relationships
    @OneToMany(mappedBy = "routeStopSchedule", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Route> route;

    @ManyToOne //many routeStop Schedules can refer to one stop
    @JoinColumn(name = "stop_id") // Defaults to primary key of Stop
    private Stop stop;
}