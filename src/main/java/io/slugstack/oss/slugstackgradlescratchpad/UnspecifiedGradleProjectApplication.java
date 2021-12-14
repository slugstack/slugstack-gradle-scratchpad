package io.slugstack.oss.slugstackgradlescratchpad;

import java.util.*;
import java.util.stream.Collectors;

public class UnspecifiedGradleProjectApplication {

    public static void main(String[] args) {
        // empty
    }

    static void collectionsExample() {
        Set<String> someSet = new HashSet<>();
        someSet.add("someExample");
        Collection<String> someList = someSet.stream().collect(Collectors.toList());
        someList.add("anotherExample");
        List<String> emptyList = Collections.emptyList();
        emptyList.size();
    }

    static void switchExample(int n) {
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
