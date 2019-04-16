# Getting Started

### Prerequisites
In order to run this program, a java runtime environment must be installed (tested with version 8).

### Building application
Please, run the following command
```bash
./build
```

### Running application
Please, run the following command specifying a string argument
```bash
./k-complementary

```

### Comments and improvements
* On first attempt a simple nested loop was implemented

see
[https://github.com/bravebeaver2019/k-complementary/commit/c8a1c9111c04a03009b8511bdc733d64445c18b8#diff-109e14a77a752f773331bef94acafc02]
```java
    int count = 0;
    for (int i = 0; i <= array.length - 1; i++) {
        for (int j = 0; j <= array.length - 1; j++) {
            if (i!=j && array[i] + array[j] == k) {
                count++;
            }
        }
    }
    return count / 2;
```

### Alternatives considered

### Comments and result
First approach has to loop over the whole array for each elements which leads to an O(n^2) complexity.
Even if we improved the algorithm by not chacking twice the comparisons already done the algorithm would have little
improvement in terms of efficiency.


### Things to do

