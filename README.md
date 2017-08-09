# HackerRank: the challenge starts here!

# Customer service capacity
At Booking.com our customer service team is an important contributor to customer
satisfaction. During busy times, however, there might be more calls to customer
service than the number of customer service executives can manage. Fortunately, we
record data on that. We've collected information about all phone calls to our call
centres for the past year.
Given that our current number of customer care agents is X. Determine how many
more people we would need to hire, to make sure that our customers would not have
to wait during peak hours (i.e. that we don't have more phone calls than we have
customer service executives).
Input:
The first line contains the current number of customer service executives X.
The second line contains an integer N, which is the number of data points in the data
set.
The next N lines are whitespace-separated pairs of timestamps (a timestamp is an
integer that represents seconds since the epoch). On each line, the first time is the
time when the call was started, and the second one is when that call ended.
Output:
A single integer, representing the number of additional customer service executives
that we would need to employ, to cover the call volume during peak times. If the
current coverage is already sufficient, then print 0.

Sample input:
1
3
1481122000 1481122020
1481122000 1481122040
1481122030 1481122035
Sample output:
1

Explanation:
The first call overlaps with the second call. The third call also overlaps with the second
call. However, the first and the third call are not overlapping with each other. 
