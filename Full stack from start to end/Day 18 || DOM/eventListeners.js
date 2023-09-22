const btn = document.querySelector('.btn');


btn.onclick = () => btn.textContent="clicked";



// btn.addEventListener ('click',()=>{
//     btn.style.backgroundColor = "aqua";
//     btn.textContent ="clicked";
//     btn.style.color = "purple"

// });


function alertFunction() {
    
    
    btn.style.backgroundColor = "aqua";
    btn.textContent ="clicked";
    btn.style.color = "purple"
    alert("HEllo ")
  }

btn.addEventListener('click',alertFunction);

btn.addEventListener('click', function (e) {
    console.log("hello");
  });