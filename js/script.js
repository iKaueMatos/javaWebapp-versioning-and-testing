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