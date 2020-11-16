public class ProcessBuilderEx01{
    public static void main(String[] args) throws Exception{
        ProcessBuilder processBuilder
            //= new ProcessBuilder("C:\\Program Files\\Internet Explorer\\iexplore");
            //= new ProcessBuilder("C:\\Program Files\\Internet Explorer\\iexplore","www.google.com");
            = new ProcessBuilder("C:\\Windows\\system32\\mspaint", "C:\\html\\Chrysanthemum.jpg");
        processBuilder.start();
    }
}