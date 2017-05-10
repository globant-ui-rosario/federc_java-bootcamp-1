select persons.`lastName` AS "Students Last Name", `courses`.`name` AS "Course Name", `exams_students_courses`.`grade` AS "Grade", exams.`type` as "Type"
from `persons`
inner join `students_courses`
on persons.`dni`=`students_courses`.`dni`
inner join courses
on courses.`idCourse` = `students_courses`.`idCourse`
inner join `exams_students_courses`
on `exams_students_courses`.`dni` = `students_courses`.`dni` and
   `exams_students_courses`.`idCourse` = `students_courses`.`idCourse` and
   `exams_students_courses`.`year`=`students_courses`.`year`
inner join exams
on exams.`idExam` = `exams_students_courses`.`idExamn`
where `persons`.`registrationNumber` = 938533 and
      exams.`type` like "final"
order by `exams_students_courses`.`grade` desc, courses.`name`
