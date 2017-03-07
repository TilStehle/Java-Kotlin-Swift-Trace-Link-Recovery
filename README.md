# Java-Kotlin-Swift-Trace-Link-Recovery
This project provides an IntelliJ plugin providing a search engine for similarities between given java or kotlin code on the one side and swift code on the other.
Users can right-click a Java element (class/method/field name) and search for related code in a provided folder containing siwft documents.

##Build
Open Project in IntelliJ IDEA (Tested with Community Edition 2016.2.5)  

If you want to deploy the plugin in another instance of IntelliJ IDEA or Android Studio, follow the guidelines provided on   https://www.jetbrains.com/help/idea/2016.3/plugin-deployment-tab.html for the export and   
https://www.jetbrains.com/help/idea/2016.3/installing-plugin-from-disk.html for installing the plugin  

##Runnning and using the plugin
Run the plugin module contained in the project or install the plugin as described above.  
Configure the directory path containing related swift files at "File"->"Settings"->"Traceability Recovery" 

Now you can query for similarity scores by selecting a java element(class/method/field name), perform a right click and select  "Analyze"->"Show possible traceability links"

##Acknowledgements
The search engine and plugin is developed in cooperation with two students of the University of Hamburg:
Jakob Andersen and Gerrit Greiert.
