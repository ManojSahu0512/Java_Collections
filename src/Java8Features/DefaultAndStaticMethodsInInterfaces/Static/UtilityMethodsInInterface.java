package Java8Features.DefaultAndStaticMethodsInInterfaces.Static;
interface StringUtils{
    static boolean isNullOrEmpty(String str){
        return str==null || str.trim().isEmpty();
    }
    static String reverse(String str){
        if(isNullOrEmpty(str)){
            return str;
        }
        return new StringBuilder(str).reverse().toString();

    }

}
public class UtilityMethodsInInterface {
    public static void main(String[] args) {
        String str="Hello";
        System.out.println(StringUtils.isNullOrEmpty(str));//false
        System.out.println(StringUtils.reverse(str));//olleH
        System.out.println(StringUtils.isNullOrEmpty(null));//true
    }

}
