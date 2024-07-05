import java.io.*;
public class ByteArray {

    public static void main(String[] args)throws Exception {
       /*  byte c[]={'a','v','d'};
        ByteArrayInputStream br=new ByteArrayInputStream(c);char reader same AS byteInputStream
        int x=0;
        while((x=br.read())!=-1)
        {
            System.out.println((char)x);
        }
        br.close();*/
        ByteArrayOutputStream br=new ByteArrayOutputStream();
        br.write('a');
        br.write('d');
        br.write('e');
        br.write('f');
        byte b[]=br.toByteArray();
        for(byte x:b)
        System.out.println((char)x);
    }
}