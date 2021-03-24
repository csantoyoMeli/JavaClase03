package ejercicio1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private String pass;
    private String pattern;

    public Password() {
    }

    public Password(String regex) {
        this.pattern = regex;
    }

    public void setValue(String pwd) {
        Pattern r = Pattern.compile(this.pattern);
        Matcher m = r.matcher(pwd);

        if (m.matches()) {
            System.out.println("La contraseña es válida");
            setPass(pwd);
        } else {
            System.out.println("La contraseña no es válida");
            //throw new RuntimeException("La contraseña no es válida");
        }
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
