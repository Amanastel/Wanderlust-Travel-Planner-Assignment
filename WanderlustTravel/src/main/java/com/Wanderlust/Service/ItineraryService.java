package com.Wanderlust.Service;

import com.Wanderlust.Model.Itinerary;

import java.util.List;

public interface ItineraryService {
    Itinerary createItinerary(Itinerary itinerary);

    List<Itinerary> getAllItineraries();

    Itinerary getItineraryById(Integer itineraryId);

    Itinerary updateItinerary(Integer itineraryId, Itinerary itinerary);

    String deleteItinerary(Integer itineraryId);
}
