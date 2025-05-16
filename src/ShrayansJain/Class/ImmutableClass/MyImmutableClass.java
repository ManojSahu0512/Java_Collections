package ShrayansJain.Class.ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class MyImmutableClass {
    private final String name;
    private final List<Object> petNameList;
    MyImmutableClass(String name,List<Object> petNameList){
        this.name=name;
        this.petNameList=petNameList;
    }
    public String getName(){
        return name;
    }
    public List<Object> getPetNameList(){
        return new ArrayList<>(getPetNameList());
    }



}
