let cars = ["Saab", " Volvo", " BMW"," Audi R8" ," porsche"];

cars.push("lambo");
let totalCars = cars.length;

text = "<ol>";

for(let i =0; i<totalCars; i++){
	text= text+ "<li>" + cars[i] + "</li>";
    }
text+="</ol>"

document.getElementById("totalcars").innerHTML = `Total cars are ${totalCars}`;
document.getElementById("listofcars").innerHTML = `All cars are listed below <hr> ${text}`;

cars.push("jaguar");