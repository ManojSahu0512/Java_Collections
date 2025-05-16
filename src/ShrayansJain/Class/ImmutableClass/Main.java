package ShrayansJain.Class.ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> petNames = new ArrayList<>();
        petNames.add("dfff");
        petNames.add("fgfg");
        MyImmutableClass obj = new MyImmutableClass("Myname", petNames);

        obj.getPetNameList().add("hello");
        System.out.println(obj.getPetNameList());
    }

}
