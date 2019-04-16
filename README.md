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

* Second attempt:

### Alternatives considered

I have realized that sencond loop is used to just locate a specific integer, there is no need to scan an array to find elements, we can use some data structures.
If we run across the array and put all the elements in a Set (or hashmap to keep the elements count) we can easily check if the number matching the condition is present,
```
e[i] + e[j] = k =>
e[j] = k - e[i]
```
hash access is based on index.
Of course it will have impact in memory but will reduce complexity and process time.
lets give a try.
The problem is that I cant know if the number I am looking for is the same number I am now, for example, given the array {2} with k=4, this algorithm returns 1,
or worst the array {2,2,2,2} with k=4 returns 16! I couldnt workaround this problem :(

### Comments and result
First approach has to loop over the whole array for each elements which leads to an O(n^2) complexity.
Even if we improved the algorithm by not chacking twice the comparisons already done the algorithm would have little
improvement in terms of efficiency.


### Things to do

