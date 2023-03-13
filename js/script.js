//Animação scroll ao rolar
const target = document.querySelectorAll('[data-anime]');
const animationClass = 'animate';

function animeScroll() {
    const windowTop = window.pageYOffset + ((window.innerHeight * 3) / 4);
    target.forEach((element) => {
        if ((windowTop) > element.offsetTop) {
            element.classList.add(animationClass);
        } else {
            //escondendo
            element.classList.remove(animationClass);
        }
    })
}
animeScroll();
if (target.length) {
    window.addEventListener('scroll', function() {
        animeScroll();
    }, 600)
}


//Efeito maquina de escrever!


function toWrite(elemento) {
    const textoArray = elemento.innerHTML.split('');

    elemento.innerHTML = '';
    textoArray.forEach((letra, i) => {
        setTimeout(() => {
            elemento.innerHTML += letra;
        }, 85 * i); // 75 milisegundos
    });
}

const title = document.querySelector('.title');
const paragraph = document.querySelector('.paragraph');
const paragraph2 = document.querySelector('.paragraph2');
const title2 = document.querySelector('.title2');
toWrite(title);
toWrite(paragraph);
toWrite(paragraph2);
toWrite(title2);