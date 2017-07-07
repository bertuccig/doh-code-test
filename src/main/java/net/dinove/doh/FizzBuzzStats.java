package net.dinove.doh;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzzStats {

    private String output;
    private Map<String, Integer> stats = new HashMap<String, Integer>();

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public Map<String, Integer> getStats() {
        return stats;
    }
}
