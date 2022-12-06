package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Set<String>> pair : projects.entrySet()) {
            if (pair.getValue().contains(developer)) {
                result.add(pair.getKey());
            }
        }

        result.sort((s1,s2)-> {
            int firstLength = s1.length();
            int secondLength = s2.length();

            if (firstLength == secondLength) {
                return s2.compareTo(s1);
            }
            else return Integer.compare(secondLength,firstLength);
        });

        return result;
    }
}
