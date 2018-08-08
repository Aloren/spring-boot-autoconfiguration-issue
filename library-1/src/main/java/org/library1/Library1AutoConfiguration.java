package org.library1;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@AutoConfigureBefore(name = "org.library2.Library2AutoConfiguration")
@Import(Library1BeanProviderConfiguration.class)
@Configuration
public class Library1AutoConfiguration {
}
