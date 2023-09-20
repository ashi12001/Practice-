// const myNumber =Math.random();
// alert(Math.floor((myNumber*100)));



// function myFun(){
//     console.log("Hello")
//     for (let index = 0; index <  10 ; index++) {
//         console.log(index);
        
//     }
// }

// myFun();





// // Default  parameters 


// function hello(name="ashi"){
//     console.log(`Hello ${name}`)
// }
// hello("mani");
// hello("Dhani");







// // function without name || anonymous function

// (function () {
//     alert("hello")
    
// })





// function  squared(num) {
//     return num*num;    
// }
// console.log(squared(12));







// function favoriteAnimal(animal){
//     return animal + " is my favorite animal";
// }

// let A = prompt("Enter animal you like");
// console.log(favoriteAnimal(A));




// // Local variables and outer variables

// function showmessage(name) {
//     alert(`hello ${name}`)
//     let age = 20;
//     alert("you are 20")
    
// }
// let userName = prompt("Enter your name ")
// showmessage(userName);



// function add7(num){
//     return num+7;
// }
// function multiple(num,num1) {
//     return num*num1;
    
// }
// console.log(add7(1));
// console.log(multiple(2,6));




// const myText="I am a string";
// alert(myText);
// const newString=  myText.replace("string","sausage");
// alert(newString);




// const myArr= ["I","love", 10];
// for (let index = 0; index < myArr.length; index++) {
//     console.log(myArr[index]);
 
// }
// function fact(num){
//     if(num<0) return undefined;
//     if(num==0) return 1;
//     let x =1;
//     for (let i = 1; i<=num; i++) {
//         x=x*i;
        
//     }
//     return x;

// }






// let num = prompt("Enter number");
// alert(fact(num));


// function primee(num){
//     let prime= true;
//     for (let i = 2; i < num; i++) {
//         if(num%i==0){
//             return prime=false;

//         }
        
//     }
//     console.log(prime);
// }

// console.log(primee(9));






function favoriteAnimal(animal){
    return animal + " is my favorite animal";
}

console.log(favoriteAnimal("cat"));






// // -----------------------------------------Function Declaration--------------------------------------------

// function show(def="Ashi"){
//        alert(`HEllo ${def}`)
// }

// function showmessage(){
//     alert("Hello everyone");
// }

// show();
// showmessage();






// -----------------------------------------Local and outer Variables--------------------------------------------


function countTill100(num=10){
    let localVar="Hello i am js";            // can't access local variables outside
    for(let i =i ;i<=num;i++)
    {
        console.log(i);
    }

}

let user ="ash";

function userName() {
    console.log(`your name is ${user}`)
    
}
console.log(userName());