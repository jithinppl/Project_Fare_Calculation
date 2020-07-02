# OnTheGO
The project focuses on building a Public Transport System Fare Calculation System.
The sytem works in such a way that the fare is calculated based on the distance travelled by the user. It is aimed for buses right now and can be implemented for other public transport system in the future. The project mainly focused on implementing architectural & enterprise design pattern. Along with it, the project also implements  microservices which is build on Python. Firstly it will identify if it is a customer or an admin and the services are availed based on it.Security was implemented using JWT, JSON web token. The token is used to authenticate the system. The project is build on Java, Spring Framework integrated with MySQL database.

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
  11. ALso after each travel a travel report will be generated to the customers email showing his travel history and amounts.
  12. When new subscriptions are added, it will be notified to the users via email.
  
For Admin:
  1. Admin can add new buses as well as bus routes.
  2. Admin can add new subscription packages.
  3. Monitor the activities of the customer.
  
Mainly the project focused on implementing different design patterns in the usecases and the design patterns used in here are:
  1. Factory Pattern: Used to find the different categories of card and to execute the function to calculate the discount based on customer.
  2. Observer Pattern: It is used to notify the users about the newly added subscriptions.
  3. Command Pattern: It is used to identify the Checkin/Checkout action done by the customer.
  4. Iterator Pattern: Used to retrieve collection of card data to run peaktime scheduler.
  5. Memento Pattern: Used during suscription plan to show three states of the plan.
  6. Proxy Pattern: It is used to improve the security of the system.
  7. Abstract Factory Pattern: Adding to the factory pattern generation and discount calculation is build based on this pattern.
  8. Chain of Responsibilities: Used to clearly log the error details.
  9. Interceptor pattern: Ierceptor is used to improve the security of the system. All the incoming requests will be first passed to the interceptor to check for any potential threats. This is mainly applicable when the users upload some images or files as part of the profile edit feature. For each of the requests, if the request contains any files attached then the interceptor calls a third party virus scanning method. This method scans the documents and verifies there are no potential threats to the file. If there is no threat, the request will be proceeded to a further level. In cases if there is a threat or virus detected in the system, the interceptor blocks all such requests from being forwarded further to the system. 
  10. Visitor pttern: Used for multiple validations like card,yment etc.

Microservice
In the prect, microservice is used for peak time calculation applying machine learning. All the existing user travel information is saved and is used for training a machine learning model using logistic regression. This model is trained to predict the peak time hours and gives the prediction as Peak time yes or peak time no.

CI/CD
Continuous integration and deployment of the developed code are implemented in the project. DevOps tool Jenkins is used for continuous integration and continuous deployment.Amazon web services (AWS) -an online cloud computing platform is used for deployment in this project. The service used to create application servers is EC2 (Amazon Elastic Compute Cloud). EC2 gives secure, resizable computing capacity on the cloud. ALB-Application Load Balancer is included for the load balancing.ALB distributes the incoming traffic across the servers. Security is ensured using the security groups in AWS.

