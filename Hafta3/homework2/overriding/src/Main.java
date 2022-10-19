public class Main {
    public static void main(String[] args) {
        BaseCreditManager[] creditManagers = new BaseCreditManager[]{new StudentCreditManager(),new TeacherCreditManager(),new BusinessCreditManager()};
        for (BaseCreditManager baseCreditManager: creditManagers) {
            System.out.println(baseCreditManager.hesapla(1000));
        }
    }
}