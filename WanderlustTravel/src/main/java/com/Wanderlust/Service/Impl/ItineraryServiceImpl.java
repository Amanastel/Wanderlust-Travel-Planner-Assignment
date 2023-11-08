package com.Wanderlust.Service.Impl;
import com.Wanderlust.Exception.ItineraryException;
import com.Wanderlust.Model.Itinerary;
import com.Wanderlust.Repository.ItineraryRepository;
import com.Wanderlust.Service.ItineraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItineraryServiceImpl implements ItineraryService {

    private final ItineraryRepository itineraryRepository;

    @Autowired
    public ItineraryServiceImpl(ItineraryRepository itineraryRepository) {
        this.itineraryRepository = itineraryRepository;
    }


    /**
     * Creates a new itinerary.
     *
     * @param itinerary The itinerary object to be created.
     * @return The created itinerary.
     * @throws ItineraryException If the itinerary already exists.
     */
    @Override
    public Itinerary createItinerary(Itinerary itinerary) {
        if(itinerary==null){
            throw new ItineraryException("Itinerary cannot be null");
        }
        if(itineraryRepository.existsById(itinerary.getItineraryID())){
            throw new ItineraryException("Itinerary already exists");
        }

        return itineraryRepository.save(itinerary);
    }

    @Override
    public List<Itinerary> getAllItineraries() {
        if (itineraryRepository.findAll().isEmpty()) {
            throw new ItineraryException("No itineraries found");
        }
        return itineraryRepository.findAll();
    }

    @Override
    public Itinerary getItineraryById(Integer itineraryId) {
        return itineraryRepository.findById(itineraryId)
                .orElseThrow(() -> new ItineraryException("Itinerary not found"));

    }

    @Override
    public Itinerary updateItinerary(Integer itineraryId, Itinerary itinerary) {
        if (itineraryRepository.existsById(itineraryId)) {
            itinerary.setItineraryID(itineraryId);
            return itineraryRepository.save(itinerary);
        } else {
            throw new ItineraryException("Itinerary not found");
        }
    }

    @Override
    public String deleteItinerary(Integer itineraryId) {
        if (itineraryRepository.existsById(itineraryId)) {
            itineraryRepository.deleteById(itineraryId);
            return "Itinerary deleted successfully";
        } else {
            throw new ItineraryException("Itinerary not found");
        }
    }
}
