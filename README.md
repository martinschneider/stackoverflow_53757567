# stackoverflow_53757567
See https://stackoverflow.com/questions/53757567/maven-plugin-compiles-fine-but-cant-find-class-during-execution.

To reproduce:
```
cd demo-maven-plugin
mvn clean install
cd ../demo-project
mvn demo:demo
```

Output:
```
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building demo-project 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- demo-maven-plugin:0.0.1-SNAPSHOT:demo (default-cli) @ demo-project ---
[INFO] Hello world!
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.552 s
[INFO] Finished at: 2018-12-13T17:54:31+08:00
[INFO] Final Memory: 6M/30M
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal io.github.martinschneider:demo-maven-plugin:0.0.1-SNAPSHOT:demo (default-cli) on project demo-project: Execution default-cli of goal io.github.martinschneider:demo-maven-plugin:0.0.1-SNAPSHOT:demo failed: A required class was missing while executing io.github.martinschneider:demo-maven-plugin:0.0.1-SNAPSHOT:demo: org/slf4j/event/Level
[ERROR] -----------------------------------------------------
[ERROR] realm =    plugin>io.github.martinschneider:demo-maven-plugin:0.0.1-SNAPSHOT
[ERROR] strategy = org.codehaus.plexus.classworlds.strategy.SelfFirstStrategy
[ERROR] urls[0] = file:/Users/martinschneider/.m2/repository/io/github/martinschneider/demo-maven-plugin/0.0.1-SNAPSHOT/demo-maven-plugin-0.0.1-SNAPSHOT.jar
[ERROR] urls[1] = file:/Users/martinschneider/.m2/repository/org/slf4j/slf4j-simple/1.7.25/slf4j-simple-1.7.25.jar
[ERROR] urls[2] = file:/Users/martinschneider/.m2/repository/org/apache/commons/commons-lang3/3.5/commons-lang3-3.5.jar
[ERROR] urls[3] = file:/Users/martinschneider/.m2/repository/javax/enterprise/cdi-api/1.0/cdi-api-1.0.jar
[ERROR] urls[4] = file:/Users/martinschneider/.m2/repository/org/eclipse/sisu/org.eclipse.sisu.inject/0.3.3/org.eclipse.sisu.inject-0.3.3.jar
[ERROR] urls[5] = file:/Users/martinschneider/.m2/repository/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.jar
[ERROR] urls[6] = file:/Users/martinschneider/.m2/repository/org/codehaus/plexus/plexus-utils/3.1.0/plexus-utils-3.1.0.jar
[ERROR] Number of foreign imports: 1
[ERROR] import: Entry[import  from realm ClassRealm[maven.api, parent: null]]
[ERROR]
[ERROR] -----------------------------------------------------
[ERROR] : org.slf4j.event.Level
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/PluginContainerException
```
