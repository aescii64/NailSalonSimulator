# Nail Salon Simulator

I currently work as a nail technician and I wanted to create a Java program that simulates a typical day in the nail salon.



Java felt like a natural choice for this project because it naturally fits an object-oriented design.
As I continue working toward my degree, this project gives me space to practice and apply those concepts outside of class.

# Overview

This project models employee-customer interactions using queues, capability matching and real-time earnings tracking.
I did my best enforce some realistic constraints based on my own experience working in nail salons. 
But most will recognize the current constraints are more unrealistic than realistic. This is a choice for simplicity as I plan to build upon the program
further in the future.

# Current Constraints
* Employees can only perform services they are qualified for. If a customer requests a service that does not
match the employees qualifications, the employee will be skipped in the queue.
* Each employee performs 1 service per day.
* Customer are served in the order they arrive (FIFO).
* If there are no employees available to handle a service request then the day will end early.
The program reports not all customers could be served.
* If all customers are served successfully, the program reports "Perfect Day". 
* Customer service requests are randomly generated, so the output varies between runs.

# Earnings Tracking
I also made sure to track the earnings from each service.

* Each service is associated with a price.
* Each employee maintains their own total earnings for the day.
* At the end of the simulation program prints 
  * the individual employees earnings   
  * salon's total earnings for the day


# Future Improvements

* Allowing employees to re-enter the queue after completing the service
* Supporting multiple services per employee
* Running multi-day simulations


Questions and feedback are welcome!
