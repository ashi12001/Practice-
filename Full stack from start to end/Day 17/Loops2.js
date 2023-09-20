//It;s a Ecample of standard for loop

const results = document.querySelector("#results");


function calculate() {
  for (let i = 1; i <= 10; i++) {
    const newResult = `${12} x ${i} = ${12 * i}`;
    results.textContent += `${newResult}\n`;
  }
  results.textContent += "\nFinished!";
}

const calculateBtn = document.querySelector("#calculate");
const clearBtn = document.querySelector("#clear");

calculateBtn.addEventListener("click", calculate);
clearBtn.addEventListener("click", () => (results.textContent = ""));