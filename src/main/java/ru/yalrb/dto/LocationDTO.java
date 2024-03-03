package ru.yalrb.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LocationDTO {
    private String longitude;
    private String latitude;
}