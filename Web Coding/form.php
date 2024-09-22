<!DOCTYPE html>
<html>
<head>
  <title>segunda pagina</title>
</head>
<body>

<?php
  $nome = isset($_GET["nome"])?$_GET["nome"]:"nome não informado";
  $email = isset($_GET["email"])?$_GET["email"]:"email não informado";
  $sexo = isset($_GET["sexo"])?$_GET["sexo"]:"Sexo não informado";
  echo ("<h2>Nome: $nome</h2></br>");

  echo ("<h2>Email: $email</h2></br>");

  echo ("<h2>Sexo: $sexo</h2></br>");
?>
<h2> Sexo: <?php echo $sexo; ?> </h2>

</body>
</html>