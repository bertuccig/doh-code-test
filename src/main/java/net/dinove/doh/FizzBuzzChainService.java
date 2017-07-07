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

    public String process(int value) {

        String output = "" + value;

        for (FizzBuzzProcessor p : chain) {

            output = p.process(value, output);
        }

        return output.trim();
    }
}
