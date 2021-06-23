import com.http.SocketHandle;

import java.io.IOException;
import java.net.ServerSocket;

public class TestSocketHttp {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        for (; ; ) {
            new SocketHandle(serverSocket.accept()).start();
        }
    }
}
