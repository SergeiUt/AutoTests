package practice_7.user_monitor;

public class Main {
    public static void main(String[] args) {
        UserMonitor userMonitor = new UserMonitor();

        userMonitor.addNewSession("123");
        userMonitor.addNewSession("123");
        userMonitor.addNewSession("123");
        userMonitor.addNewSession("123");
        userMonitor.addNewSession("345");
        userMonitor.addNewSession("345");
        userMonitor.addNewSession("345");
        userMonitor.addNewSession("345");
        userMonitor.addNewSession("345");
        userMonitor.addNewSession("345");
        userMonitor.addNewSession("345");
        userMonitor.addNewSession("345");
        userMonitor.addNewSession("345");

        userMonitor.printSessions();


    }
}
