# java-simple-servlet
It contain java servlet program 

 deploy the TimeForm example as below: 
• Setup the Tomcat environment so that you can deploy and test the TimeForm example
• Configure so that when you enter the URL http://localhost:8080/cs532/servertime, it should show the
form to select the Locale and the Time Zone as shown below
• After the selections are made and the “Submit” is clicked, the TimeForm servlet uses the locale & time
zone selected to return the system date and time.

Implement and deploy a simple Registration form as follow:
• Setup the Tomcat environment so that you can deploy a simple registration form
• Create a Register.html HTML form so that when you enter the URL
http://localhost:8080/cs532/Register.html, it should show the form to fill the first name, last name,
gender (selection box – Male and Female), phone, and email as shown below
• After the user enters the information and click the “Submit” button, the Registration servlet should
store the data into a local file (a text or binary file on the server side, not a database)
• The Registration servlet should first check that both the first name and last name are provided. If not,
send the error message back to the user “Error: Name not provided”
• If the information has been saved successfully, then the servlet sends a notification back to the user
saying “Your registration was successful” 
