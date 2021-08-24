package coderpad;

import java.util.HashMap;
import java.util.Map;

public class Apachelog {
    public static void main(String[] args) {
        String lines[] = new String[]{
                "10.0.0.1 - log entry 1 11",
                "10.0.0.1 - log entry 2 213",
                "10.0.0.2 - log entry 133132"};
        String result = mostUsedIPAddress(lines);
        System.out.println("most used IP address is "+ result);
    }

    private static String mostUsedIPAddress(String[] lines) {
        Map<String, Integer> map = new HashMap<>();
        int count =0 ;
        int currentCount = 0;
        String maxIP = " ";
        for (String input : lines) {
            String IPAddress = input.split(" ")[0];
            if (map.containsKey(IPAddress)) {
                currentCount = map.get(IPAddress);
                currentCount++;
                map.put(IPAddress, currentCount);
            } else {
                map.put(IPAddress, 1);
            }
        }

        for (String ip : map.keySet()) {
       int maxCount    = map.get(ip);
            if (count < maxCount) {
                count = maxCount;
                maxIP = ip;
            }
        }
        return maxIP;
    }
}

