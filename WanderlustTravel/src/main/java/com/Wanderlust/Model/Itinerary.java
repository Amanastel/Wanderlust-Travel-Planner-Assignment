package com.Wanderlust.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Itinerary {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer itineraryID;
    private Date startDate;
    private Date endDate;
    private String location;
    private String description;
    @ManyToOne(cascade=CascadeType.ALL)
    private Destination destination;
    @ManyToOne
    private User user;
}
