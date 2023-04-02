<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <link rel="shortcut icon" href="assents/Logo/logoFavicon.png" type="image/x-icon">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="scss/main.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulário</title>
</head>

<body>
    <nav class="navbar navbar-light bg-light bg-transparent fixed-top">
        <div class="container-fluid">
            <a class="navbar-brand" href="./index.jsp">
                <span class="fw-bold fst-italic text-dark">Agricultura
            </span>
                <span class="text-success fw-bold fst-italic">
                 orgânica
             </span>
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar" aria-controls="offcanvasNavbar">
            <span class="navbar-toggler-icon"></span>
          </button>
            <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasNavbar" aria-labelledby="offcanvasNavbarLabel">
                <div class="offcanvas-header">
                    <h5 class="offcanvas-title" id="offcanvasNavbarLabel">Voltar</h5>
                    <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                </div>
                <div class="offcanvas-body p-4">
                    <ul class="navbar-nav justify-content-end flex-grow-1 pe-3 ">
                        <li class="nav-item">
                            <a class="nav-link active text-light" aria-current="page" href="./index.jsp">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-light" href="./developers.jsp">Desenvolvedores</a>
                        </li>
                </div>
            </div>
        </div>
    </nav>

    <!--Formulario container -->
    <div class="container formulario mt-5 p-4 col-10 col-sm-9 col-md-7 col-lg-5 col-xl-4 col-xxl-3 " data-anime="left ">
        <div class="row ">
            <div class="text-center ">
                <h3 class="text-light" style="font-weight: bold; " style="font-size: 12px; ">Adicione seus dados</h3>
            </div>
            <!--Form-->
            <div class="col-12 col-xs-6 col-sm-12 ">
                <div class="row ">
                    <form class="g-4 col-xs-6 d-flex justify-content-center " class="form " method="post ">
                        <div class=" col-mb-3 ">
                            <label for="formControltextInput " class="form-label text-light" style="font-size: 18px; font-weight: 700; ">Texto</label>
                            <input type="text " class="form-control p-4 " placeholder="Digite seu texto " style="height: 50px; border:0px; width: 250px; " />
                        </div>
                </div>
                <div class="row ">
                    <div class="col-xs-6 d-flex justify-content-center ">
                        <div class="col-mb-3 ">
                            <label for="formControltextInput " class="form-label text-light" style="font-size: 18px; font-weight: 700; ">Texto</label>
                            <input type="text " class="form-control p-4 " placeholder="Digite seu texto " style="height: 50px; border: 0px; width: 250px; " />
                        </div>
                    </div>
                </div>
                <div class="row ">
                    <div class="col-xs-6 d-flex justify-content-center ">
                        <div class=" col-mb-3 ">
                            <label for="formControltextInput " class="form-label text-light" style="font-size: 18px; font-weight: 700; ">Texto</label>
                            <input type="text " class="form-control p-4 " placeholder="Digite seu texto " style="height:50px; border:0px; width: 250px; " />
                        </div>
                    </div>
                </div>
                <div class="row mt-4">
                    <div class="col button-move d-flex justify-content-center ">
                        <button type="button" class="btn btn-light text-success button " style="font-size: 18px; font-weight: 700; ">Enviar</button>
                    </div>
                </div>
            </div>
        </div>
        </form>
    </div>
    </div>
    </div>


    <style>
        footer {
            position: absolute;
            bottom: 0;
        }
    </style>
    <!---Footer-->
    <footer class="text-center text-white mt-4 footer-color ">
        <div class="container-fluid">
            <!-- Grid container -->
            <div class="container pb-0 ">
                <!-- Section: Form -->
                <section class=" ">
                    <form action=" " method="post ">
                        <!--Grid row-->
                        <div class="row d-flex justify-content-center ">
                            <!--Grid column-->
                            <div class="col col-12 col-xl-12 ">
                                <p style="font-weight: bold; ">
                                    Quer ficar por dentro das novidades?
                                </p>
                            </div>
                            <div class="col-md-5 col-12 ">
                                <!-- Email input -->
                                <div class="form-outline form-white mb-4 ">
                                    <input type="email " id="form " class="form-control " placeholder="Digite seu E-mail " />
                                    <label class="form-label " for="form " style="font-weight: bold; ">Receba mais informações sobre nosso site</label>
                                </div>
                            </div>
                            <div class="col-auto ">
                                <!-- Submit button -->
                                <button type="submit " class="btn btn-outline-dark mb-4 text-light button ">
                                            Enviar
                                    </button>
                            </div>
                        </div>
                    </form>
                </section>
            </div>

            <!-- Copyright -->
            <div class=" container-fluid text-center p-3 " style="background-color: rgba(0, 0, 0, 0.2); ">
                © 2023 Copyright
            </div>
        </div>
        <!-- Copyright -->
    </footer>

    <script src="js/script.js "></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js " integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN " crossorigin="anonymous "></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js " integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3 " crossorigin="anonymous "></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js " integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD " crossorigin="anonymous "></script>
</body>

</html>
