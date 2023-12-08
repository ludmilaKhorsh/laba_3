<!DOCTYPE html>
<html lang="en">
<head>
 <meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <title>Простой планировщик</title>
 <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
 <h1>Простой планировщик</h1>
 <div id="app">
 <form action="add_task.php" method="post">
 <input type="text" name="task" placeholder="Добавить задачу" required>
 <input type="date" name="task_date" required>
 <input type="time" name="task_time" required>
 <select name="priority" required>
 <option value="low">Низкая важность (low)</option>
 <option value="medium">Средняя важность (medium)</option>
 <option value="high">Высокая важность (high)</option>
 </select>
 <button type="submit">Добавить</button>
 </form>
 <!-- Список задач -->
 <ul id="task-list">
 <!-- Здесь будут отображаться задачи -->
 </ul>

 </div>
 <!-- Подключение JavaScript -->
 <script src="js/script.js"></script>
</body>
</html>