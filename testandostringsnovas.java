import java.util.regex.Matcher;
import java.util.regex.Pattern;

class testandostrings {

    public static void main (String[] args) {

    String texto = "marcha6@gmail.com";
    Pattern pattern = Pattern.compile("\\w+@\\w+.\\w+");
    Matcher matcher = pattern.matcher(texto);

    if (matcher.find()) {System.out.println(matcher.group());}
    
    else {System.out.println("nao foi");}

    }
}