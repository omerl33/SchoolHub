SchoolHub Story Driven Tasks (Questions Only)
Topic: Inheritance & Polymorphism

Keep the school day running

Scenario: The high school wants a tiny tool to keep track of courses, the teacher assigned to each
course, and which students are enrolled.

What the tool must do (observable behavior):
- Let a student join or leave a course.
- Let the school assign or change the teacher of a course.
- Show a course page that lists its code/title, current teacher s name, and enrolled students.
- Show what courses a specific teacher is responsible for today.


Constraints & hints (non-technical):

- Keep it simple, Separate, straightforward representations are fine.
- Favor a clear, direct design over clever abstractions.

Demo expectation: Create a tiny dataset (a couple of teachers, a few students, two courses) and shthe course pages and one teacher s responsibilities.
SchoolHub Story Driven Tasks (Questions Only)

One school, many roles

New situation:The principal now wants the tool to handle not only students and teachers but also other school roles (e.g., office staff, lab assistants).
Everyone in the building has a school ID and a name, and the school wants a single, consistent way to present a person s identity while still letting different roles add their own flavor.

What changes are needed (observable behavior):

- There is a single place where the shared idea of a person s identity is defined and maintained for all roles.
- Every role can still introduce its own role-specific details when shown on screen (e.g., how it s described).
- Add at least one nonteaching role (e.g., a staff member with a department and a duty), and make sure it appears propeanywhere people are listed.
- Existing Step 1 features must continue to work. 

Constraints & hints (non-technical):
 
- Avoid duplicating the identity concept across roles.
- Allow roles to customize how they introduce themselves without rewriting the rest of the system.

Demo expectation: Show a list of mixed people (students, teachers, staff) where each appears withconsistent identity format, but role-specific wording is visible where appropriate.
SchoolHub Story Driven Tasks (Questions Only)

The daily brief + universal scheduling

New situation:Each morning, the principal wants a Daily Report answering: "What is each person doing today?"
In addition, the school wants a simple scheduling board that can book time/room slotfor anything that needs one (courses, teachers, clubs, etc.).

What the system must do (observable behavior):

1) Daily Report
- The system asks every kind of person the same question ("What are you doing today?") and prints the answers in one list. 
- Different roles answer differently (e.g., students mention classes they ll attend; teachers mention classes they ll teach or office hours; staff mention their duties).
- The code that compiles this report treats all people uniformly and does not branch on role types (no role-by-role checks).

2) Universal Scheduling
- Anything that can be scheduled follows the same simple capability: it can request a time/room slot and it can show its current schedule.
- The scheduling board can take a mixed collection of schedule-able things (e.g., courses and teachers together) and attempt tbook them without any special-case logic for specific kinds.
- After booking attempts, the board shows each item s schedule uniformly.

3) Richer roles
- Introduce at least two additional role variations (e.g., an administrator and a janitor as types of staff; optionally a substitute teacher who explains they re substituting today).
- Their daily messages should reflect their responsibilities. Constraints & hints (non-technical):
- Treat "a person" as a general idea that different roles specialize.
- The daily report should rely on each person knowing how to describe their own day.
