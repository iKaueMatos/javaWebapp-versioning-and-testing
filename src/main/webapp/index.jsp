<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <title>AGO - Agricutura org�nica</title>
    <!-- style -->
    <link rel="stylesheet" href="./dist/output.css">
    <link rel="stylesheet" href="style.css">
    <link rel="shortcut icon" href="./img/headerIcons/favicon.png" type="image/x-icon">
    <script src="https://cdn.tailwindcss.com"></script>
</head>

<body class="bg-white  min-h-screen">
    <!-- body -->
    <div class="container max-w-[1440px] mx-auto">
        <!-- navbar -->
        <div class="navbar bg-white  border-spacing-1 fixed w-full top-0 max-w-[1440px]">
            <div class="container flex justify-between items-center py-3 w-full max-w-[1440px] mx-auto px-[5%]">
                <div class="left">
                    <h1 class="font-bold text-lg"><a href="./index.jsp">Agricultura Org�nica</a></h1>
                </div>
                <!-- in laptops -->
                <div class="right md:flex gap-8 items-center hidden " >
                    <!-- menu -->
                    <div
                        class="item text-sm font-medium leading-3 cursor-pointer hover:text-green-600 duration-500 text-black">
                        <a href="#inicio">Inicio</a></div>
                    <div
                        class="item text-sm font-medium leading-3 cursor-pointer hover:text-green-600 duration-500 text-text-black">
                        <a href="#Desenvolvedores">Desenvolvedores</a></div>
                    <div
                        class="item text-sm font-medium leading-3 cursor-pointer hover:text-green-600 duration-500 text-text-black">
                        <a href="#Contato">Contato</a></div>
                    <!-- menu-btn -->
                    <div
                        class="item btn py-3 px-6 text-sm font-medium leading-3 rounded-md text-black cursor-pointer  duration-600 hover:text-green-600"> <a href="./form.jsp">Cadastre seus produtos</a>
                        </div>
                </div>
                <!-- in mobile phones -->
                <div id="mobile-bar" class="block md:hidden z-50 w-8 h-8">
                    <div class="line-full rounded-full my-2 h-1 bg-black"></div>
                    <div class="line-full rounded-full my-2 h-1 bg-black"></div>
                    <div class="line w-full rounded-full my-2 h-1 bg-black"></div>
                </div>
                <div id="menu"
                    class="fixed duration-700 w-full h-full top-0 bottom-0 right-[-100%] md w-full:md:w-1/2 bg-slate-800">
                    <div
                        class="item mx-auto text-center py-6 text-sm font-medium leading-3 cursor-pointer hover:text-green-600 duration-500 text-white">
                        Inicio</div>
                    <div
                        class="item mx-auto text-center py-6 text-sm font-medium leading-3 cursor-pointer hover:text-green-600 duration-500 text-[#fff]">
                        Desenvolvedores</div>
                    <div
                        class="item mx-auto text-center py-6 text-sm font-medium leading-3 cursor-pointer hover:text-green-600 duration-500 text-[#fff]">
                        Contato</div>
                    <!-- menu-btn -->
                    <div
                        class="item bg-green-600 mx-auto text-center w-40 btn py-3 px-6 text-sm font-medium leading-3 rounded-md text-black cursor-pointer  duration-500 hover:text-green-600">
                    <a href="./form.html">Cadastre seus produtos</a></div>
                </div>
            </div>
        </div>
        <!-- home__seccion -->
        <div class="container px-[5%] my-40 grid lg:grid-cols-2 grid-cols-1 justify-between items-center" id="inicio">
            <div class="left col-span-1 text-black">
                <h1 class="h1 mb-7">Agricultura Org�nica</h1>
                <p class=" mb-8">Lorem, ipsum dolor sit amet consectetur adipisicing elit. Minus eveniet voluptates sequi? Repellendus aliquam quam 
                    ex! Veritatis optio sapiente facilis deserunt maiores esse ratione adipisci magni minus, voluptatum voluptas totam!</p>
                <div class="btn__group flex gap-5">
                    <button class="join px-10 py-5 rounded-md text-base font-medium">
                        Saiba mas
                    </button>
                    <div class="watch flex items-center gap-2 cursor-pointer text-base font-medium">
                        <div class="img">
                            <img src="./img/watch.png" alt="">
                        </div>
                        <span>video</span>
                    </div>
                </div>
            </div>
            <div class="right col-span-1">
                <img src="./img/Agricultura.png" alt="">
            </div>
        </div>
        <!-- services -->
        <div class="services">
            <h1 class="text-4xl text-black font-bold text-center md:text-[42px]">
               Saiba mais sobre agricultura org�nica
            </h1>
            <p class="text-black text-center mt-[30px] mb-[40px] w-3/4 mx-auto">Lorem ipsum dolor sit amet consectetur adipisicing elit. Cum accusantium magni a doloribus officia doloremque, ducimus aliquam amet quis commodi. 
                Nemo molestiae distinctio nisi asperiores accusantium perspiciatis pariatur dolore non!</p>
            <div class="cards flex justify-center gap-x-7 gap-y-10 flex-wrap text-black text-center">
                <div class="card w-[370px] px-6 py-9">
                    <img class="pb-5 mx-auto" src="./img/servise-icon.png" alt="">
                    <h2 class="text-2xl font-medium pb-4">Sub-Topicos</h2>
                    <p class="text-base pb-6">Lorem ipsum dolor sit amet, consectetur the adipiscing elit. Sed quis
                        accumsan nisi Ut ut felis
                        congue nisl hendrerit commodo.</p>
                    <button><a class="no-underline text-black hover:underline hover:text-green-500 duration-500"
                            href="#">veja mais</a></button>
                </div>
                <div class="card w-[370px] px-6 py-9">
                    <img class="pb-5 mx-auto" src="./img/servise-icon2.png" alt="">
                    <h2 class="text-2xl font-medium pb-4">Sub-Topicos</h2>
                    <p class="text-base pb-6">Lorem ipsum dolor sit amet, consectetur the adipiscing elit. Sed quis
                        accumsan nisi Ut ut felis
                        congue nisl hendrerit commodo.</p>
                    <button><a class="no-underline text-black hover:underline hover:text-green-500 duration-500"
                            href="#">veja mais</a></button>
                </div>
                <div class="card w-[370px] px-6 py-9">
                    <img class="pb-5 mx-auto" src="./img/servise-icon3.png" alt="">
                    <h2 class="text-2xl font-medium pb-4">Sub-Topicos</h2>
                    <p class="text-base pb-6">Lorem ipsum dolor sit amet, consectetur the adipiscing elit. Sed quis
                        accumsan nisi Ut ut felis
                        congue nisl hendrerit commodo.</p>
                    <button><a class="no-underline text-black hover:underline hover:text-green-500 duration-500"
                            href="#">Veja mais</a></button>
                </div>
                <div class="card w-[370px] px-6 py-9">
                    <img class="pb-5 mx-auto" src="./img/servise-icon4.png" alt="">
                    <h2 class="text-2xl font-medium pb-4">Sub-Topicos</h2>
                    <p class="text-base pb-6">Lorem ipsum dolor sit amet, consectetur the adipiscing elit. Sed quis
                        accumsan nisi Ut ut felis
                        congue nisl hendrerit commodo.</p>
                    <button><a class="no-underline text-black hover:underline hover:text-green-500 duration-500"
                            href="#">veja mais</a></button>
                </div>
                <div class="card w-[370px] px-6 py-9">
                    <img class="pb-5 mx-auto" src="./img/servise-icon5.png" alt="">
                    <h2 class="text-2xl font-medium pb-4">Sub-Topicos</h2>
                    <p class="text-base pb-6">Lorem ipsum dolor sit amet, consectetur the adipiscing elit. Sed quis
                        accumsan nisi Ut ut felis
                        congue nisl hendrerit commodo.</p>
                    <button><a class="no-underline text-black hover:underline hover:text-green-500 duration-500"
                            href="#">veja mais</a></button>
                </div>
                <div class="card w-[370px] px-6 py-9">
                    <img class="pb-5 mx-auto" src="./img/servise-icon6.png" alt="">
                    <h2 class="text-2xl font-medium pb-4">Sub-Topicos</h2>
                    <p class="text-base pb-6">Lorem ipsum dolor sit amet, consectetur the adipiscing elit. Sed quis
                        accumsan nisi Ut ut felis
                        congue nisl hendrerit commodo.</p>
                    <button><a class="no-underline text-black hover:underline hover:text-green-500 duration-500"
                            href="#">veja mais</a></button>
                </div>
            </div>
        </div>
        <!-- description__part__1 -->
        <div class="description1 grid grid-cols-1 my-40 items-center lg:grid-cols-2 justify-evenly gap-10 px-[5%]">
            <div class="left col-span-1 justify-self-center">
                <img src="./img/AgriculturaOrganica22.png" alt="">
            </div>
            <div class="right col-span-1 text-black">
                <h2 class="font-bold text-4xl  leading-[52px] lg:text-[42px]">Tema</h2>
                <p class="font-normal my-8 text-base">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis at
                    dictum risus, non suscipit arcu.
                    Quisque aliquam posuere tortor, sit amet convallis nuncoe scelerisque in. orem ipsum dolor sit amet,
                    consectetur adipisicing elit. Labore eius molestiae facere, natus reprehenderit eaque eum, autem
                    ipsam. Magfini, error. Tempora odit laborum iure inventore possimus laboriosam qui nam. </p>
                <button class="btn py-2 px-[14px] rounded">Saiba mais</button>
            </div>
        </div>
        <!-- description__part__2 -->
        <div class="description2 grid grid-cols-1 my-40 items-center lg:grid-cols-2 justify-evenly gap-10 px-[5%]">
            <div class="left col-span-1 text-black">
                <h2 class="font-bold text-4xl  leading-[52px] lg:text-[42px]">Tema</h2>
                <p class="font-normal my-8 text-base">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis at
                    dictum risus, non suscipit arcu.
                    Quisque aliquam posuere tortor, sit amet convallis nuncoe scelerisque in. orem ipsum dolor sit amet,
                    consectetur adipisicing elit. Labore eius molestiae facere, natus reprehenderit eaque eum, autem
                    ipsam. Magfini, error. Tempora odit laborum iure inventore possimus laboriosam qui nam. </p>
                <button class="btn py-2 px-[14px] rounded">Saiba mais</button>
            </div>
            <div class="right col-span-1 justify-self-center">
                <img src="./img/Agricultor-.png" alt="">
            </div>
        </div>




        <!-- Time  Developers-->
        <div class="team text-center my-40">
            <h1 class="text-4xl text-black font-bold leading-[55px] lg:text-[42px]" id="Desenvolvedores">Desenvolvedores</h1>
            <p class="my-8 text-black w-2/3 lg:w-1/3 mx-auto">Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                Sed quis
                accumsan nisi Ut ut felis congue nisl hendrerit commodo.</p>
            <div class="cards flex justify-center gap-10 flex-wrap">
                <div class="card w-[270px] py-8 px-14 text-black text-center">
                    <img class="mx-auto -mb-[15px] rounded h-40" src="./img/ellen1.jpeg" alt="">
                    <h2 class="text-[25px] font-medium leading-9 mb-[7px] mt-6">Ellen Fontes</h2>
                    <p class="font-normal leading-5 uppercase">Cursando Ci�ncias da computa��o  </p>
                    <div class="icons flex mt-[10px] justify-center gap-2">
                        <a href="https://www.linkedin.com/in/ellen-fontes-617b21205/"><img src="./img/in.png"   alt="" class="icon cursor-pointer"></a>
                    </div>
                </div>
                <div class="card w-[270px] py-8 px-14 text-black text-center">
                    <img class="mx-auto -mb-[15px] rounded h-40 w-50" src="./img/igor.jpeg" alt="">
                    <h2 class="text-[25px] font-medium leading-9 mb-[7px] mt-6">Igor Augusto</h2>
                    <p class="font-normal leading-5 uppercase">Cursando Ci�ncias da computa��o </p>
                    <div class="icons flex mt-[10px] justify-center gap-2">
                        <a href="https://www.linkedin.com/in/igorbrz/"><img src="./img/in.png"   alt="" class="icon cursor-pointer"></a>
                    </div>
                </div>
                <div class="card w-[270px] py-8 px-14 text-black text-center">
                    <img class="mx-auto -mb-[15px] rounded h-40" src="./img/kaue.jpg" alt="Kaue de matos">
                    <h2 class="text-[25px] font-medium leading-9 mb-[7px] mt-6">Kau� Matos</h2>
                    <p class="font-normal leading-5 uppercase">Cursando Ci�ncias da computa��o  </p>
                    <div class="icons flex mt-[10px] justify-center gap-2">
                        <a href="https://www.linkedin.com/in/kau%C3%AA-matos-oliveira-a76410213/"><img src="./img/in.png"   alt="" class="icon cursor-pointer"></a>
                    </div>
                </div>
                <div class="card w-[270px] py-8 px-14 text-black text-center">
                    <img class="mx-auto -mb-[15px] rounded h-40 w-50" src="./img/gustavo.jpeg"  alt="Igor augusto">
                    <h2 class="text-[25px] font-medium leading-9 mb-[7px] mt-6">Gustavo Pacheco</h2>
                    <p class="font-normal leading-5 uppercase">Cursando Ci�ncias da computa��o </p>
                    <div class="icons flex mt-[10px] justify-center gap-2">
                        <a href="https://www.linkedin.com/in/gusta9s/"><img src="./img/in.png"   alt="" class="icon cursor-pointer"></a>
                    </div>
                </div>
                <div class="card w-[270px] py-8 px-14 text-black text-center">
                    <img class="mx-auto -mb-[15px] rounded" src="./img/pedro.jpeg" alt="Pedro">
                    <h2 class="text-[25px] font-medium leading-9 mb-[7px] mt-6">Pedro Prado</h2>
                    <p class="font-normal leading-5 uppercase">Cursando Ci�ncias da computa��o  </p>
                    <div class="icons flex mt-[10px] justify-center gap-2">
                        <a href="https://www.linkedin.com/in/phpprado/"><img src="./img/in.png"   alt="" class="icon cursor-pointer"></a>
                    </div>
                </div>
            </div>
        </div>
        <!-- contact__form -->
        <div class="contact text-center my-10 mx-[5%]" id="Contato">
            <div
                class="container px-[5%] mx-auto flex flex-col max-w-[1170px] w-full justify-center items-center text-black">
                <form method="Post" action="mailto:programmerdeveloper@gmail.com">
                <h1 class="lg:texr-[42px] text-3xl font-bold mt-[50px] mb-3">Increva-se para receber mais informa��es</h1>
                <p class="text-base text-center">Fique por dentro das nossas novidades academicas</p>
                <div class="input mt-[30px] flex justify-between mb-10 max-w-[860px] w-[100%] p-[10px]">
                    <input class="border-none py-[15px] px-[34px] bg-[#0000] outline-none" type="text"
                        placeholder="Digite seu Email">
                    <button class="btn flex items-center gap-3 py-[15px] pl-[26px] pr-[49px] rounded-[70px] opacity-90">
                        <img src="./img/send.png" alt="Enviar">
                        Enviar
                    </button>
                </form>
                </div>
            </div>
        </div>
        <!--Footer-->
        <footer>
            <div class="line w-full h-[1px] absolute left-0 opacity-20 md-[6px] bg-[#000]"></div>       
            <div class="bottom flex justify-center gap-5 md:justify-between flex-wrap px-[5%] py-[26px]">
            <div class="left">
                    � 2023 Agricultura org�nica. - Todos os direitos reservados.
            </div> 
        </footer>
            <!--The end footer-->
    <!-- javascript -->
    <script src="./main.js"></script>
    </body>
</html>