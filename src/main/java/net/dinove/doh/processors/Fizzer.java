package net.dinove.doh.processors;

public class Fizzer implements FizzBuzzProcessor {

    @Override
    public String process(int value, String previousChainOutput) {

        if((value % 3) == 0) { previousChainOutput = "fizz"; }

        return previousChainOutput;
    }
}
