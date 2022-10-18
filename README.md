

### Setup

 - Install JDK14
 -  Install Maven
 - Install git client   
 - Setup your browser drivers based on execution platform.

### Run the tests!

```
mvn clean verify ( driver is defined in conf file which takes care of the initialisation )
```
###If you want to run with the tags provided in the cucumber file:

```
mvn clean verify -Dcucumber.filter.tags="@TagName"
```

The reports will be generated in `target/site/serenity`. ( path can be modified from properties file )