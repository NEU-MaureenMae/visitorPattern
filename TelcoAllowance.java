import java.util.*;

public class TelcoAllowance implements UsagePromo {


    private static Map<String, Integer> dataMap = new HashMap<>();

    static {
        dataMap.put("Smart", 15);
        dataMap.put("Globe", 10);
        dataMap.put("Ditto", 8);
    }

    public String showAllowance(String telcoName, double money) {
        int dataAllowance = dataMap.get(telcoName);

        return "Offers a data allowance of " + dataAllowance + "GB for ₱" + money + " per month";
    }

}
