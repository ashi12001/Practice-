function capitalize(string){
    let A = string.charAt(0);
    let C = A.toUpperCase();
    let B = string.replace(A,C);
    console.log(B);
}
console.log(capitalize("makari"));


function lastletter(string){
    let stringLength =string.length;
    let lastL=  string[stringLength-1];
    console.log(`last letter of ${string} is ${lastL}`);
}

console.log(lastletter("AshishGurjar is a chad will going to be a first millionaire from his family"));