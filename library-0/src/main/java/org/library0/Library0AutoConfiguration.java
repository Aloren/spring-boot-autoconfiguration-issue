package org.library0;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@ConditionalOnBean(name = "library0")
@AutoConfigureBefore(name = "org.library1.Library1AutoConfiguration")
@EnableScheduling
@Configuration
public class Library0AutoConfiguration {
}
