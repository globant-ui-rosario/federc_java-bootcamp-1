select persons.`lastName` as "Teacher Last Name", persons.`firstName` "Teacher First Name", days.`name` as Day, `schedule_time`.`from`, `schedule_time`.`upTo`, `courses`.`name` as "Course name"
from `persons`
inner join courses
on courses.`teacherDni` = persons.`dni`
inner join `schedule_time`
on `schedule_time`.`idCourse` =  `courses`.`idCourse`
inner join days
on days.`idDay` = `schedule_time`.`idDay`
where persons.`dni`=10756901
order by days.`idDay`
