class Person:
    """
    Parent class representing a person with a name and age.
    """
    def __init__(self, name: str, age: int):
        # TODO: Initialize name and age instance variables
        pass

    def display_info(self):
        """Print the person's name and age in the specified format."""
        # TODO: Implement method to print name and age
        pass


class Student(Person):
    """
    Child class representing a student, inherits from Person.
    Adds student_id, courses list, and school_name class variable.
    """
    school_name = "Generic University"

    def __init__(self, name: str, age: int, student_id):
        # TODO: Call parent constructor and initialize student_id and courses list
        pass

    def enroll_course(self, course_name: str):
        """Enroll the student in a new course by adding to the courses list."""
        # TODO: Add course_name to the courses list
        pass

    def display_info(self):
        """
        Print the student's name, age, student ID, school name, and list of courses in the specified format.
        """
        # TODO: Implement method to print all student details, including courses
        pass

# --- Demonstration code ---
if __name__ == "__main__":
    # Creating and displaying a Person
    # TODO: Create a Person and call display_info
    pass

    # Creating and displaying a Student
    # TODO: Create a Student, enroll in courses, and call display_info
    pass

    # Changing the class variable
    # TODO: Change school_name and show it affects all Student instances
    pass
