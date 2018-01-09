package structural.proxy;

public interface ISocket {
    String readLine();
    void writeLine(String s);
    void dispose();
}
