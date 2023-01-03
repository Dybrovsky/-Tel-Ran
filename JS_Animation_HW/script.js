const container = document.querySelector('.container');
const box = document.querySelector('#animation-box');
let size = container.offsetWidth - box.offsetWidth;

setInterval(move, 10);
let pos = 0;
let posTop = 0;
let posLeft = 0;
let iTop = 0;
let iLeft = 0;


function move() {
    // while (speed > 0) {
        let speed = 10;

        // let textColour = document.querySelector('#text');
        // textColour.innerHTML = '<p>Clicked!</p>';
        // textColour.classList.toggle('changed');
        box.style.left = posLeft + 'px';
        box.style.top = posTop + 'px';
        posLeft += iLeft;
        posTop += iTop;

        if (posLeft >= 0 && posLeft < size && posTop === 0) {
            iLeft = 1;
            iTop = 0;
        } else if
        (posLeft === size && posTop >= 0 && posTop < size) {
            iTop = 1;
            iLeft = 0;
        } else if (posTop === size && posLeft > 0) {
            iLeft = -1;
            iTop = 0;
        } else {
            iTop = -1;
            iLeft = 0;
        }
        // speed--;
    // }
}


//     if (pos >= 530){
//         clearInterval(interval)
//     } else{
//         pos++;
//         box.style.top = pos + 'px';
//         box.style.left = pos + 'px';
//         box.style.right = pos + 'px';
//     }
//
// }
