import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
  
  private Map <String, String> map = new HashMap <> ();

  void add (String telNum, String lastName){
    map.put(telNum, lastName) ;
  }
  
  String getByTelNum (String telNum) {
    return telNum + ":" + map.get(telNum);
  }

  String getByLastName (String lastName) {
    StringBuilder stringBuilder = new StringBuilder();
    for (Map.Entry entry:
    map.entrySet()) {
      if(entry.getValue().equals(lastName)) {
        stringBuilder.append(entry.getKey());
        stringBuilder.append(":");
        stringBuilder.append(entry.getValue());
        stringBuilder.append("\n");

      }
    }
    return stringBuilder.toString();
  }

  String getAll() {
    TreeMap<String, String> sorted = new TreeMap<>(map);
    return sorted.toString();
  }

}
