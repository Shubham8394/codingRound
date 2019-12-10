**********************************BaseClass.java*************************************
-> This class contains the instance of all the classes which needs to be used or called in other classes.
-> Here, we are initiating the driver and setting the configuration for it so that we can make use of the driver in the entire framework.
-> Also, we are initiating the WebElements which we need while performing the test execution.
-> We have defined the implicit and explicit wait which helps us out in handling the test execution in a more reliable manner.



**********************************Utility.java******************************************
This class contains all the common functions which we make use of in the entire framework very frequently which reduces the redundancy to a higher extent.



**********************************ObjectRepository.java********************************
This class contains the properties of objects present on the web page so that we can locate elements and perform the required operation on it more conveniently.



**********************************FlightBookingTest.java********************************
The fix which was required in the test case specified in this class was to change the id of toTag -> ToTag



**********************************HotelBookingTest.java********************************
The fix which was required in the test case specified in this class was to initialize the elements specified using @FindBy with the help of PageFactory.initElements()



**********************************SignInTest.java*************************************
The fix which was required in the test case specified in this class was to switch to frame because after clicking on SignIn button a window opens for entering the SignIn details which is on the frame



