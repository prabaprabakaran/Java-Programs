import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class address {

	public static void main(String[] args) throws Exception {
		Process p = Runtime.getRuntime().exec("getmac /fo csv /nh");
	    java.io.BufferedReader in = new java.io.BufferedReader(new  java.io.InputStreamReader(p.getInputStream()));
	    String line;
	    line = in.readLine();        
	    String[] result = line.split(",");
       System.out.println(result[0].replace('"', ' ').trim());
	}
}