package net.dinove.doh.processors;

public class Lucky implements FizzBuzzProcessor {

    @Override
    public String process(int value, String previousChainOutput) {

        if(String.valueOf(value).contains("3")) { previousChainOutput = "luck"; }

        return previousChainOutput;
    }
}
