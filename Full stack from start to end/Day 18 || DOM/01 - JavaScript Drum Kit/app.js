window.addEventListener('keydown',function(e){
   
    console.log(e.keyCode);
    const audio = document.querySelector(`audio[data-key="${e.keyCode}"]`);
    const key = document.querySelector(`.key[data-key="${e.keyCode}"]`);

    console.log(audio);
    if(!audio) return;
    audio.currentTime=0;
    audio.play();
    key.classList.add('playing');

    
    
    

});