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
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer userID;
    private String name;
    private String password;
    private String email;
    private String address;
    @OneToMany(mappedBy = "user",cascade=CascadeType.ALL)
    private List<Itinerary> itineraries;
    @OneToOne(mappedBy="user" ,cascade= CascadeType.ALL)
    private Wallet wallet;


}
