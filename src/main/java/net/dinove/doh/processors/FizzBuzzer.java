package net.dinove.doh.processors;

public class FizzBuzzer implements FizzBuzzProcessor {

    @Override
    public String process(int value, String previousChainOutput) {

        if(((value % 3) == 0) && ((value % 5) == 0)) { previousChainOutput = "fizzbuzz"; }

        return previousChainOutput;
    }
}
