import org.apache.axis2.context.*;
import org.apache.axis2.transport.http.SimpleHTTPServer;

public class MockServer {
    public static void main(String[] args) throws Exception {
        final int port = 8080;
        final ConfigurationContext configuration = ConfigurationContextFactory.createDefaultConfigurationContext();
        SimpleHTTPServer receiver = new SimpleHTTPServer(configuration, port);

        receiver.start();
        Thread.sleep(1000);
        if (receiver.isRunning()){
            System.out.println("SERVER IS RUNNING");
        }
        Thread.sleep(1000);
        receiver.stop();
    }
}