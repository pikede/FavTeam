# FavTeam App by Prince Ikede

Tools used: Android, Runnable, Handler, Dependency Injection, Kotlin, Multithreading, MutableLiveData, 
MVVM Architecture, Retrofit, Koin

----------------------------------------------------------------------------------------------------

Bonus objectives:

For tracking and authenticating users, I would use analytic's tools provided by Google's Firestore and Firebase.

Tier 1: 
The application would track each user's favorite team, favorite players and their stats, 
and provide them with regular updates per month for a $5.99 subscription per month for their first team. 
This would also include live in-game stats and updates. Each additional team would be 0.99 cents. 

Tier 2: 
The application would provide highlights, live mobile wallpapers, behind the scenes videos of training, 
game preparation videos, and team traveling videos for $9.99 per month.


----------------------------------------------------------------------------------------------------

Features:

- Edit text for getting user's search word
- Search button used for searching user's favorite team
- Progress bar to show loading of data
- RecycleView for displaying data received from api
- Dependency injection using Koin
- Handler & Runnable for progress bar multithreading

Improvements that can be made:
- Espresso tests
- base Url and api key should have been put into config files 
- remove appending of strings! (due to time constraints)

 
