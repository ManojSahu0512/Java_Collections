package Coding.String;

public class Encryption {
    public static String encryption(String s) {
        // Write your code here
        String str=s.replaceAll("\\s", "");
        int length=str.length();
        StringBuilder result=new StringBuilder();

        int row=(int)Math.floor(Math.sqrt(length));
        int column=(int)Math.ceil(Math.sqrt(length));
        //System.out.println(row+" "+column);
        if (row * column < length) {
            row++;
        }

        for(int i=0;i<column;i++){
            for(int j=i;j<length;j+=column){
                result.append(str.charAt(j));
            }
            result.append(" ");
        }
        return result.toString().trim();

    }

    public static String AnotherSolutionEncryption(String s){
        // Step 1: Remove spaces
        s = s.replaceAll("\\s+", "");
        int L = s.length();

        // Step 2: Determine rows and columns
        int rows = (int) Math.floor(Math.sqrt(L));
        int cols = (int) Math.ceil(Math.sqrt(L));
        if (rows * cols < L) {
            rows++;
        }
        StringBuilder[] grid=new StringBuilder[cols];
        for(int i=0;i<cols;i++){
            grid[i]=new StringBuilder();

        }
        // Step 4: Fill column-wise using row-wise traversal
        for (int i = 0; i < L; i++) {
            grid[i % cols].append(s.charAt(i));
        }
// Step 5: Join column strings with space
        StringBuilder encrypted = new StringBuilder();
        for (StringBuilder col : grid) {
            encrypted.append(col).append(" ");
        }

        return encrypted.toString().trim();
    }

    public static void main(String[] args) {
        String str="haveaniceday";
        String result=encryption(str);
        System.out.println(result);

    }
}
