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


