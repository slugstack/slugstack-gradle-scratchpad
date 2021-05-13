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
// @SuppressWarnings("checkstyle:HideUtilityClassConstructor")
@SpringBootApplication
public class UnspecifiedGradleProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnspecifiedGradleProjectApplication.class, args);
    }

}

class CollectionsExample {
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

class SwitchExample {
    void example(int n) {
        int q = 0;

        switch (n) {
            case 1:
                q += 1;
                break;
            case 2:
                q += 2;
            default:
                break;
        }

        switch (n) {
            case 1:
                q += 1;
            default:
                break;
            case 2:
                q += 2;
        }

        switch (n) {
            case 1:
                q += 1;
            default:
            case 2:
                q += 2;
            case 3:
                q += 3;
        }

        switch (n) {
            case 1:
                q += 1;
        }

    }
}