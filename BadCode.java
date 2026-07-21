public class BadCode {
    public void badCode() {
        String p = new String("pwd"); if (p == "pwd") { }
        try { System.out.println(1 / 0); } catch (Throwable t) {}
    }
}
