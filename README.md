V&V - TP2
===
Maxime Lebastard

* [Test report](Stubsmocks/simpleGame/target/surefire-reports)
* [Test Coverage](Stubsmocks/simpleGame/target/site/jacoco/index.html)

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
The objects that are interacted with must be mocked because we need to spy them and to make them return the values we want.
In the first test case, the object we will mock is Board. In the second test, it is the 2 pawns objects.

Note for Programming 2: The maxGold_correct test fails. I do not know if it is a bug or if I don't understand the board well. My test seems correct to me, but I don't see how to patch it.
