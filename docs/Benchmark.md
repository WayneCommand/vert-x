# Java Web Server Benchmark.

> platform macOS 12.3.1  
> apib 1.2.1  
> MacBook Pro 2020 (Apple M1)

## Spring series

### springboot-3-with-tomcat

```log
$ apib -c 100 -d 60 http://localhost:8080
(5 / 60) 29173.593
(10 / 60) 30639.586
(15 / 60) 32093.760
(20 / 60) 31336.041
(25 / 60) 31387.008
(30 / 60) 31980.702
(35 / 60) 30259.248
(40 / 60) 28512.543
(45 / 60) 30235.800
(50 / 60) 30630.299
(55 / 60) 29670.859
(60 / 60) 29961.467
Duration:             60.026 seconds
Attempted requests:   1830198
Successful requests:  1830198
Non-200 results:      0
Connections opened:   18277
Socket errors:        0

Throughput:           30490.056 requests/second
Average latency:      3.278 milliseconds
Minimum latency:      -0.024 milliseconds
Maximum latency:      640.752 milliseconds
Latency std. dev:     16.853 milliseconds
50% latency:          0.704 milliseconds
90% latency:          2.036 milliseconds
98% latency:          40.707 milliseconds
99% latency:          82.671 milliseconds

Client CPU average:   0%
Client CPU max:       0%
Client memory usage:  0%

Total bytes sent:     101.24 megabytes
Total bytes received: 382.57 megabytes
Send bandwidth:       13.49 megabits / second
Receive bandwidth:    50.99 megabits / second

```

### springboot-3-webflux-with-netty

```log
$ apib -c 100 -d 60 http://localhost:8080
(5 / 60) 31463.810
(10 / 60) 32915.347
(15 / 60) 32947.279
(20 / 60) 31512.250
(25 / 60) 32201.627
(30 / 60) 30792.850
(35 / 60) 31314.435
(40 / 60) 32534.285
(45 / 60) 32651.288
(50 / 60) 32870.555
(55 / 60) 32577.630
(60 / 60) 32672.992
Duration:             60.016 seconds
Attempted requests:   1932799
Successful requests:  1932799
Non-200 results:      0
Connections opened:   12
Socket errors:        0

Throughput:           32204.566 requests/second
Average latency:      3.105 milliseconds
Minimum latency:      0.655 milliseconds
Maximum latency:      131.475 milliseconds
Latency std. dev:     2.429 milliseconds
50% latency:          2.218 milliseconds
90% latency:          5.799 milliseconds
98% latency:          9.638 milliseconds
99% latency:          11.714 milliseconds

Client CPU average:   0%
Client CPU max:       0%
Client memory usage:  0%

Total bytes sent:     106.91 megabytes
Total bytes received: 333.71 megabytes
Send bandwidth:       14.25 megabits / second
Receive bandwidth:    44.48 megabits / second
```

### springboot-3-with-undertow

```log
apib -c 100 -d 60 http://localhost:8080
(5 / 60) 30943.597
(10 / 60) 32166.500
(15 / 60) 31737.215
(20 / 60) 30309.489
(25 / 60) 32350.955
(30 / 60) 32563.335
(35 / 60) 30425.920
(40 / 60) 30700.345
(45 / 60) 32095.133
(50 / 60) 31814.177
(55 / 60) 32453.898
(60 / 60) 32529.545
Duration:             60.037 seconds
Attempted requests:   1901628
Successful requests:  1901628
Non-200 results:      0
Connections opened:   12
Socket errors:        0

Throughput:           31674.157 requests/second
Average latency:      3.156 milliseconds
Minimum latency:      0.067 milliseconds
Maximum latency:      550.007 milliseconds
Latency std. dev:     13.716 milliseconds
50% latency:          1.178 milliseconds
90% latency:          1.773 milliseconds
98% latency:          30.152 milliseconds
99% latency:          58.289 milliseconds

Client CPU average:   0%
Client CPU max:       0%
Client memory usage:  0%

Total bytes sent:     105.19 megabytes
Total bytes received: 444.26 megabytes
Send bandwidth:       14.02 megabits / second
Receive bandwidth:    59.20 megabits / second
```

## based on netty.

### vert.x - with - netty

```log
apib -c 100 -d 60 http://localhost:8888
(5 / 60) 146864.506
(10 / 60) 163334.585
(15 / 60) 166344.047
(20 / 60) 165767.079
(25 / 60) 156432.680
(30 / 60) 155614.541
(35 / 60) 155175.596
(40 / 60) 155449.082
(45 / 60) 155278.982
(50 / 60) 154783.762
(55 / 60) 155244.361
(60 / 60) 149775.699
Duration:             60.053 seconds
Attempted requests:   9408666
Successful requests:  9408666
Non-200 results:      0
Connections opened:   12
Socket errors:        0

Throughput:           156672.205 requests/second
Average latency:      0.638 milliseconds
Minimum latency:      -1.245 milliseconds
Maximum latency:      108.479 milliseconds
Latency std. dev:     0.731 milliseconds
50% latency:          0.612 milliseconds
90% latency:          0.690 milliseconds
98% latency:          1.200 milliseconds
99% latency:          1.264 milliseconds

Client CPU average:   0%
Client CPU max:       0%
Client memory usage:  0%

Total bytes sent:     520.42 megabytes
Total bytes received: 1623.44 megabytes
Send bandwidth:       69.33 megabits / second
Receive bandwidth:    216.27 megabits / second
```