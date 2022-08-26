# Acmefood


#### 1.2 Technology Stack
The technology stack you have at your disposal consists of the following components:
<li> Java 17
<li> Angular Framework 13
<li> Spring Boot latest production release
<li> Maven latest production release
<li> Oracle database server

The development IDE of our choice is IntelliJ IDEA. Nevertheless, if you consider the use of another IDE will help,
you are free to use that IDE.

To call your endpoints, you may utilize one of the following tools:
<li> Postman Application
<li> Intellij HTTP Client
<li> Curl command-line tool
You are free to use any library as long as it is declared as a dependency via Maven.

### 2 Functional Requirements
#### 2.1 Product Perspective

ACME Delivery Service is a web application that allows individuals to order online food, coffee, beverages, etc.
To use the application, the user must register using a unique phone and email address.
Your goal is to create a functioning web application using Angular, following the practices covered during the
sessions. The web application should expose a UI section for every business requirement and should
communicate with the back-end Spring Boot application using a set of well-defined RESTful services that should
return a valid JSON response.
In the following section, we will describe all required functionality.

### 2.2 Functionality
#### 2.2.1 Domain Model
Our system consists of several entities with the most basic being the account, store, store category, product,
product category, and of course orders. You are free to create whatever domain class you think is appropriate
and include whatever attributes per domain class.
Remember that you should base the creation of your database schema on the entity classes that will be based
on the domain classes.

#### 2.2.2 Generate Sample Data
Once you have concluded the domain model, you should generate some corresponding sample data to feed
the services under development.
You are free to use whatever functionality Spring framework offers for this purpose.

#### 2.2.3 Business Requirements
The web application's user, after initial registration, should be able to
<li> Search for the desired store, either by name or by category.
<li> Add one or more items from the store's menu to the order.
<li> Create an order containing items only from the same store.
<li> In case we change to another store and add one of its items, the order should be cleared before adding
the new item(s).
<li> Retrieve all placed orders.
<li> List of the most famous stores in general and per category.
<li> List of the 10 most popular products to order.

### 3 Non-functional Requirements
#### 3.1 Software Design
All functionality should be implemented by following the practices covered during the sessions. You should
make use of interfaces and abstract classes wherever it seems appropriate and use proper java packaging
nomenclature.

#### 3.2 Performance
When it comes to performance, all calls should have a maximum response time of 200 milliseconds.

#### 3.3 Logging
There should be a well-defined logging policy maintaining all information considered mandatory to be able
to trace user activity and debug erroneous calls. By logging policy, we are referring to the definition of the
logging level per specific functionality, potentially more than one log file along with a clear rotation policy.

#### 3.4 Software Quality
When it comes to the quality of the implementing product, we need to make sure every call should always
return a valid JSON document including the cases where something went wrong, due to either a
development bug or system reasons. The end-user should not see default error pages.
Depending on the type of the call (CRUD actions), the proper HTTP code should be always returned:
<li> 200 OK
<li> 201 Created
<li> 202 Accepted
<li> 204 No Content
<li> 400 Bad Request
<li> 401 Unauthorized
<li> 403 Forbidden
<li> 404 Not Found
<li> 500 Internal Server Error

As far as the quality of the source code is concerned, you should utilize any type of formatting rules you
consider appropriate and indicative of your coding style.
