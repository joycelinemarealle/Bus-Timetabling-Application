package com.example.bus_timetabling.dto;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class BusRouteManagerDto {
    private Long id;
    private List<BusDto> bus;
    private List<RouteDto> routes;
}
