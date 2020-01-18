package ru.itis.mail;

import ru.itis.models.Subscription;

public interface EmailNotifierService {

   /**
    * Notifies subscriber, that the minPrice has decreased.
    *
    * @param subscription the {@link Subscription} object.
    * @param oldMinPrice minPrice before recount.
    * @param newMinPrice minPrice after recount.
    */
   void notifySubscriber(Subscription subscription, Integer oldMinPrice, Integer newMinPrice);

   /**
    * Notifies subscriber, that subscription has added.
    *
    * @param subscription the {@link Subscription} object.
    */
   void notifyAddingSubscription(Subscription subscription);
}