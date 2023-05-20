# Recursion 

##  *Recursion basics*


>Recursion is used in graph , trees and Dp  ,  Things which we can do with loop can be performed Recursively Too 


* **Recursion can be beneficial in some scenerios and same goes for loops too** 

* function calling itself is recursion   <br/>
    Example -  factorial  of n =  n * factorial of n-1
    * factorial of n-1 =  n-1 * factorial of n-2  <br/><br/>
* f[5] = 5 * f[4] -> 4 * f[3]-> 3 * f[2]-> 2 * f[1]  -> f[1]* f[0]

* Here a question is divided into sub problems

### Questions to make your concepts clear

- [ ] When recursion is used ?
- [ ] why recursion is used ?
- [ ] How  recursion is used ?


** Recursion continues till its reach it's base case **  <br/>

* First we go inside recursive function till it's reach it's base case 
 
**let's take a example of 5 factorial first we go inside 4 factorial then 3 then 2 then 1  in base condition we will get factorial of zero which is 1 Now it will give all the values back  while backtracking**  <br/> 

## How main function calls  another function

* First main function calls a function then that fucntion call itself until it reaches the base condition
