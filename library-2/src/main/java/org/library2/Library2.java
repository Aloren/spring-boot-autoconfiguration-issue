package org.library2;

import org.springframework.scheduling.annotation.Scheduled;

public class Library2 {

    @Scheduled(fixedRate = 10000L)
    public void doSmth() {
    }
}
