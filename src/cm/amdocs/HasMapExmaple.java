package cm.amdocs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HasMapExmaple {
public static void main(String[] args) {
	List<Map<List<Integer>,List<String>>>list=new ArrayList<>();
	Map<List<Integer>,List<String>> map=new HashMap<>();
	list.add(null);
	list.add(map);
	list.add(new HashMap<List<Integer>,List<String>>());

for (Iterator iterator = list.iterator(); iterator.hasNext();) {
	Map<List<Integer>, List<String>> map1 = (Map<List<Integer>, List<String>>) iterator.next();
	
	   for (Map.Entry<List<Integer>, List<String>> entry : map1.entrySet())  
           System.out.println("Key = " + entry.getKey() + 
                            ", Value = " + entry.getValue()); 
   } 
}
}

