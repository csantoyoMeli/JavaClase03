package ejercicio1;

public class PasswordFuerte extends Password {

    public PasswordFuerte() {
        setPattern("/^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])([A-Za-z\\d$@$!%*?&]|[^ ]){8,15}$/");
    }

    public PasswordFuerte(String regex) {
        super(regex);
    }
}
