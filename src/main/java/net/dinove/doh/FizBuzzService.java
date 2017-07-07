package net.dinove.doh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FizBuzzService {

    @Autowired
    private FizzBuzzChainService chain;

    public void printFizzBuzzSequence(int[] seq) {

        FizzBuzzStats stats = chain.process(seq);

        System.out.println(stats.getOutput());

        for(String key : stats.getStats().keySet()) {

            int value = stats.getStats().get(key);

            System.out.println(String.format("%s: %d", key, value));
        }
    }
}
