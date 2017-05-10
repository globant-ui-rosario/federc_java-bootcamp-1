select courses.`name` as "Course name", count(`students_courses`.`dni`)as "Total Students", (

select count(`students_courses`.`dni`)
from `students_courses`
inner join `courses`
on courses.`idCourse` = `students_courses`.`idCourse`
inner join `exams_students_courses`
on `students_courses`.`dni` = `exams_students_courses`.`dni` and
   `students_courses`.`idCourse` = `exams_students_courses`.`idCourse` and
   `students_courses`.`year` = `exams_students_courses`.`year`
inner join `exams`
on exams.`idExam` = `exams_students_courses`.`idExamn`
where `students_courses`.`idCourse` = 2 and
      exams.`type` like "final" and
      `exams_students_courses`.`grade` >= 6

) * 100/ count(`students_courses`.`dni`)as " Percentage of students that passed"

from `students_courses`
inner join `courses`
on courses.`idCourse` = `students_courses`.`idCourse`
inner join `exams_students_courses`
on `students_courses`.`dni` = `exams_students_courses`.`dni` and
   `students_courses`.`idCourse` = `exams_students_courses`.`idCourse` and
   `students_courses`.`year` = `exams_students_courses`.`year`
inner join `exams`
on exams.`idExam` = `exams_students_courses`.`idExamn`
where `students_courses`.`idCourse` = 2 and exams.`type` like "final"
group by courses.`name`




