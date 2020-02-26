package test.rqueue.demo;

import com.github.sonus21.rqueue.producer.RqueueMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RedisMessagePublisher {
    private RqueueMessageSender rqueueMessageSender;

    @Autowired
    public RedisMessagePublisher(RqueueMessageSender rqueueMessageSender){
        this.rqueueMessageSender = rqueueMessageSender;
    }

    public void sendSimpleQueueMesage(){
        rqueueMessageSender.put("simple-queue", "Rqueue is configured");
    }


    public void sendDelayedMessage(JobX jobX){
        rqueueMessageSender.put("delayed-queue-job", jobX);
    }
}
