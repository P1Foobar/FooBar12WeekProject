# FooBar12WeekProject
Cards/Ticket Focus
| Contributer | Artifacts |
| ------------- | ----------|
| Andrew Joseph | Mostly figured out how to do GUI code for simulation view, see [Panel](), [SimulationView](), and the draw method in [person]()|
| David Ramsayer | I worked on the basis of the [objects](https://github.com/P1Foobar/FooBar12WeekProject/blob/main/src/SimulationItems/SimObject.java) we will be using in the simulation, as well as the GUI for [choosing](https://github.com/P1Foobar/FooBar12WeekProject/blob/main/src/SimulationItems/SimObjectChooser.java) those objects. Eventually, these objects will become different types of people in the simulation. It was interesting to work with JComboBox.|
| Brendan Trinh | This week I basically worked on a GUI code for a timer that added a new point that keeps a track of the number of infected people. |

5-Hour Challenge
| Contributer | Self Grade | Leader grade | Artifacts |
| ------------- |-------------| -----| ----------|
|Andrew Joseph| 17/20 | 5/5| Set up settings [page](https://github.com/P1Foobar/FooBar12WeekProject/blob/main/src/Settings/SettingsView.java), <br> added [Human](https://github.com/P1Foobar/FooBar12WeekProject/blob/main/src/SimulationItems/Human.java) and [Matter](https://github.com/P1Foobar/FooBar12WeekProject/blob/main/src/SimulationItems/Matter.java) classes <br>- Matter is a parent class for walls and Human; anything that will have a reaction upon collision. <br> Tried to set up collision, still needs work. Main issue is understanding how to react upon collision <br> To Do: <br> -- Get UI set up for people "spawning" and moving. <br> -- Finish setting up collision. | 
| David Ramsayer |18/20 | 3/5 |I basically worked on establishing direction in the simulation, as well as the [Grid/area](https://github.com/P1Foobar/FooBar12WeekProject/blob/main/src/SimulationItems/Area.java) where we will manipulate objects.|
| Brendan Trinh |18/20| 3/5 | I worked on creating a Grid and collision for our project. It is not done and needs to be added to our main project. Andrew and I helped transferred Graphics to the main project from my Github. (https://github.com/brendan8503/DatabasesStimulation)|



| Contributer | Github link | Journal link |
| ------------- |:-------------:| -----:|
| Andrew Joseph | [AndrewPhilipJoseph](https://github.com/AndrewPhilipJoseph) | [Andrew, Brendan, David](https://docs.google.com/document/d/1ZEMbY_SJAptVBFEJHVeJKblV_N-WxgPG38xeOHocP9Q/edit) |
| David Ramsayer | [davidramsayer](https://github.com/davidramsayer) | [Andrew, Brendan, David](https://docs.google.com/document/d/1ZEMbY_SJAptVBFEJHVeJKblV_N-WxgPG38xeOHocP9Q/edit) |
| Brendan Trinh | [brendan8503](https://github.com/brendan8503) |[Andrew, Brendan, David](https://docs.google.com/document/d/1ZEMbY_SJAptVBFEJHVeJKblV_N-WxgPG38xeOHocP9Q/edit) |



[Scrum Board](https://github.com/orgs/P1Foobar/projects/1)

[Our Project Plan](https://docs.google.com/document/d/1BfC11oQnmn8DtsHVdqGQ3fDUcyWNKPyixhZ0jkPgNaM/edit)

[Journal](https://docs.google.com/document/d/1ZEMbY_SJAptVBFEJHVeJKblV_N-WxgPG38xeOHocP9Q/edit)

# Summary of our plan

One or multiple diseases will spread throughout a cityscape through both natural means
and infected people. A set number of "people" generated at the start -- as dots moving around --
as immune to the infection. A simple algorithm based on severity of the disease, predetermined
in settings, will have implications on the simulation; if the disease, or an aspect of it, is severe
people may move away from them for example. This will be relevant for the diseases mutation, which will happen at random
with preset attributes. When one person dies, the next two dots that touch will
produce a new person, that will take attributes from its parents. Gained immunity will not be passed to children.
The purpose of this simulation is to test two ideas: herd immunity, and evolution at an extremely basic level.
