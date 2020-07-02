# OnTheGO
The project focuses on building a Public Transport System Fare Calculation System.
Its build on a Spring Framework. And it is mainly focused on architecture and enterprise design patterns. It also encomposses of a microservice architecture which is build on Python. Firstly it will identify if it is a customer or an admin and the services are aviled based on it.
For a Customer:
  1. Customer can register their card based on Student or General category
  2. Customer can Login to their account and  link their card to their account.
  3. While travelling fare is calculated based on the distance, the customer travelled.
  4. Based on the category of customer , the fare will be calculated and deduced from their card.
  5. Different rate for diffrent customers.
  6. Subscription packages like Weekly/ Monthly pass are available and customer can recharge based on their requirement.
  7. Amount will be calculated based on their subscription packages if they are subscribed.
  8. Also a peektime scheduler is maintained to show the customers the peek time of a day based on the previous days travel history.
  9. Different rate for the peaktime of the day.
  10. Machine learning is used to predict the peaktime of the day and is build on a Microservice architecture.
Jenkins pipe line integrated
