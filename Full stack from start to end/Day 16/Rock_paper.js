console.log("Hello boys");

// Your game is going to play against the computer, so begin with a function called getComputerChoice 
// that will randomly return either ‘Rock’, ‘Paper’ or ‘Scissors’. We’ll use this function in the game 
// to make the computer’s play
// . Tip: use the console to make sure this is returning the expected output before moving to the next step!

function getComputerChoice(){
    A=  Math.floor(Math.random() * 3);
    if (A==0) {
        return "rock";
    }
    if(A==1){
        return "paper";
    }
    if(A==2){
        return "scissor"
    }
}

// Write a function that plays a single round of Rock Paper Scissors. The function should take two parameters 
// - the playerSelection and computerSelection - and then return a string that declares the winner of the round like
// so: "You Lose! Paper beats Rock"
// Make your function’s playerSelection parameter case-insensitive (so users can input rock, ROCK, RocK or any other variation).



function singleRound(playerSelection,computerSelection){
    playerSelection = playerSelection.toLowerCase();
    if(playerSelection==computerSelection) return "it's a draw ";
    else if (playerSelection=="rock") {
        if(computerSelection=="scissor") return `you won your opponent chose ${computerSelection}`;
        else return  `you lose your opponent chose ${computerSelection}`;
    }
    else if (playerSelection=="scissor") {
        if(computerSelection=="paper") return `you won your opponent chose ${computerSelection}`;
        else return  `you lose your opponent chose ${computerSelection}`;
    }
    else  {
        if(computerSelection=="scissor") return `you lose your opponent chose ${computerSelection}`;
        else return  `you won your opponent chose ${computerSelection}`;
    }
}

alert(singleRound("rOck",getComputerChoice()));



// Write a NEW function called game(). 
// Use the previous function inside of this one to play a 5 round game that keeps score and reports a winner or loser at the end.
// You have not officially learned how to “loop” over code to repeat function calls… 
// if you already know about loops from somewhere else (or if you feel like doing some more learning) 
// feel free to use them. If not, don’t worry! Just call your playRound function 5 times in a row. Loops are covered in the next lesson.
// At this point you should be using console.log() to display the results of each round and the winner at the end.
// Use prompt() to get input from the user. Read the docs here if you need to.
// Feel free to re-work your previous functions if you need to. Specifically,
//  you might want to change the return value to something more useful.
// Feel free to create more “helper” functions if you think it would be useful.

alert("Best out of 5 will win");
let count=0;

while(count<5){
    let user = prompt("Rock paper or scissor");
    alert(singleRound(user,getComputerChoice()));
    count++; 
}