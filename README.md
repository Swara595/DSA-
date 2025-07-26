# Day 1: Search an element in an array
CodeChef Problem Link: https://www.codechef.com/practice/course/arrays/ARRAYS/problems/SEARCHINARR
## Approach/Logic:
First consider that the element is not present in the array.i.e. int flag=0
Traverse the array using the for loop and if any element matches with the one that we are searching for then update the value of flag to 1 and break
Outside the for loop if value of flag is 1 then print YES otherwise NO

# Day 2: Find maximum in an Array
CodeChef Problem Link: https://www.codechef.com/practice/course/arrays/ARRAYS/problems/UWCOI20A?tab=statement
## Approach/Logic: 
First consider the maximum element of the array to be the element present at the 0th index.i.e int max=arr[0]. Using for loop, traverse the array and if any element is greater than max, then assign the value of that element to max and outside the loop print its value.i.e.the value of max variable

# Day 3: Take discount or not
CodeChef Problem Link: https://www.codechef.com/practice/course/arrays/ARRAYS/problems/DISCOUNTT?tab=statement
## Approach/Logic: 
First find the total price of the items without coupon. Apply the discount on each item: If item price > Y → new price = price - Y . If item price ≤ Y → new price = 0. Add the coupon cost (X) to the total discounted cost. Compare: If discounted cost + X < original cost → print "COUPON", Else → print "NO COUPON"

# Day 4: Cost of Groceries
CodeChef Problem Link: https://www.codechef.com/practice/course/arrays/ARRAYS/problems/KITCHENCOST?tab=statement
## Approach/Logic:
For each test case, read the number of items n and freshness threshold x. Read two arrays: a[] → freshness values and b[] → corresponding costs. Loop through the arrays:
If a[i] >= x, add b[i] to total cost. Print the total cost for each test case.

# Day 5: Min to Max
CodeChef Problem Link: https://www.codechef.com/practice/course/arrays/ARRAYS/problems/OPMIN?tab=statement
## Approach/Logic:
For each test case:
Read the array size n and elements of array a[].
Find the minimum value M in the array.
Count how many elements are greater than M.
These are the elements that need to be changed to M to make M the maximum value.
Print the count (minimum number of operations) for each test case.

# Day 6: Running Comparison
CodeChef Problem Link: https://www.codechef.com/practice/course/arrays/ARRAYS/problems/RUNCOMPARE
## Approach/Logic:
The goal is to find the number of days where both Alice and Bob are happy with their running distances. For each day, with Alice running Ai meters and Bob running Bi meters.
Alice is happy if Bi≤2×Ai. Bob is happy if Ai≤2×Bi. We simply iterate through each day, check if both of these conditions are true, and increment a counter if they are. Finally, we print the total count for each test case.

# Day 7: Largest and second largest
CodeChef Problem Link: https://www.codechef.com/practice/course/arrays/ARRAYS/problems/LARGESECOND
## Approach/Logic:
Set `max` to the first array element and `smax` (second maximum) to `0`. Iterate through the array to find and store the largest element in `max`. Iterate through the array again. If an element is greater than `smax` and not equal to `max`, update `smax` with that element. This ensures `smax` is the second largest *distinct* value. The result is `max + smax`.

# Day 8: Difficulty Rating Order
CodeChef Problem Link: https://www.codechef.com/practice/course/arrays/ARRAYS/problems/RATINGINPRAC
## Approach/Logic:
Set `flag` to `1` (assuming "Yes"). Use a nested loop to compare every element `d[i]` with every subsequent element `d[j]` (where `j > i`). If `d[i] > d[j]` is found at any point, it means the order is decreasing. Set `flag = 0` and `break` out of the inner loop immediately. Print "Yes" if `flag` is `1`, otherwise print "No`.



