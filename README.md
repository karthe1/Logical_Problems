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

1 â‰¤ T â‰¤ 5
2 â‰¤ N, M â‰¤ 1000

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

First line, T (â‰¤ 100), the number of testcases. Each testcase consists of date in specified format. For each testcase, print the required answer in one line. Given date will be a valid date.

# sample input 

3

23 July 1914

2 August 2000

5 November 1999

# sample output 

22 July 1914

1 August 2000

4 November 1999

# Problem 4 :

Harry was contesting to be the most stylist person in his college. He had to collect maximum points from the judges to be able to win. However there was a problem. The judges were sitting in a line and each pair of adjacent judges had ego issues with each other. So if one judge gave X points to Harry then the next judge won’t give him any points. Harry had a friend in the organizing team and through him he had found out the exact points he would get from each judge if he chose their score to be considered. Help him find out the maximum points he can score.


# input

The first line of input contains the number of test cases, T.
0 < T < = 10

Each test case starts with a number N, the number of judges.
0 <= N < = 10^4.

The next line will have N numbers, number of points each judge gave Harry
0 < = X(i) < = 10^9.

The order of the judges does not change.


# output

For each test case print “Case T: A” without quotes in a single line.

T is the case number, starting with 1.

A is the maximum number of points Harry can collect.


# sample input 

2

5

1 2 3 4 5

1

10

# sample output

Case 1: 9

Case 2: 10

# Explanation

Case 1 : Harry chooses judges 1,3 and 5 with points 1 ,3 and 5 respectively to add up to 9 points in total. Case 2: There is only one judge so Harry chooses his points alone.

# Problem 5 : 

This is a harder version of 1A - Bear and Vowels.

There are  letters in the English alphabet and 6 of them are vowels: a,e,i,o,u,y. Other  letters are called consonants.

Limak is a little polar bear. He found a string s consisting of lowercase English letters. He is going to read and pronounce s but it may be hard for him. Some letters are harder to pronounce, some are easier. Generally, little polar bears like vowels (letters a,e,i,o,u,y) and hate consonants.

We define s to be hard if at least one of the two conditions holds true:

There are more consonants than vowels.
Some 3 consecutive letters are all consonants.
Limak decided to write a program to check whether pronouncing s will be hard or easy. He wrote the main part of the program. To work correctly, it requires an array of booleans isVowel of length n, indexed 0 through . So, Limak added the following code at the beginning:

string vowels = "aeiouy";

    for(int i = 0; i < n; i++) // indices 0, 1, ..., n-1
    for(int j = 0; j < 6; j++)
        if(s[i] == vowels[j])
            isVowel[i] = true;
Everything would work correctly but there is one issue. Before the code provided above, the array isVowel isn't cleared properly. Some previous parts of program (parts not related to this problem) used the array. Because of that, exactly k random cells of the array are already set to true. Other  cells are set to false. And then the code provided above may change some more cells to true.

Limak found the value of k. Also, he chose a string s of length n. There are  ways to choose k indices among  and say that those are initially set to true. Among those ways, for how many ways Limak's program would say that the given string s is hard to pronounce? Print the number of ways modulo .

# Input format

The first line contains two integers n and k denoting the length of the string and the number of cells already set to true in the array isVowel.

The second line contains one string s of length n denoting a string chosen by Limak. Each character in s is one of  lowercase English letters.

# Output format

Print the answer modulo .

Constraints

Subtasks

Extra 				constraints		Points		Which tests

20						1-4

30						5-10

no extra constraints	50			11-20

# sample input 

6 2

bbdxde

# sample output

8

# Explanation

In the sample test, exactly  cells are already set to true. For example, if two first cells are set to true (so, initially the array looks like 110000) then after processing the code provided in the statement, the array should be 110001 — cells set to true are isVowel[0], isVowel[1], isVowel[5]. The string would be hard to pronounce then, because there are 3 consecutive consonants.

There are 8 ways to choose the initial array isVowel with  cells set to true:

110000, described above

100010

100001

010001

001001

000110

000101

000011


# Problem 6 :

Today Tony Stark is upset with Jarvis, as it blew the whole plan of him defeating the Flash in parallel universe by showing him two images of Flash. Tony couldn't identify the real one and ended up getting hit hard. Jarvis is upset too and he wants to prove that it was not his mistake. Help Jarvis to prove himself faithful and true AI.


To prove, that Jarvis is not at fault, he is given N non-negative integers and he has to identify a lone integer among them. A lone integer is defined as an integer in the given array of integers that is left alone after pairing each of the other integers. Two integers can be paired if they have same value in decimal number system and have different indices in the array. (Look at example case for better understanding and it is guaranteed that there is at most one such integer.)


NOTE: An integer can't be paired with itself and once paired it can't be used to pair with other integers. (There are spaces after each input.)


# Input :

First line will contain T, number of times Jarvis tests itself. For each test there will be two lines. First line of each test will contain number of integers 
N he takes, and next line will have N non-negative integers.


# Output :

For each test output one lone integer or -1 if it doesn't exist.


# sample input

2

7

8 7 8 1 6 6 7

2

5 5

# sample output

1

-1

# Explanation

1 In the first test, 8, 7 and 6 can be paired with respected same valued decimal integers, while 1 is left alone.

2 In the second test, 5 can be paired with other 5 hence there is no lonely integer. So, the output will be 1.