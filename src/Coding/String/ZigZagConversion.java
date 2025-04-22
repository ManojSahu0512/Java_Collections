package Coding.String;

public class ZigZagConversion {
    public static String convert(String s, int numRows){
        if(numRows==1 || s.length()<=numRows){
            return s;
        }
        StringBuilder[] rows=new StringBuilder[numRows];
        // Create a list of StringBuilder, one for each row
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }
        int currentRow=0;
        boolean goingDown=false;
        // Traverse the string
        for(char ch:s.toCharArray()){
            rows[currentRow].append(ch);
            //// Change direction when hitting top or bottom
            if(currentRow==0 || currentRow==numRows-1){
                goingDown=!goingDown;
            }
            // Move up or down
            currentRow += goingDown ? 1 : -1;
        }
        //combine all rows
        StringBuilder result=new StringBuilder();
        for(StringBuilder row:rows){
            result.append(row);

        }
        return result.toString();
    }

    public static void main(String[] args) {
       String s = "PAYPALISHIRING";
       int numRows = 4;
        System.out.println(convert(s,numRows));
    }
}
