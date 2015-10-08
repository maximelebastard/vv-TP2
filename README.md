V&V - TP4
===
Maxime Lebastard

Question 1 & 2 : Test Plan
---
As we can see on [the dependencies graph](Report/DependenciesView.png), there is few class that not references others:
* Direction
* OutOfBoardException

Then, when these two are checked and ok, Pawn class can be tested as it only refers to Direction and OutOfBoardException. Then Board, then Game and to finish, we can test Main.

In consequence, the path is this:
* Direction
* OutOfBoardException
* Pawn
* Board
* Game
* Main