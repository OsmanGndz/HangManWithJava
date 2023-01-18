  public class Category{
    private final String[]  categories ={"vehicles", "animals", "colours", "fruits", "instruments","vegetables","months"};


    private final String[] vehicles = {"Boat","Ambulance","Aeroplane","Bicycle" ,"Bus","Bike" ,"Car", "Crane" , "Cycle", "Ferry" ,"Gondolas", "Helicopter" ,"Houseboat", "Jetpack"   ,"Limousine", "Lorry"
            ,"Motorcycle", "Metro","Rowboat", "Ropeway", "Ship", "Scooty", "Scooter", "Tractor","Train"};
    private final String[] animals = {"Dog",   "Cow", "Cat", "HorseDonkey", "Tiger",   "Lion",    "Panther","Leopard",   "Cheetah", "Bear",
            "Elephant","Turtle",   "Rabbit",  "Porcupine"    ,"Hare",   "Albatross",   "Crow",    "Fish","Dolphin",   "Frog", "Alligator", "Eagle",  "Goat",   "Jackal",  "Emu", "Armadillo", "Eel" ,"Goose",
            "Wolf", "Beagle",  "Gorilla", "Chimpanzee",  "Monkey" ,"Beaver",    "Orangutan",   "Antelope" ,   "Bat", "Badger",   "Giraffe", "Hermit" ,"Crab",    "Panda", "Hamster",  "Cobra",   "Camel", "Hawk",   "Deer",
            "Chameleon",   "Hippopotamus ","Jaguar",  "Chihuahua",   "Cobra",   "Ibex","Lizard",   "Koala"    ,"Kangaroo"    ,"IguanaLlama" ,"Chinchillas" ,"Dodo"    ,"Jellyfish", "Rhinoceros",    "Hedgehog",    "Zebra" ,  "Possum", "Wombat",
            "Bison",   "Bull",    "Buffalo" ,"Sheep","Mouse",   "Otter", "Sloth",  "Owl","    Vulture",     "Flamingo", "Racoon","Mole",    "Duck", "  Swan", "Lynx", "Monitor","Lizard",    "Elk", "Boar  ", "Lemur", "Mule",    "Baboon"};
    private final String[] colours = {"White","Black","Orange","Maroon","Red"," Yellow","Salmon"," Green","Aqua"," Grey"," Purple","Mustard","Peach", "Violet","Magenta","Coral","Saffron","Brown","Pink","Tan","Teal","Turquoise"
            ,"Beige","Indigo","Fuchsia","Amber","Burgundy","Charcoal","Bronze","Cream","Mauve","Olive","Cyan","Silver","Rust","Ruby","Azure","Mint","Pearl","Ivory","Tangerine","Garnet","Emerald","Umber"};
    private final String[] fruits = {"Ash","Apple","Banana","Apricot",    "Avocados","Blueberry","Cranberry","Cantaloupe","Cherry","Dragonrfruit","Dates","Cherimoya","Lime","Fig","Coconut","Grapefruit","Chempedak", "Hazelnut",
            "Dragon","Fruit","Durian","Pineapple" ,"Apple","Guava","Jujube","Jenipapo","Kiwi","Kabosu","Kiwano","Lime","Lychee","Longan","Langsat","Mango","Pear","Lucuma"," Muskmelon",   "Naranjilla"
            ,"Nectarine","Olive","Oranges","Melon","Papaya","Peach","Pomegranate","Pineapple","Raspberries","Strawberries","Starfruit","Soursop"};
    private final String[] instruments = {"Tangerine","Watermelon", "Piano", "Flute", "Veena", "Drums", "Violin", "Guitar", "Triangle", "Trumpet", "Saxophone", "Cello", "Xylophone", "Bugle", "Harp", "Harmonium", "Oboe", "Maracas", "Cymbal", "Accordion",
            "Bell", "Banjo", "Keyboard", "Comet", "Tambourine", "Trombone", "Ukulele", "Clarinet", "Harmonica", "Tuba", "Euphonium", "Piccolo", "Lute", "Marimba", "Bassoon", "Cornet", "Celesta", "Spinet", "Oud",
            "Tabla", "Sitar", "Gramophone"};
    private final String[] vegetables = {"Aniseed", "Basil", "Caraway", "Cardamon", "Cumin", "Coriander", "Chives", "Chicory", "Clove", "Dill", "Fennel", "Fenugreek", "Mace", "Nutmeg", "Oregano", "Pepper", "Peppermint", "Paprika", "Parsley", "Saffron", "Sage", "Savory","Broccoli", "Cucumber", "Celery","Greens","Carrot", "Potato", "Capsicum", "Turnip", "Brinjal", "Tomato", "Ginger", "Onion", "Cauliflower",
            "Beetroot",    "Garlic", "Cabbage", "Mushroom", "Beans", "Green", "Papaya", "Corn", "Okra", "Radish", "Zucchini"};
    private final String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    private  String category;
    private   String word;
    private  String mystery;

    public  String getCategory(){
        category = categories[(int) (Math.random() * categories.length)];
        return category;

    }


    public   String getWord(){
        if(category.equalsIgnoreCase("vehicles"))
             word = vehicles[(int) (Math.random() * vehicles.length)];
        else if(category.equalsIgnoreCase("animals"))
            word = animals[(int) (Math.random() * animals.length)];
        else if(category.equalsIgnoreCase("colours"))
            word = colours[(int) (Math.random() * colours.length)];
        else if(category.equalsIgnoreCase("fruits"))
            word = fruits[(int) (Math.random() * fruits.length)];
        else if(category.equalsIgnoreCase("instruments"))
            word = instruments[(int) (Math.random() * instruments.length)];
        else if(category.equalsIgnoreCase("vegetables"))
            word = vegetables[(int) (Math.random() * vegetables.length)];
        else
            word = months[(int) (Math.random() * months.length)];


        return word;


    }
    public String getMystery(){

        mystery = "_".repeat(word.length());
        return mystery;
    }

    public Category(){


    }
}


