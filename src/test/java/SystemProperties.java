import com.google.gson.internal.bind.util.ISO8601Utils;
import org.testng.annotations.Test;

public class SystemProperties {
    @Test
    public void tet(){
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("user.home"));
    }
}
