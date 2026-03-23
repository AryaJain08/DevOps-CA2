1\. Requirements
================

- Java JDK installed (preferably JDK 21)

- Google Chrome installed

- ChromeDriver matching your Chrome version (placed in chromedriver/chromedriver.exe)

- Jenkins installed (optional, for automated test execution)

- Git installed (optional, to clone repository)

2\. Clone the repository 
=========================

Open terminal / CMD and run:

git clone https://github.com/AryaJain08/DevOps-CA2.git

3\. Update ChromeDriver path
============================

Open `selenium/src/FormTest.java` and make sure the path to ChromeDriver is correct:

System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

4\. Run the form manually (optional)
====================================

Open in browser:

C:/path/to/DevOps-CA2-task/form/index.html

Check that the form loads and validations work.

5\. Compile and run Selenium test
=================================

Open terminal / CMD in the project root folder and run:

1\. Compile:

javac -cp "selenium/lib/*;selenium/lib/libs/*" selenium/src/FormTest.java

2\. Run:

java -cp "selenium/src;selenium/lib/*;selenium/lib/libs/*" FormTest

- This will open Chrome and automatically fill and submit the form.

- If it works without errors, your setup is correct.

6\. Run test via Jenkins 
=========================

1\. Open Jenkins - Create a new item. 

2\. Connect Git repository: https://github.com/AryaJain08/DevOps-CA2.git

3\. Add Build Step - Execute Windows batch command:

javac -cp "selenium/lib/*;selenium/lib/libs/*" selenium/src/FormTest.java

java -cp "selenium/src;selenium/lib/*;selenium/lib/libs/*" FormTest

4\. Save - Click Build Now

5\. Check console output:

- SUCCESS - test ran and form submitted automatically

- WARNING about CDP version is normal and can be ignored

7\. Notes
=========

- Make sure ChromeDriver matches your installed Chrome version.

- Workspace paths may need adjustment depending on where you cloned the repository.

- All Selenium JARs are included in `selenium/lib/` and `selenium/lib/libs/`.
