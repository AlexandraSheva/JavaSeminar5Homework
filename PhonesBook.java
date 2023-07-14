import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PhonesBook {

  private Map <String, List <String>> map = new HashMap <> ();

  void add (String lastName, List<String> telNum){
    map.put(lastName, telNum);
  }

  String getByTelNum (String lastName) {
    return lastName + ":" + map.get(lastName);
  }

  String getByLastName (List<String> telNum) {
    StringBuilder stringBuilder = new StringBuilder();
    for (Map.Entry entry:
    map.entrySet()) {
      if(entry.getValue().equals(telNum)) {
        stringBuilder.append(entry.getKey());
        stringBuilder.append(":");
        stringBuilder.append(entry.getValue());
        stringBuilder.append("\n");

      }
    }
    return stringBuilder.toString();
  }

  String getAll() {
    final TreeMap<String, List<String>> sorted = new TreeMap<>(map);
    return sorted.toString();
  }


}
