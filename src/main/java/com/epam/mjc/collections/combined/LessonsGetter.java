package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> result = new HashSet<>();
        for (List<String> lessons : timetable.values()) {
            result.addAll(lessons);
        }

        return result;
    }
}
