// Use the for loop to output even numbers from 2 to 10.


for (let i = 2; i < 10; i++) {
    if(i%2==0){
        console.log(`${i}`);
    }
    
}


/* Write a loop which prompts for a number greater than 100. If the visitor enters another number – ask them to input again.
 the loop must ask for a number until either the visitor enters a number greater 
than 100 or cancels the input/enters an empty line.
 Here we can assume that the visitor only inputs numbers. There’s no need to implement a special handling 
for a non-numeric input in this task. */

// let number = 1;
// while(number){
//     number=  prompt("Enter number greater than 100");
//     if(number>100){
//         break;
//     }
// }





function checkPrime(number){
    for(let j =2 ; j<number; j++){
        if(number==2){
            return true;
        }
        if(number%j==0){
            return false;
        }
    }
    return true;
}

function outputPrime(n){
    for(let j =2 ; j<n; j++){
        if(checkPrime(j)){
            console.log(j);
        }
    }
    
}

console.log(outputPrime(50));