package ejercicio1;

public class PasswordSimple  extends Password{

    public PasswordSimple() {
        setPattern("(\\w|[^ ]){8,15}");
    }

    public PasswordSimple(String regex) {
        super(regex);
    }
}
