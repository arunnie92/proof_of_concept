using PointAndLines;

class EntryPoint
{
    static void Main(string[] args)
    {
        User user = new User("Arunn");

        User secondUser = new User();

        User thirdUser = new User();
        
        System.Console.WriteLine(user.ID);
        System.Console.WriteLine(secondUser.ID);
        System.Console.WriteLine(thirdUser.ID);
        System.Console.WriteLine(User.currentID);
    }
}

// Static Field
// (Static members in general) are not dependant on the instance of a given class
// they can be accessed directly from the class without instatiating it. 
// the value of a static field is not dependant on a Class Instance.
// the static field is "shared" amongst all instances of the Class and they all can modify or access it iternally
// useful to share a varibale between all instances of a class

// const - defined value hardcode in the code
// readonly - value assigned at runtime through code logic
// constants of any kind cannot change their valu once it's set in a constructor or initializer 
// usually have const variables all capitlized or camel case or with _
// const constants are static by default
