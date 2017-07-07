package net.dinove.doh;

import net.dinove.doh.processors.Buzzer;
import net.dinove.doh.processors.FizzBuzzProcessor;
import net.dinove.doh.processors.FizzBuzzer;
import net.dinove.doh.processors.Fizzer;
import org.springframework.stereotype.Component;

@Component
public class FizzBuzzChainService {

    private FizzBuzzProcessor[] chain = {
            new Fizzer(),
            new Buzzer(),
            new FizzBuzzer() };

    public String process(int value) {

        String output = "" + value;

        for (FizzBuzzProcessor p : chain) {

            output = p.process(value, output);
        }

        return output.trim();
    }
}
