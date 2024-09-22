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
?>

<h2> Nome: <?php echo $nome; ?> </h2>
<h2> E-mail: <?php echo $email; ?> </h2>
<h2> Sexo: <?php echo $sexo; ?> </h2>

</body>
</html>