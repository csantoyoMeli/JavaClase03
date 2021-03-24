package ejercicio1;

public class PasswordIntermedia extends Password {

    public PasswordIntermedia() {
        setPattern("(?=.*[a-z])(?=.*[$@$!%*?&])([A-Za-z\\d$@$!%*?&]|[^ ]){8,15}");
    }

    public PasswordIntermedia(String regex) {
        super(regex);
    }
}
