play-jaas-demo
=====================================

A simple Play application that uses play-jaas for authentication. 
This demo is self suficient in the sense that it uses play-jaas as a precompiled static dependency in the lib/ directory.
Defaults are used (ie. StubAuthModule). However, you need to create a jaas.config file with this content:

StubAuth {
 auth.impl.StubAuthModule required debug=true;
};

The project uses Global.java to configure JAAS but instead, you could simply configure the jaas file via -D property. 
Successful auth URL: http://localhost:9000/test?username=test&password=pwtest
Test unsuccessful auth URL: http://localhost:9000/test?username=test&password=test


