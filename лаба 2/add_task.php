<?php
$host = "localhost"; // Хост базы данных
$username = "root"; // Имя пользователя базы данных
$password = ""; // Пароль пользователя базы данных
$database = "test"; // Имя базы данных
$connection = mysqli_connect($host, $username, $password, $database); // Устанавливаем соединение с базой данных
if (!$connection) { // Если соединение не удалось
 die("Ошибка подключения: " . mysqli_connect_error()); // Выводим сообщение об ошибке и завершаем выполнение
}
if (
 isset($_POST['task']) && !empty($_POST['task']) && // Проверяем, была ли отправлена форма и поля 'task'...
 isset($_POST['task_date']) && !empty($_POST['task_date']) && // ...'task_date'...
 isset($_POST['task_time']) && !empty($_POST['task_time']) && // ...'task_time'...
 isset($_POST['priority']) && !empty($_POST['priority']) // ...и 'priority' содержат данные
) {
 $task = mysqli_real_escape_string($connection, $_POST['task']); // Защищаем данные от SQL-инъекций
 $task_date = mysqli_real_escape_string($connection, $_POST['task_date']); // Защищаем данные от SQL-инъекций
 $task_time = mysqli_real_escape_string($connection, $_POST['task_time']); // Защищаем данные от SQL-инъекций
 $priority = mysqli_real_escape_string($connection, $_POST['priority']); // Защищаем данные от SQL-инъекций
 // Создаем SQL-запрос для вставки новой задачи в базу данных
 $query = "INSERT INTO tasks (task, task_date, task_time, priority) VALUES ('$task', '$task_date', '$task_time', '$priority')";

 // Выполняем SQL-запрос
 $result = mysqli_query($connection, $query);
 if ($result) { // Если запрос выполнился успешно
 header("Location: index.php"); // Перенаправляем пользователя на главную страницу
 } else { // Если запрос не выполнен успешно
 echo "Ошибка при добавлении задачи"; // Выводим сообщение об ошибке
 }
}
mysqli_close($connection); // Закрываем соединение с базой данных
?>