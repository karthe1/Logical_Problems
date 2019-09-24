# Logical Problems

This repository is used to push problems solved in hacker earth.


# Problem 1 : 

Little Chandan is an exceptional manager - apart from his role in HackerEarth - as the person who has to bug everyone, in general... and if possible, try to get some work done.

He's also offered a job as the coach of the best Russian teams participating for ACM-ICPC World Finals. Now, Chandan is an extremely good coach, too. But he's a weird person who thrives on patterns in life, in general. So, he has decided that if there are n number of students in total, and he is supposed to divide them in camps of k students - he want them to be arranged in such a way that the length of names of all the students in a camp is equal.

I know, totally weird, right?

Input:

The first line will contain the number of test cases. Which will be followed by two integers, n, k - denoting the number of total students, and the number of total students which will be allowed in one camp. After which, n lines will follow denoting the names of all the students who're willing to learn by the great coach.

Output:

If it is possible for all the students be arranged in a camp of k students, print "Possible", else print "Not possible".

Constraints:

1 <= Test Cases <= 50
1 <= N <= 1000
1 <= K <= 1000
1 <= LengthOfAString <= 100
The name of a programmer will always be in lower case.

PS: n%k will ALWAYS be equal to zero - that is, it will possible to divide the n students in equal sized camps of k.

# sample input 

2

6 3

arjit

tijra

genius

chanda

ashish

arjit

4 2

bond

coder

bond

lol

# sample output 

Possible

Not possible

Explanation

In the first case, we can divide the six members into two teams of three with people having equal number of characters in their names. In the second case, we cannot do the same.

# Problem 2 : 

Roman loved diamonds. Monica decided to give him a beautiful gift on Valentine's Day. 
Her idea of diamonds was different though. She lit up all the windows of her rectangular building with N floors and M windows on each floor, with 2 shapes - / or \ . 
According to her, a diamond was made when such a shape was created:

/ \

\ /

Given the shape of lights in all the windows, help Roman count the number of diamonds formed.
Note: The components of the diamond should be adjacent to each other.

Input:

First line contains T - the number of testcases.
For each testcase,
First line contains 2 space-separated positive integers - N and M - the no. of floors in the building and the no. of windows on each floor respectively.
N lines follow - each line contains M space-separated characters. Every character is either or / .

Output:

Print a single integer - the total no. of diamonds formed.

Constraints:

1 ≤ T ≤ 5
2 ≤ N, M ≤ 1000

# sample input 

1

2 4

/ \ / \

\ / \ /

# sample output 

Total no of diamond is : 2

# sample input 

1

2 5

/ \ / / \

\ / \ \ /

# sample output

Total no of diamond is : 2

# Problem 3 : 

Watson gives a date to Sherlock and asks him what is the date on the previous day. Help Sherlock. 
You are given date in DD MM YYYY format. DD is an integer without leading zeroes. 
MM is one of the "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November" and "December" (all quotes for clarity). 
YYYY is also an integer between 1600 and 2000 without leading zeroes. You have to print the date of the previous day in same format.

Input and Output

First line, T (≤ 100), the number of testcases. Each testcase consists of date in specified format. For each testcase, print the required answer in one line. Given date will be a valid date.

# sample input 

3

23 July 1914

2 August 2000

5 November 1999

# sample output 

22 July 1914

1 August 2000

4 November 1999
