<?php
$host = "localhost"; // Хост базы данных
$username = "root"; // Имя пользователя базы данных
$password = ""; // Пароль пользователя базы данных
$database = "test"; // Имя базы данных
$connection = mysqli_connect($host, $username, $password, $database);
if (!$connection) {
 die("Ошибка подключения: " . mysqli_connect_error());
}
if (isset($_GET['id'])) {
 $id = mysqli_real_escape_string($connection, $_GET['id']);

 $query = "DELETE FROM tasks WHERE id = '$id'";
 $result = mysqli_query($connection, $query);
 if ($result) {
 // Успешное удаление задачи
24
 } else {
 // Ошибка при удалении задачи
 }
}
mysqli_close($connection);
?>