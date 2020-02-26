package test.rqueue.demo;

import com.github.sonus21.rqueue.config.SimpleRqueueListenerContainerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@Configuration
public class RedisQueueConfig {

    private Logger logger = LoggerFactory.getLogger(RedisQueueConfig.class);

    @Bean
    public SimpleRqueueListenerContainerFactory simpleRqueueListenerContainerFactory(){
        SimpleRqueueListenerContainerFactory factory = new SimpleRqueueListenerContainerFactory();
        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration("localhost", 6379);
        config.setDatabase(3);
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(config);
        factory.setRedisConnectionFactory(jedisConnectionFactory);
        return factory;
    }
}
