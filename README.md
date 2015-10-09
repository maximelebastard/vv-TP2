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

Question 3
---
The objects Pawn1 and Pawn2 need to be mocked because they just provide a getter for this sequence, and it is not necessary to test them. Moreover, mocking them allows us to focus on Board.
We should also mock Game for some methods, as we cannot act reliably on this object (it has random values, and it's not good for the tests).
