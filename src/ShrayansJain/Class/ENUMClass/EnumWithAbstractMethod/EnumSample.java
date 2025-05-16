package ShrayansJain.Class.ENUMClass.EnumWithAbstractMethod;

public enum EnumSample {
    FRIDAY{
        @Override
        public void dummyMethod() {
            System.out.println("In friday");
        }
    },
    SATURDAY {
        @Override
        public void dummyMethod() {
            System.out.println("In saturday");
        }
    },
    SUNDAY {
        @Override
        public void dummyMethod() {
            System.out.println("In sunday");
        }
    };
    public abstract void dummyMethod();
}
