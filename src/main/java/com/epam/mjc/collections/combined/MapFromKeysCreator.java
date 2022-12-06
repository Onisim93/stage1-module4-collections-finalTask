package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();

        for (Map.Entry<String, Integer> pair : sourceMap.entrySet()) {
            if (result.putIfAbsent(pair.getKey().length(), new HashSet<>(List.of(pair.getKey()))) != null) {
                result.computeIfPresent(pair.getKey().length(), (k,v) -> {v.add(pair.getKey()); return v;});
            }
        }

        return result;
    }
}
