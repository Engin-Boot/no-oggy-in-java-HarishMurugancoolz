package remover;

import java.util.*;
import java.util.stream.Collectors;

public class Nooggy {
    
    public static void removeOggy(ArrayList<String> names) {
        for(int i_names=0;i_names<names.size();i_names++)
        {
                String str_to_remove="oggy";
                if(names.get(i_names).contains(str_to_remove))
                {
                    names.remove(i_names);
                    i_names--;
                }
        }
        return;
    }
    public static boolean oggyIsRemoved(ArrayList<String> names) {
        List<String> oggys = names.stream().filter(it -> it.contains("oggy")).collect(Collectors.toList());
        return oggys.size() == 0;
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("nobita", "bheem", "oggy", "oggy cockroach", "ninja"));
        removeOggy(names);
        if(oggyIsRemoved(names)) {
            System.out.println("Passed!");
            System.exit(0);
        } else {
            System.out.println("Failed!!");
            System.exit(1);
        }
    }
}
