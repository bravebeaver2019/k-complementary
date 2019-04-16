package com.test2.kcomplementary;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

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
}
