JDKPATH = /usr
LIBPATH = lib/bufmgrAssign.jar

CLASSPATH = $(LIBPATH)
BINPATH = $(JDKPATH)/bin
JAVAC = $(JDKPATH)/bin/javac 
JAVA  = $(JDKPATH)/bin/java 

compile:src/*/*.java
	$(JAVAC) -cp .:..:$(CLASSPATH) -d bin src/*/*.java


