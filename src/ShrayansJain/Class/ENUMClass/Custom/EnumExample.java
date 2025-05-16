package ShrayansJain.Class.ENUMClass.Custom;

public enum EnumExample {
    MONDAY{
        @Override
        public void dummyMethod(){
            System.out.println("Monday dummy method");
        }
    },//0 internally it will assign
    TUESDAY,//1
    WEDNESDAY,//2
    THURSDAY,//3
    FRIDAY,//4
    SATURDAY,//5
    SUNDAY;//6
    public void dummyMethod(){
        System.out.println("default dummy Method");

    }
}
