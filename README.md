# idea-kotlin-junit-issue

This sample project is used to demonstrate that is not possible to run test in inherited nested class from a subclass.
For both java and Kotlin is not possible to select test method defined in an nested class within an abstract class when running the concrete class from the IDE using both the structure layout or the Run/Debug configuration dialog

For Kotlin is not even possible to select a method defined on an abstract class from the concrete class because there's no way to show the inheritance tree