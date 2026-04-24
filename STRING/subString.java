class Main {
    public static String printSubstring(String str, int si, int ei){
        String substring = "";
        for(int i=si; i<ei; i++){
            substring += str.charAt(i);
        }
        return substring;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(printSubstring(str, 0, 5));
        System.out.println(str.substring(0,7));
    }
}
