
/**
@Author - Amit
@version - 4.0

*/
class BannerUsingArray {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        
        String line[] = new String[7];
        
        line[0] = String.join(" ","    **    ","    **    "," ******* ","   ****  ");
        
        line[1] = String.join(" ","  **  **  ","  **  **  "," **    * "," **      ");
        
        line[2] = String.join(" "," **    ** "," **    ** "," **    * ","**       ");
        
        line[3] = String.join(" "," **    ** "," **    ** "," ******* ","  *****   ");
        
        line[4] = String.join(" "," **    ** "," **    ** "," **      ","      **  ");
        
        line[5] = String.join(" ","  **  **  ","  **  **  "," **      "," **   **  ");
        
        line[6] = String.join(" ","    **    ","    **    "," **      ","   ****   ");
        
        
        for(String s: line){
            System.out.println(s);
        }
        
        // System.out.println(line[0]);
        
        
    }
}