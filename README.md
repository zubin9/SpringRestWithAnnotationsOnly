# SpringRestWithAnnotationsOnly
This is the demo project to start with Sprint4 REST. This project doesn't use any xml file for configuration.

Steps to run the project in eclipse
-Import project
-Checkout maven project from SCM
-Select GIT in dropdown and give URL of .git file (e.g: https://github.com/zubin9/SpringRestWithAnnotationsOnly.git)
-maven eclipse:eclipse
-Right click on project
-add Deployment Assembly in project:
	- click on Add 
	- select Java Build Path Entries 
	- select Maven Dependencies 
	- Finish 
-Run tomcat and hit the URL: http://localhost:8080/SpringRestWithAnnotationsOnly/UserController/user/4
