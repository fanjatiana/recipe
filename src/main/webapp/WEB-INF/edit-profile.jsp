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
  <title>Formulaire d'inscription</title>
</head>
<body>

<header>
  <nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
      <a class="navbar-brand" href="recipes">MesRecettes</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
              data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
              aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="recipes">Accueil</a>
          </li>
        </ul>
        <form class="d-flex" role="search">
          <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success" type="submit">Rechercher</button>
        </form>
      </div>
    </div>
  </nav>
  <h1>Formulaire d'inscription</h1>
</header>

<main>
  <div class="container-fluid">
    <form action="${pageContext.request.contextPath}/userSession/profile/edit-profile" method="post">
      <div class="mb-3">
        <label for="firstname" class="form-label">Firstname</label>
        <input type="text" class="form-control" id="firstname" name="firstname" required>
      </div>
      <div class="mb-3">
        <label for="lastname" class="form-label">Lastname</label>
        <input type="text" class="form-control" id="lastname" name="lastname" required>
      </div>
      <div class="mb-3">
        <Label for="uploadImage" class="contrôle-label"> Upload an Image
          <Input id="uploadImage" name="picture" type="file" classe multiple="file-chargement">
        </Label>
      </div>
      <div class="mb-3">
        <label for="email" class="form-label">Email</label>
        <input type="email" class="form-control" id="email" name="email" required>
      </div>

      <div class="mb-3">
        <label for="password" class="form-label">Password</label>
        <input type="password" class="form-control" id="password" name="password" required>
      </div>
      <button type="submit" class="btn btn-primary">Register</button>
    </form>
  </div>
</main>
<footer></footer>
</body>
</html>
