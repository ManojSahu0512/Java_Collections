package ShrayansJain.Class.ENUMClass.Custom;

public enum EnumSample {
    MONDAY(101,"1st day of the week"),
    TUESDAY(102,"2st day of the week"),//1
    WEDNESDAY(103,"3st day of the week"),//2
    THURSDAY(104,"4st day of the week"),//3
    FRIDAY(105,"5st day of the week"),//4
    SATURDAY(106,"1st day of the weekend"),//5
    SUNDAY(107,"2st day of the weekend");
    private int val;//common for all above
    private String comment;//common for all above
    EnumSample(int val,String comment){
        this.val=val;
        this.comment=comment;
    }

    public int getVal() {
        return val;
    }

    public String getComment() {
        return comment;
    }

    public static EnumSample getEnumFromValue(int value){
        for(EnumSample sample: EnumSample.values()){
            if(sample.val==value){
                return sample;
            }
        }
        return null;
    }
}
