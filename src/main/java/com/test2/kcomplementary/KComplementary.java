package com.test2.kcomplementary;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Slf4j
public class KComplementary {

    public int countComplementaries(int[] array, int k) {
        int count = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array.length - 1; j++) {
                if (i!=j && array[i] + array[j] == k) {
                    count++;
                }
            }
        }
        return count / 2;

    }
    public int countComplementariesTrial(int[] array, int k) {
        int count = 0;
        Map<Integer, Integer> elements = new HashMap<>();
        for (int i = 0; i <= array.length - 1; i++) {
            if(elements.containsKey(array[i])) {
                elements.put(array[i],elements.get(array[i])+1);
            } else {
                elements.put(array[i],1);
            }
        }
        for (int i = 0; i <= array.length - 1; i++) {
            log.info("element: " + (k-array[i]));
            int lookFor = (k-array[i]);
            log.info("looking for: " + lookFor);
            if(elements.containsKey(lookFor) && array[i]!=elements.get(lookFor)) {
                log.info("hits *" + elements.get(lookFor));
                count+=elements.get(lookFor);
            }
        }
        log.info("count: " + count);
        return count/2;
    }
}
