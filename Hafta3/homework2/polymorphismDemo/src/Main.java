public class Main {
    public static void main(String[] args) {
      /*  BaseLogger baseLogger = new BaseLogger();
        BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(),new FileLogger(),new EmailLogger()};
        for (BaseLogger logger:loggers) {
            logger.log("Log mesaji ");
        }*/
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}