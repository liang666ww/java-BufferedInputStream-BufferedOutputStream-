import java.io.*;

public class 字节缓冲流 {
    //字节缓冲流，读数据和写数据，这里便于利用文件，我们直接先写数据再读数据
    public static void main(String[] args) throws IOException {
        //创建字节缓冲流之输出流,
//        FileOutputStream fos = new FileOutputStream("dod.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //一部就位
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("dod.txt"));
//        //其底层还是字节输出流
//        bos.write("hello\r\n".getBytes());
//        bos.write("world\r\n".getBytes());
//        bos.close();
        //输入流是读，字节缓冲流之输入流
//        FileInputStream fis = new FileInputStream("dod.txt");
//        BufferedInputStream bis = new BufferedInputStream(fis);
        //FileInputStream fis = new FileInputStream("dod.txt");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("dod.txt"));
        //第一种，一个一个Byte的读取
//        int by;
//        while ((by=bis.read())!=-1){
//            System.out.print((char)by);
//            System.out.println(by);
//        }
        //第二种，一个数组的byte去读
        byte[] bys = new byte[1024];
        int len ;
        while((len= bis.read(bys))!=-1){
            System.out.print(new String(bys,0,len));
            System.out.println(len);
        }
        bis.close();
    }
}
