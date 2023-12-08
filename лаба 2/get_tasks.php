<?php
$host = "localhost"; // Хост базы данных
$username = "root"; // Имя пользователя базы данных
$password = ""; // Пароль пользователя базы данных
$database = "test"; // Имя базы данных
$connection = mysqli_connect($host, $username, $password, $database);
if (!$connection) {
 die("Ошибка подключения: " . mysqli_connect_error());
}
$query = "SELECT * FROM tasks ORDER BY task_date ASC, task_time ASC"; // SQL-запрос для выбора задач из базы
$result = mysqli_query($connection, $query); // Выполнение SQL-запроса и получение результата
$tasks = array(); // Создание пустого массива для хранения задач
while ($row = mysqli_fetch_assoc($result)) {
 $tasks[] = $row; // Добавление каждой выбранной задачи в массив $tasks
}
echo json_encode($tasks); // Преобразование массива задач в формат JSON и вывод на экран
mysqli_close($connection); // Закрытие соединения с базой данных
?>