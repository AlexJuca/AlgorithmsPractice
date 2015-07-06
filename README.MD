# This is code to solve the Dynamic Connectivity Problem
## Applications
1. Pixels in digital images
2. Computers in a network
3. Friends in a social network

## Algorithm: Quick Find

# QuickFind is too slow
Cost model. Number of array accesses for read and write

| Algorithm     | Initialize    | Union | fnd |
| ------------- |:-------------:| -----:|-----:|
| quick-find    |      N        | N     |  1   |


Conclusion: Union is too expensive. It Takes N^2 array accesses to process a sequence of N union commands on N objects

Quick-Find can be described as a quadratic algorithm
The reason for this is that the Quick-Find algorith does not scale
and will actually run slower on machines that are faster.
