package org.library1;

import org.springframework.scheduling.annotation.Scheduled;

public class Library1 {

    @Scheduled(fixedRate = 10000L)
    public void doSmth() {
    }
}
