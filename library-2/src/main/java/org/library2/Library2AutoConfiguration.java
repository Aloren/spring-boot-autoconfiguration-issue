package org.library2;

import org.library1.Library1;
import org.library1.Library11;
import org.springframework.boot.autoconfigure.condition.AnyNestedCondition;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Conditional(Library2AutoConfiguration.AnyBucketBeanIsPresentCondition.class)
@EnableScheduling
@Configuration
public class Library2AutoConfiguration {

    @Bean
    public Library2 library2() {
        return new Library2();
    }

    static class AnyBucketBeanIsPresentCondition extends AnyNestedCondition {

        public AnyBucketBeanIsPresentCondition() {
            super(ConfigurationPhase.REGISTER_BEAN);
        }

        @ConditionalOnBean(Library1.class)
        static class BucketBeanIsPresent {
        }

        @ConditionalOnBean(Library11.class)
        static class AsyncBucketBeanIsPresent {
        }
    }
}
