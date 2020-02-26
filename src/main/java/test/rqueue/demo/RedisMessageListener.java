package test.rqueue.demo;

import com.github.sonus21.rqueue.annotation.RqueueListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RedisMessageListener {

    private Logger logger = LoggerFactory.getLogger(RedisMessageListener.class);

    @RqueueListener(value = "delayed-queue-job", numRetries = "1", deadLetterQueue = "delayed-queue-job-dead")
    public void onMessage(JobX job) throws Exception {
        logger.info("Job:" + job);
    }
}

