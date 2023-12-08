// Функция deleteTask принимает идентификатор задачи (taskId) для удаления
function deleteTask(taskId) {
    if (confirm("Вы уверены, что хотите удалить эту задачу?")) {
    // При подтверждении удаления задачи
    fetch(`delete_task.php?id=${taskId}`, {
    method: 'GET'
    })
    .then(() => {
    window.location.reload(); // Перезагрузка страницы после успешного удаления
    })
    .catch(error => {
    alert("Произошла ошибка при удалении задачи"); // Вывод сообщения об ошибке при неудачном удалении
    });
    }
   }
   // Функция loadTasks загружает задачи с сервера и отображает их на странице
   function loadTasks() {
    fetch('get_tasks.php') // Отправляем GET-запрос на сервер для получения задач
    .then(response => response.json()) // Преобразование ответа в формат JSON
    .then(data => {
    const taskList = document.getElementById('task-list'); // Получение элемента списка задач
    taskList.innerHTML = ''; // Очистка списка задач перед обновлением
    data.forEach(task => {
    const listItem = document.createElement('li'); // Создание нового элемента списка (задачи)
    const taskDate = new Date(task.task_date + 'T' + task.task_time); // Создание объекта даты и времени задачи
    const currentDate = new Date(); // Получение текущей даты и времени
    listItem.innerHTML = `Дата: ${task.task_date}<br>Время: ${task.task_time}<br>Задача:
   ${task.task}<br>Важность: ${task.priority}`;
    // Заполнение элемента списка информацией о задаче
    if (taskDate < currentDate) {
    listItem.style.backgroundColor = '#ffe7e7'; // Простроченная задача (красный фон)
    } else if (taskDate.toDateString() === currentDate.toDateString()) {
    listItem.style.backgroundColor = '#e7ffe7'; // Сегодняшняя задача (зеленый фон)
    }
    listItem.innerHTML += `<button onclick='deleteTask(${task.id})'>Удалить</button>`; // Добавление кнопки
    taskList.appendChild(listItem); // Добавление элемента списка задач в список
    });
    })
    .catch(error => {
    alert("Произошла ошибка при загрузке задач"); // Вывод сообщения об ошибке при неудачной загрузке задач
    });
   }
   // Загрузка задач при загрузке страницы
   loadTasks();