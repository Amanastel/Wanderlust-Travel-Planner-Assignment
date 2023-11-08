package com.Wanderlust.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
    private Integer userID;
    private String name;
    private String password;
    private String email;
    private String address;
    private List<Expense> expenses;

    private List<Itinerary> itineraries;

    private List<Destination> destinations;

    @OneToOne(mappedBy="user" ,cascade= CascadeType.ALL)
    private Wallet wallet;




}
