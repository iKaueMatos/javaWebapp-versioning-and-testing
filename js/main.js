// mobile bar

const menu = document.getElementById("mobile-bar")
console.log(menu);
menu.addEventListener("click", () => {
    document.getElementById("menu").classList.toggle("active")
})

