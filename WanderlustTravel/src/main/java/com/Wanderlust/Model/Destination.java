package com.Wanderlust.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Destination {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer disID;
    private String name;
    private String location;
    private String description;

    @OneToMany(mappedBy = "destination")
    private List<Itinerary> itineraries;

}
