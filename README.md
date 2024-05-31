This application has the JWT Token Authentication and implemented the basic customer CRUD functionality with out authentication.
All dependencies were added to pom.xml file, Please feel free to clone the application.

This application runs on 8080 port number

API ENDPoints are follows bellow,

POST : http://localhost:8080/auth/addNewUser
  Request Body
  {
      "name" : "swamy",
      "email" :"swamy@gmail.com",
      "password" : "swamy",
      "roles" : "admin"
  }
POST  : http://localhost:8080/auth/generateToken
  Request Body
  {
    "username" : "swamy",
    "password" : "swamy"
  }
  Response : <TOKEN>

GET : http://localhost:8080/customer/customerProfile/1
  Header
  AUthorization : Bearer <TOKEN>

Simple CRUD Fuctionality for customers

POST http://localhost:8080/customer/addCustomer
  {
    "name" : "swamy1",
    "email" :"swamy1@gmail.com",
    "customerStatus" : "LEAD",
    "phone" : "8207531236"
}
POST : http://localhost:8080/customer/updateCustomer
  Body :
    {
    "id" : 1,
    "name" : "swamy",
    "email" :"swamy@gmail.com",
    "customerStatus" : "LEAD",
    "phone" : "8207531236"
}

GET http://localhost:8080/customer/customerProfile/1




  

  
