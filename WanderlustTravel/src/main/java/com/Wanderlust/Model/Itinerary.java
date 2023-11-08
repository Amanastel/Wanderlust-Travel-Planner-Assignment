package com.Wanderlust.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Itinerary {
    @Id
    private Integer itineraryID;
    private String activity;
    private String location;
    private String description;


}
