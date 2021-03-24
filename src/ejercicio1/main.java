package ejercicio1;

public class main {
    public static void main(String[] args) {
        Password pf = new PasswordFuerte();
        Password pi = new PasswordIntermedia();
        Password ps = new PasswordSimple();

        pi.setValue("Pass1234!*");
        pf.setValue("pass123!*");
        pf.setValue("pass1234");

        pi.setValue("pasS1234");
        pi.setValue("pass1234!*");
        pi.setValue("pass1234");

        ps.setValue("pAss1234!*");
        ps.setValue("pass1234!*");
        ps.setValue("pass1234");
    }
}
