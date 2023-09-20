const textbox = document.querySelector('#textbox');
const output = document.querySelector('#output');
const t2 = document.querySelector('p')


function logkey(event){
    
    t2.textContent= `You entered "${event.key}"`;
}

textbox.addEventListener("keydown", logkey);



