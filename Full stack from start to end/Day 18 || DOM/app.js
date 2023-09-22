const container = document.querySelector('#container');
// selects the #container div (don't worry about the syntax, we'll get there)

const content = document.createElement('div');
content.classList.add('content');
content.textContent = 'This is the glorious';

container.appendChild(content);




const para = document.createElement('p');
para.classList.add('para');
para.textContent= "Hey i am red "
para.style.color="red";

para.style.backgroundColor = "grey";
para.style.display="inline-block";

container.appendChild(para);


// an <h3> with blue text that says “I’m a blue h3!”

const heading3 = document.createElement('h3');
heading3.classList.add('heading3');
heading3.textContent ="I am a blue H3";
heading3.style.color ="blue";
container.appendChild(heading3);

// container.removeChild(para);  


heading3.style.cssText ='color:green; margin:30px;';


// a <div> with a black border and pink background color with the following elements inside of it:
// another <h1> that says “I’m in a div”
// a <p> that says “ME TOO!”
// Hint for this one: after creating the <div> with createElement, append the <h1> and <p> to it before adding it to the container.

const divBlack  = document.createElement('div');
divBlack.classList.add('divBlack');
divBlack.style.cssText = 'border: 5px solid black ; padding:50px; margin:50px; background-color:pink; width:300px; ';

const heading1 = document.createElement('h1');
heading1.classList.add('heading1');
heading1.textContent= "I am in a div ";

const para1 = document.createElement('p');
para1.classList.add('para1');
para1.textContent= "and me too";

divBlack.appendChild(heading1);
divBlack.appendChild(para1);
container.appendChild(divBlack);



container.setAttribute('id', 'theDiv');  
container.removeAttribute('id');   

para1.innerHTML= '<button > press  </button>';
                                                        //  Event Listener/



const button1 = document.createElement('button');
button1.textContent = "press me again";
divBlack.appendChild(button1);
button1.onclick = () => alert("fuck of ");

button1.addEventListener('click', () => {
    button1.textContent = "clicked"
    button1.style.color="pink";
  });

button1.addEventListener('click', ()=>{
    alert("this iss goooddd");
    const A = prompt("What's your name");
    alert(A);
});