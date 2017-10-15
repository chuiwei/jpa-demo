package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobSchedule {

    @Autowired
    private UserRepository userRepository;
    private static final Logger logger = LoggerFactory.getLogger(JobSchedule.class);
    @Scheduled(cron="0 0/15 * * * ?")
    public void insert(){
        userRepository.save(new User("no1", "no1@163.com"));
    }

}
