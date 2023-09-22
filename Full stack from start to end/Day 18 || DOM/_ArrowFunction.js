const name =  (name) => `Entered name is ${name}`;
console.log(name("Ashi"));

const multiply = (a,b) => a*b;

console.log(multiply(2,54));




let sayHi = () => console.log("Hello!");
sayHi();




let age = prompt("What is your age?", 18);
let welcome = (age < 18) ? () => alert('you are underage ') : () => alert("proceed");

welcome();





let sum = (a,b) =>{
    return alert(a*b);
};
let a = parseInt(prompt("enter a "));
let b = parseInt(prompt("enter b "));

sum(a,b);


