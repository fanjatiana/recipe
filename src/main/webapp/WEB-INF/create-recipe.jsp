<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: fandja
  Date: 27/04/2023
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
            crossorigin="anonymous"></script>
    <title>Mes recettes</title>
</head>
<body>

<header>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
            <a class="navbar-brand" href="${pageContext.request.contextPath}/userSession/my-recipes">MesRecettes</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/userSession/my-recipes">Accueil</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/userSession/create-recipe">Créer une recette</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/userSession/profile">Profil</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/userSession/logout">Deconnexion</a>
                    </li>
                </ul>
                <form class="d-flex" role="search">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Rechercher</button>
                </form>
            </div>
        </div>
    </nav>
    <h1>Gestion de ma liste de recettes</h1>
</header>
<main>
    <div class="container-fluid">
        <form method="post" action="${pageContext.request.contextPath}/userSession/create-recipe">
            <div class="input-group mb-3">
                <label for="recipeTitle">Titre</label>
                <input type="text" class="form-control" id="recipeTitle" name="recipeTitle" required>
            </div>

            <div class="input-group mb-3">
                <label for="description">Description</label>
                <input type="text" class="form-control" id="description" name="description" required>
            </div>
            <select class="form-select" aria-label="Categorie de la recette">
                <option name="category" value="1" selected>Entrée</option>
                <option name="category" value="2">Plat</option>
                <option name="category" value="3">Dessert</option>
            </select>
            <div class="input-group mb-3">
                <label for="description">Ajouter le lien de la recette </label>
                <input type="text" class="form-control" name="urlRecipe" required>
            </div>
            <div class="input-group mb-3">
                <label for="dateRecipe">Selectionner la  date d'aujourd'hui</label>
                <input type="date" class="form-control" id="dateRecipe" name="dateRecipe" required>
            </div>
            <div class="mb-3">
                <Label for="urlImage" class="contrôle-label"> Ajouter une image
                    <Input id="urlImage" name="urlImage" type="file" classe multiple="file-chargement" required>
                </Label>
            </div>
            <div class="input-group">
                <button type="submit" class="btn btn-outline-dark">Submit</button>
            </div>
        </form>
    </div>
</main>
<footer></footer>
</body>
</html>
