package com.flatironschool.javacs;
import java.lang.*;


public class HelloWorld {
    public static Double getVersion() {
        // I won't work!
	String strVersion = System.getProperty("java.version");
	System.out.println(strVersion);
	String version = strVersion.substring(0,3);
	System.out.println(version);
	return Double.parseDouble(version);
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion()
	HelloWorld.getVersion();
    }
}
