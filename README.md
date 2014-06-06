FoosBoard
=========

This is a FoosBall (table-football) player ranking application which allows game scores to be aggregated into player ranking tables.

The objective of this application is to allow players to register and record their scores so that their performance over time is analysed and displayed in different ways. The most basic requirement for this application is that a players register, input their scores and a leader board is created reflecting players success. Players should be able to join 'conferences' which may be made up of a bunch of mates that play together somewhere i.e. down the local... Conferences can be made up of one/many tournaments or leagues. Each league can have separate leaderboards and these separate tournament leaderboards can form one overall conference leaderboard. Leagues can themselves be ranked to provide for apropriate weighting of scores across a conference.

The design should eventually allow for any sport to be configured so that other games/sports can use the application. 

Nice to haves would include: 
 - android/iOS apps that allow players to record their game scores at the table after the game this way first half and second half scores can be entered directly after they are played. Perhaps a responsive web app with iOS/Android/Windows Phone wrappers??
 - player profiles and stats.
 - Awesome visual representations of the player data.
 - Random match generator
 - player status to indicate whether players are availible to play or not.
 - casual play section showing players availible to play.
 - match schedules with a possible random scheduling function.

TECHNOLOGIES
------------

 - SpringBoot - http://projects.spring.io/spring-boot/ 
 - AngularJS  - https://angularjs.org/
 - Gradle     - http://www.gradle.org/ 
 - Bootstrap  - http://getbootstrap.com/
 - MongoDB    - http://www.mongodb.org/

How to run
----------

Use the gradle wrapper to start the app

```java
./gradlew bootRun
```
