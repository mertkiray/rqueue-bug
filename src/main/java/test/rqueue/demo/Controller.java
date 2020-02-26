package test.rqueue.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private RedisMessagePublisher redisMessagePublisher;

    @Autowired
    public Controller(RedisMessagePublisher redisMessagePublisher) {
        this.redisMessagePublisher = redisMessagePublisher;
    }

    @GetMapping("/test")
    public void testMethod(){
        redisMessagePublisher.sendDelayedMessage(new JobX("test","1"));
    }
}
