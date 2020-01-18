package ru.itis.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.itis.rest_services.RecountMinPriceService;

@Slf4j
@Component
public class SchedulerTasks {

   @Autowired
   private RecountMinPriceService recountMinPriceService;

   private static final long TEN_MINUTES = 1000 * 60 * 10;

   @Scheduled(fixedRate = TEN_MINUTES)
   public void recountMinPrice() {
       log.debug("recount minPrice Started");
       recountMinPriceService.recount();
       log.debug("recount minPrice finished");
   }
}