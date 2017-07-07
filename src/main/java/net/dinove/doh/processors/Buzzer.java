package net.dinove.doh.processors;

public class Buzzer implements FizzBuzzProcessor {

    @Override
    public String process(int value, String previousChainOutput) {

        if((value % 5) == 0) { previousChainOutput = "buzz"; }

        return previousChainOutput;
    }
}
