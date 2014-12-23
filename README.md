myRulesApp
==========

Example of using BRMS artifacts with a Java application

Be sure to install the BRMS artifacts into your local
Maven repository.  MyProject-1.0.jar can be found in
myRulesApp/src/main/resources.  This file must be 
installed into your local Maven repository.
This can be done in the following way:

mvn install:install-file -Dfile=<path-to-file>/MyProject-1.0.jar 
-DgroupId=com.redhat -DartifactId=MyProject -Dversion=1.0 
-Dpackaging=jar
