package io.slugstack.oss.unspecifiedgradleproject;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @lombok.Data
// @java.lang.SuppressWarnings("checkstyle:HideUtilityClassConstructor")
@SuppressWarnings("checkstyle:HideUtilityClassConstructor")
@SpringBootApplication
public class UnspecifiedGradleProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnspecifiedGradleProjectApplication.class, args);
    }

}

class Example {
    // just wanting some reason to have imports and file content
    void example() {
        Set<String> someSet = new HashSet<>();
        someSet.add("someExample");
        Collection<String> someList = someSet.stream().collect(Collectors.toList());
        someList.add("anotherExample");
        List<String> emptyList = Collections.emptyList();
        emptyList.size();
    }
}