package Generate_Tag;
class Solution {
    public static void main(String[] args) {
        System.out.println(generateTag("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));
    }
    public static String generateTag(String caption) {
        StringBuffer s = new StringBuffer(caption);
        for(int i=0;i<s.length();i++){
            if(i == 0){
                s.replace(i, i+1, String.valueOf(Character.toLowerCase(s.charAt(i))));
                s.insert(0,'#');
            }
            if(s.charAt(i) == ' '){
                if(i !=0){
                    s.replace(i+1, i+2, String.valueOf(Character.toUpperCase(s.charAt(i+1))));
                }
                s.deleteCharAt(i);
            }
        }
        if(s.length()>100){
            s.delete(100,s.length());
        }
        System.out.println(s.length());
        return s.toString();
    }
}
