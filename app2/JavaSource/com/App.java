package com;
// mvn clean jacoco:prepare-agent install jacoco:report sonar:sonar -P coverage -Dsonar.host.url=http://localhost:9000 -Dsonar.login=5daad91563a6477d08db7ba6b71f6cc3b957e0bb
public class App {
    public String get(String x) {
        return "welcome " + x;
    }
}
