package com.goodbooks.bookinfo.config;

import com.goodbooks.bookinfo.service.BookInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledFunctions {

    @Autowired
    private BookInfoService bookInfoService;

    private Logger logger = LoggerFactory.getLogger(ScheduledFunctions.class);

    // clears cache every 5 mins, so that we get updated data from DB
    @Scheduled(fixedDelay = 300000)
    public void clearBookCache(){
        logger.info("Running scheduled job to clear Book Cache values");
        bookInfoService.evictBookCacheValuesAll();
    }
}
