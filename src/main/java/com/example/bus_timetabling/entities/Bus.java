//package com.example.bus_timetabling.entities;
//
//import com.example.bus_timetabling.enums.ServiceStatus;
//import com.fasterxml.jackson.annotation.JsonIdentityInfo;
//import com.fasterxml.jackson.annotation.ObjectIdGenerators;
//import jakarta.persistence.*;
//import lombok.*;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "buses",  schema = "bus_timetabling")
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Setter
//@Getter
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//public class Bus {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "bus_id")
//    private Long id;
//
//    @Column(name = "bus_number")
//    private String busNumber;
//
//    @Enumerated(EnumType.STRING)
//    @Column(name = "status")
//    private ServiceStatus status;
//
//    @ManyToOne
//    @JoinColumn(name = "times_table_id")
//    private TimesTable timestables;
//
//    @OneToMany(mappedBy = "bus", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<TimesTable> timesTables = new ArrayList<>();
//
//    @ManyToOne
//    @JoinColumn(name = "route_schedule_id")
//    private BusRouteManager busRouteManager;
//
//}
//

package com.example.bus_timetabling.entities;

import com.example.bus_timetabling.enums.ServiceStatus;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "buses", schema = "bus_timetabling")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_id")
    private Long id;

    @Column(name = "bus_number")
    private String busNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private ServiceStatus status;

    @OneToMany(mappedBy = "bus", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TimesTable> timesTables = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "route_schedule_id")
    private BusRouteManager busRouteManager;
}
