import play.Application;
import play.GlobalSettings;

/**
 * Created by cristiand on 6/17/2014.
 *
 * Create a jaas file with the following content.
 * <code>
 * StubAuth {
 * auth.impl.StubAuthModule required debug=true;
 * };
 </code>
 */
public class Global extends GlobalSettings {

    @Override
    public void onStart(Application app) {
        // you could also pass this via -D
        System.setProperty("java.security.auth.login.config", "C:/play/chris-jaas.config");
    }

}
