package net.dinove.doh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FizBuzzService {

    @Autowired
    private FizzBuzzChainService chain;

    public void printFizzBuzzSequence(int[] seq) {

        StringBuilder sb = new StringBuilder();

        for(int value : seq) {

            sb.append(String.format("%s ", chain.process(value)));
        }

        System.out.println(sb);
    }
}
