select cours.`name` AS Course, teacher.`lastName` AS "Teacher Last Name", teacher.`firstName` AS "Teacher First Name", students.`lastName` AS "Students Last Name", students.`firstName` AS "Students First Name"
from `persons` teacher
inner join courses cours
on cours.`teacherDni`=teacher.`dni`
inner join `students_courses` stucour
on cours.`idCourse`=stucour.`idCourse`
inner join `persons` students
on stucour.`dni` = students.`dni`
where cours.`name` like "mathematics"
order by students.`lastName`


