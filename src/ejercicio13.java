import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ejercicio13 {

    public static void main(String[] args) {


        //Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)

        String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());

        System.out.println(timeStamp);
    }

}
