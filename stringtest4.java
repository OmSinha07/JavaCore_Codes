public class stringtest4 {
    public static void main(String[] args) {
        String st= "A2342#absd";
        System.out.println(st.replaceAll("[^a-zA-Z0-9]",""));
        String str= "A B C D";
        System.out.println(str.replaceAll(" ",""));
    }
    
}
