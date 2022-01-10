
# sort-o_GreyLeche

<p align="center">Grey Leche: Faiyaz Rafee, May Qiu, David Deng

SOTW: [Coldplay - True Love](https://www.youtube.com/watch?v=dQw4w9WgXcQ)

## bubbleSort

### <u>Best Case</u>

#### The best case is when the array is already sorted because **it performs 0 swaps** and only **n - 1 comparisons are made** where n is the number of elements in the array. 

<br>

[1, 1, 2, 3, 5, 8] &emsp; **Swaps**: 0 &ensp; **Comparisons**: 0<br>
[1, 1, 2, 3, **5**, **8**] &emsp; **Swaps**: 0 &ensp; **Comparisons**: 1<br> 
[1, 1, 2, **3**, **5**, 8] &emsp; **Swaps**: 0 &ensp; **Comparisons**: 2<br>
[1, 1, **2**, **3**, 5, 8] &emsp; **Swaps**: 0 &ensp; **Comparisons**: 3<br>
[1, **1**, **2**, 3, 5, 8] &emsp; **Swaps**: 0 &ensp; **Comparisons**: 4<br>
[1, **1**, **2**, 3, 5, 8] &emsp; **Swaps**: 0 &ensp; **Comparisons**: 5

No swaps were performed. Array is sorted and algorithm is ended.

<u>Time Complexity</u>: **O(n)** because it makes n - 1 comparisons. The highest exponent being 1, making the complexity O(n^1) or O(n).

### <u>Worst Case</u>

#### The worst case is when the array is strictly descending because it needs to make n passes, with n - 1 comparisons every pass, making a total of (n - 1) n / 2 comparisons in total.

<br>

[8, 5, 3, 2, 1, 0] &emsp; **Swaps**: 0 &ensp; **Comparisons**: 0<br>

<u>Pass 1</u>

[8, 5, 3, 2, **1**, **0**] &emsp; **Swaps**: 0 &ensp; **Comparisons**: 1<br>
[8, 5, 3, 2, **0**, **1**] &emsp; **Swaps**: 1 &ensp; **Comparisons**: 1<br>
[8, 5, 3, **2**, **0**, 1] &emsp; **Swaps**: 1 &ensp; **Comparisons**: 2<br>
[8, 5, 3, **0**, **2**, 1] &emsp; **Swaps**: 2 &ensp; **Comparisons**: 2<br>
[8, 5, **3**, **0**, 2, 1] &emsp; **Swaps**: 2 &ensp; **Comparisons**: 3<br>
[8, 5, **0**, **3**, 2, 1] &emsp; **Swaps**: 3 &ensp; **Comparisons**: 3<br>
[8, **5**, **0**, 3, 2, 1] &emsp; **Swaps**: 3 &ensp; **Comparisons**: 4<br>
[8, **0**, **5**, 3, 2, 1] &emsp; **Swaps**: 4 &ensp; **Comparisons**: 4<br>
[**8**, **0**, 5, 3, 2, 1] &emsp; **Swaps**: 4 &ensp; **Comparisons**: 5<br>
[**0**, **8**, 5, 3, 2, 1] &emsp; **Swaps**: 5 &ensp; **Comparisons**: 5

<u>Pass 2</u>

[<u>0</u>, 8, 5, 3, **2**, **1**] &emsp; **Swaps**: 5 &ensp; **Comparisons**: 6<br>
[<u>0</u>, 8, 5, 3, **1**, **2**] &emsp; **Swaps**: 6 &ensp; **Comparisons**: 6<br>
[<u>0</u>, 8, 5, **3**, **1**, 2] &emsp; **Swaps**: 6 &ensp; **Comparisons**: 7<br>
[<u>0</u>, 8, 5, **1**, **3**, 2] &emsp; **Swaps**: 7 &ensp; **Comparisons**: 7<br>
[<u>0</u>, 8, **5**, **1**, 3, 2] &emsp; **Swaps**: 7 &ensp; **Comparisons**: 8<br>
[<u>0</u>, 8, **1**, **5**, 3, 2] &emsp; **Swaps**: 8 &ensp; **Comparisons**: 8<br>
[<u>0</u>, **8**, **1**, 5, 3, 2] &emsp; **Swaps**: 8 &ensp; **Comparisons**: 9<br>
[<u>0</u>, **1**, **8**, 5, 3, 2] &emsp; **Swaps**: 9 &ensp; **Comparisons**: 9<br>

<u>Pass 3</u>

[<u>0, 1</u>, 8, 5, **3**, **2**] &emsp; **Swaps**: 9 &ensp; **Comparisons**: 10<br>
[<u>0, 1</u>, 8, 5, **2**, **3**] &emsp; **Swaps**: 10 &ensp; **Comparisons**: 10<br>
[<u>0, 1</u>, 8, **5**, **2**, 3] &emsp; **Swaps**: 10 &ensp; **Comparisons**: 11<br>
[<u>0, 1</u>, 8, **2**, **5**, 3] &emsp; **Swaps**: 11 &ensp; **Comparisons**: 11<br>
[<u>0, 1</u>, **8**, **2**, 5, 3] &emsp; **Swaps**: 11 &ensp; **Comparisons**: 12<br>
[<u>0, 1</u>, **2**, **8**, 5, 3] &emsp; **Swaps**: 12 &ensp; **Comparisons**: 12<br>

<u>Pass 4</u>

[<u>0, 1, 2</u>, 8, **5**, **3**] &emsp; **Swaps**: 12 &ensp; **Comparisons**: 13<br>
[<u>0, 1, 2</u>, 8, **3**, **5**] &emsp; **Swaps**: 13 &ensp; **Comparisons**: 13<br>
[<u>0, 1, 2</u>, **8**, **3**, 5] &emsp; **Swaps**: 13 &ensp; **Comparisons**: 14<br>
[<u>0, 1, 2</u>, **3**, **8**, 5] &emsp; **Swaps**: 14 &ensp; **Comparisons**: 14<br>

<u>Pass 5</u>

[<u>0, 1, 2, 3</u>, **8**, **5**] &emsp; **Swaps**: 14 &ensp; **Comparisons**: 15<br>
[<u>0, 1, 2, 3</u>, **5**, **8**] &emsp; **Swaps**: 15 &ensp; **Comparisons**: 15<br>

Algorithm done. Array is sorted.

<u>Time Complexity</u>: **O(n^2)** because it makes (n^2 - n) / 2 comparisons in total. The highest exponent is 2 making the complexity O(n^2).

## selectionSort

#### There is no best or worst case because it always n - pass comparisons per pass regardless if it is ordered. It performs (n^2 - n) / 2 comparisons in total.

<br>

Supposed Best Case: [1, 1, 2, 3, 5, 8] 

<u>Pass 1</u>

Maximum = 8 <br>
[1, 1, 2, 3, 5, <u>8</u>]

<u>Pass 2</u>

Maximum = 5 <br>
[1, 1, 2, 3, <u>5, 8</u>]

.<br>
.<br>
.<br>

Algorithm ends at n(n - 1) / 2 comparisons

<br>

Supposed Worst Case: [8, 5, 3, 2, 1, 0]

<u>Pass 1</u>

Maximum = 8 <br>
[**0**, 5, 3, 2, 1, **8**]

<u>Pass 2</u>

Maximum = 5 <br>
[0, **1**, 3, 2, **5**, <u>8</u>]

.<br>
.<br>
.<br>

Algorithm ends at n(n - 1) / 2 comparisons.

<u>Time Complexity</u>: Always **O(n^2)** since it always requires n(n - 1) / 2 comparisons to sort the array. The highest degree being a 2, hence the n^2.

## insertionSort
### <u>Best Case</u>
#### The best case is when the array is already sorted because it only needs to perform n - 1 comparisons before it realizes the array is already sorted.

[1, 1, 2, 3, 5, 8]

The `|` symbol represents the location of the partition.

<u>Pass 1</u>

[1, 1, 2, 3, |5, 8]

<u>Pass 2</u>

[1, 1, 2, |3, 5, 8]

<u>Pass 3</u>

[1, 1, |2, 3, 5, 8]

<u>Pass 4</u> 

[1, |1, 2, 3, 5, 8]

<u>Pass 5</u>

[|1, 1, 2, 3, 5, 8]

5 comparisons were performed as during each pass, the algorithm compared the new element to the first element after the partition. It found it to be less than so the pass decremented the partition (finishing the current pass).

<u>Time Complexity</u>: **O(n)** because it makes n - 1 comparisons in total. The highest exponent being 1, so the complexity is O(n^1) or O(n).

### <u>Worst Case</u>
#### The worst case is when the array is completely descending because it needs to perform pass comparisons each pass and n - 1 passes are performed. This can be expressed as (n^2 - n) / 2 comparisons.

[8, 5, 3, 2, 1, 0] 

<u>Pass 1</u>

[8, 5, 3, 2, |1, 0]<br>
[8, 5, 3, 2, |0, 1]

<u>Pass 2</u>

[8, 5, 3, |2, 0, 1]<br>
[8, 5, 3, |0, 2, 1]<br>
[8, 5, 3, |0, 1, 2]

<u>Pass 3</u>

[8, 5, |3, 0, 1, 2]<br>
[8, 5, |0, 3, 1, 2]<br>
[8, 5, |0, 1, 3, 2]<br>
[8, 5, |0, 1, 2, 3]

<u>Pass 4</u>

[8, |5, 0, 1, 2, 3]<br>
[8, |0, 5, 1, 2, 3]<br>
[8, |0, 1, 5, 2, 3]<br>
[8, |0, 1, 2, 5, 3]<br>
[8, |0, 1, 2, 3, 5]

<u>Pass 5</u>

[|8, 0, 1, 2, 3, 5]<br>
[|0, 8, 1, 2, 3, 5]<br>
[|0, 1, 8, 2, 3, 5]<br>
[|0, 1, 2, 8, 3, 5]<br>
[|0, 1, 2, 3, 8, 5]<br>
[|0, 1, 2, 3, 5, 8]


<u>Time Complexity</u>: **O(n^2)** since it performs n(n - 1) / 2 comparisons in total. The highest degree being 2 so the complexity is O(n^2).