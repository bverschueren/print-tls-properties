import java.security.Security;

public class TestJdkTlsDisabledAlgortihms
{
    public static void main(String[] args)
    {
        final String s = "jdk.tls.disabledAlgorithms";
        System.out.println(s + "=" + Security.getProperty(s));
    }
}

