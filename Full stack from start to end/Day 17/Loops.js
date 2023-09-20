function toUpper(String){
    return String.toUpperCase();
}

console.log("Hello world");

const cats = ["Leopard", "Serval", "Jaguar", "Tiger", "Caracal", "Lion"];
const upperCats = cats.map(toUpper);

console.log(upperCats);

// map iterate through array one by one whereas filter only return which one is true and 
//function we passs in filter is a boolean





function lCat(cat) {
    return cat.startsWith("L");
  }

const cat = ["Leopard", "Serval", "Jaguar", "Tiger", "Caracal", "Lion"];
  
const filtered = cat.filter(lCat);
  
console.log(filtered);




//concatenation

let favoriteCats = " My favourite cats are " ;

for ( i=0 ;i<cat.length ;i++ ){
    if(i==cat.length-1){
        favoriteCats +=".";
        
    }
    else{
        favoriteCats+=`${cat[i]} , `;
    }
    
}
console.log(favoriteCats+"\n");
console.log("\n\n\n")