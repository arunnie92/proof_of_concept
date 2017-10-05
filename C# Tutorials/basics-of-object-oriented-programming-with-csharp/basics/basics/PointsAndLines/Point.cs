namespace PointAndLines
{
    class User
    {

        public static int currentID;

        public const int HEIGHT = 180; // const must set when created, and same for all instances of the class 

        public readonly int ID; // readonly can be set later in the code

        private string username;
        private int password;

        // getter & setter
        public string Username
        {
            get
            {
                return "The username is " + username;
            }
        }

        public int Password
        {
            set
            {
                if (value >= 4 && value <= 10)
                {
                    password = value;
                }
                else
                {
                    System.Console.WriteLine("Oops, this is not a valid password! Please use a password between 4 and 10 characters");
                }
            }
        }

        public User()
        {
            currentID++;
            ID = currentID; 
        }

        public User(string username)
        {
            currentID++;
            ID = currentID;
            this.username = username;
        }

        
    }
}


// namespace allows you to organize classes and code better

// 'this' - gives you access to the fields of your class 
//        - (optional) lets you distinguish between two variables that have the same name

// using a different combinations of get and set, we can control if a given Property is Read-Only, Write-only or Read-Write   
