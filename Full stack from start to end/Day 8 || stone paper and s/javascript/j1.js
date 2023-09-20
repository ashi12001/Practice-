// let userNum= parseInt(prompt("Enter number")) 

// for (let index = 1; index <=userNum; index++) {
//     if(index%3==0&&index%5==0){
//         console.log("fizz-buzz")
         
//     }
//     else if(index%3==0){
//         console.log("fizz")
//     }
//     else if(index%5==0){
//         console.log("buzz")
//     }
   
//     else{
//         console.log(index); 

//     }
 
    
// }




// const a ="Hello";
// console.log(c);        // Uncaught ReferenceError: c is not defined
 

// ________________________Synatx error 





let play_again=true;

while(play_again){
    const option = parseInt(prompt("Rock paper or scissor Type 1,2,3"));
    const computer =  (Math.floor(Math.random()*3)+1);
    if(computer==1) alert("computer chose rock");
    else if(computer==2) alert("computer chose paper");
    else alert("computer chose rock");

    if(option==computer){
        alert("it's draw");
    }
    else if(option==1){
        if(computer==2){
            alert("you lose")
        }
        else{
            alert("you won")
        }
    }
    else if(option==2){
        if(computer==3){
            alert("you lose")
        }
        else{
            alert("you won")
        }
    }
    else{
        if(computer==1){
            alert("you lose")
        }
        else{
            alert("you won")
        }
    }
    let A = prompt("DO you wanna play again y or n");

    if(A=="n"){
        play_again=false;
    }





}


