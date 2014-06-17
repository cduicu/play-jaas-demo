package controllers;

import auth.Secured;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

/**
 * This is a secured controller. The simplest way to test is by passing the username and password in the request.
 * Of course, a proper usage calls for a real sign-in page. In absence of it you can test the secured showUser()
 * with this URL:
 * <code>http://localhost:9000/test?username=test&password=pwtest</code>
 * This should result in a successful authentication.
 * Refer to StubAuthModule for details on supported usernames/passwords.
 *
 * Created by cristiand on 6/17/2014.
 * */
@Security.Authenticated(Secured.class)
public class MySecuredController extends Controller {

    public static Result showUser() {
        return ok("User: " + request().username());
    }

}
