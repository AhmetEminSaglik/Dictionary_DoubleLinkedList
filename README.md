# Dictionary_DoubleLinkedList

Hello guys.

<h4> QUESTION :</h4>  How can be get as soon as possible  meanings of words from dictionary.txt file when words are entered?

<h3> WHAT WE HAVE ?</h3> 
<b>dictionary.txt</b> file has 5721 lines with words with meanings. 
<br><br>

<h3> SOLUTION : </h3> 
3 ways may come to you your mind.
<br><br>
1-) May use Arrays accordingto maximum character but this will use maybe millions/billions times more than necessary memory.
For example "extraordinary" : [e][x][t][r][a][o][r][d][i][n][a][r][y]    --> let say there are 29 characters.  29^13 = 1.0260629e+19
But there are just 5721 words. 
<br><br>
2-) May use arraylist  but this is not a healty way for time. Because if we think the latest value is entered to search it takes so much times.
Let's say our computer run slowly. First word's meaning is found 1 second later. In this condition If we enter last index of this arraylist it will get 5721 seconds and that is about 95 minutes. It is really slow. And we should think that this file may be added new words in future.
<br><br>
3-) LinkedList is the best answer among these ways because the maximum time will be just word's character number. There will be a root Node and all words will be get by it.

<br><br>
<b>So  Third option is our solution.</b>


