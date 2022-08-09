package com.example.domain.model;

import com.example.domain.entities.Location;
import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Forecast {
    private Location location;
    private Current current;
}
