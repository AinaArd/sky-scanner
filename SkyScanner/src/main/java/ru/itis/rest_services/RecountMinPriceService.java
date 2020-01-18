package ru.itis.rest_services;

import org.springframework.stereotype.Service;

@Service
public interface RecountMinPriceService {

    /**
     * Recounts minPrice for all the subscriptions.
     */
    void recount();
}