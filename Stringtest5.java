public class Stringtest5{
    public static void main(String[]argrs)
    {
        String st="omaasinha.99@gmail.gcom";
        int l=st.indexOf('@');
        String st1=st.substring(0,l);
        String st2=st.substring(l,st.length());
        System.out.println(st1);
        System.out.println(st2);

    }
}
