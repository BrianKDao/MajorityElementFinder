# MajorityElementFinder
Input:  
  narray of N positive integers - size of the problem is N n
  
Input Format:–First line: a single integer number N>=3, N<=1,000,000, showing the number of integers in the array (it is not in the array)
–Following N lines: each contains a single positive integer containing the elements of the array 
-Each integer will be <=1,000,000,000 
–Input will always be correct with respect to the specification above (error handling is NOT needed)
  
Output:  
  1) majority element (M.E.) – element occurring more than N/2 times (order of elements doesn’t matter), if M.E. exists 
  2) -1, if the majority element does not exist in the array

Output format: –A single line, with a single integer: 
--1 if the input array has no majority element 
-X if integer X is the majority element of the input array

Input should be read into array of integers: int[] (do not use ArrayList)
The code should work on that array, without re-formatting the data e.g. into a linked list or any other data structure
The algorithm should have O(N) time complexity
Use of any Java built-in functions/classes is NOT allowed
With the exception of functions from Scanner, System.in and System.out (or equivalent) for input/output
