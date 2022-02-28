package hw4.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class PhoneTableClass {

    private HashMap<String,String> stringHashMap = new HashMap<>();

    public void add(String phone, String lastname){
        stringHashMap.put(phone,lastname);
    }

    public String getPhoneByLastName(String lastname){
        if(stringHashMap.containsValue(lastname)){
            String result = "Phone numbers: ";
            for(String key: stringHashMap.keySet()){
                if(stringHashMap.get(key).equals(lastname)) result += key + "; ";
            }
            return result;
        } else return "No result";

    }

    public Set<String> getPhoneByLastNameStream(String lastname){
        return stringHashMap.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), lastname))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }
}
