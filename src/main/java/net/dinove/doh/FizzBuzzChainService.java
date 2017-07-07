package net.dinove.doh;

import net.dinove.doh.processors.*;
import org.springframework.stereotype.Component;

@Component
public class FizzBuzzChainService {

    private FizzBuzzProcessor[] chain = {
            new Fizzer(),
            new Buzzer(),
            new FizzBuzzer(),
            new Lucky() };


    public FizzBuzzStats process(int[] seq) {

        StringBuilder sb = new StringBuilder();
        FizzBuzzStats stats = new FizzBuzzStats();

        for(int value : seq) {

            String current = "" + value;

            for (FizzBuzzProcessor p : chain) {

                current = p.process(value, current);
            }

            sb.append(String.format("%s ", current));

            if(current.matches("^-?\\d+$")) {
                current = "number";
            }

            if(stats.getStats().containsKey(current)) {

                Integer currentCount = stats.getStats().get(current);
                stats.getStats().put(current, currentCount + 1);
            } else {
                stats.getStats().put(current, 1);
            }
        }

        stats.setOutput(sb.toString().trim());

        return stats;
    }
}
