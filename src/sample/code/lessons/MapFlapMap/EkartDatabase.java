package sample.code.lessons.MapFlapMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {

    public static List<CustomerMap> getAll(){
        return Stream.of(
                new CustomerMap(20, "John", "john@gmail.com", Arrays.asList("0701357594","0557211540")),
                new CustomerMap(21, "henry", "henry@gmail.com", Arrays.asList("0701357594","0557211540")),
                new CustomerMap(22, "Omary", "omary@gmail.com", Arrays.asList("0701357594","0557211540")),
                new CustomerMap(23, "Vivek", "vivek@gmail.com", Arrays.asList("0701357594","0557211540")),
                new CustomerMap(24, "Joseph", "joseph@gmail.com", Arrays.asList("0701357594","0557211540"))
        ).collect(Collectors.toList());
    }
}
