const buttons = document.querySelectorAll('button');
const divv = document.querySelector('#para');

// we use the .forEach method to iterate through each button
buttons.forEach((button) => {

  // and for each one we add a 'click' listener
  button.addEventListener('click', () => {
    button.textContent= `clicked`;
    button.style.color ="green";
    divv.textContent = `button no ${button.id} got clicked`;
  });
});


buttons.forEach((button) => {

    // and for each one we add a 'click' listener
    button.addEventListener('dblclick', () => {
      button.textContent= `dbclicked`;
      button.style.color ="blue";
      divv.textContent = `button no ${button.id} got double_clicked`;
    });
  });
  
