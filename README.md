# Spriggan-Engine
The Spriggan Engine (named for the wicked creatures of Celtic Folklore) is a hearkening back to the Metroidvania days, with some inspiration from Sega Genesis era RPGs and platformers. The Engine is being developed for a personal project, but is designed to be fairly modular. To minimize dependencies on hardcoded elements while avoiding the complexities of a script language, all game data will be loadable from JSON or CSV files.

The code of the engine is available under our own "Common Sense License". Any reuse of the code is expected to preserve the header and our name.

Update 11/19/16:

Spriggan is back from the grave, and is being reconceptualized (is that a word?) with a focus on platforming. As such, we got rid of some of the party
mechanics in code. We're also debating a redo in .NET w/MonoGame, currently weighing the pros/cons of that. If that goes through, expect a Spriggan.NET
repo sometime soon :)

- Rudra

Update to Update: After several hours of debate, we said screw it. We're sticking with Java, however we are working on integrating libGDX into our existing codebase. 
Should save us a ton of time writing code for animations, particle fx, and input, among other things.

#Using the Engine

The engine expects a path to a configuration file, which should be a JSON file containing the following parameters:

{
    "spritePath": "../pathto/sprites",
    "gamePath": "../pathto/gameLogic/",
    "gameName": "YourGameName",
    "windowXRes": 800,
    "windowYRes": 640
}

You should specify your configuration path while launching the Spriggan jar file.