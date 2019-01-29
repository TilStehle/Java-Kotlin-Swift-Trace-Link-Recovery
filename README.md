# Java-Kotlin-Swift-Trace-Link-Recovery
This project provides a search engine for similarities between given cod elements written in Java, Kotlin, Swift, JavaScript and C#.
This search engine is wrapped in a plugin for IntelliJ IDEA.
Using this plugin, users can right-click a Java element (class/method/field name) and search for related code in a provided folder containing siwft documents.



##Using the latest pre-built release-version
-Download the latest pre-built version of the plugin from the release-section of this repository. It is called TraceabilityRecoveryPlugin.zip
-Open IntelliJ IDEA / Android Studio
-install the plugin from the pre-built zip-file via *File* -> *Settings* -> *Plugins* -> *Install plugin from disk*
-Restart the IDE

## Build the plugin from sources

Open Project in IntelliJ IDEA (Tested with Community Edition 2017.1.4) 

Set Project SDK to your IntelliJ IDEA-SDK for Plugin development

Add a Dependency to the kotlin plugin to your IntelliJ IDEA-SDK via File -> Project Structure -> SDKs -> *your plugin SDK* -> classpath -> + -> select the kotlin-plugin.jar from the Home Directory of your plugin SDK. 
It should look something like 
C:\Program Files\JetBrains\IntelliJ IDEA Community Edition *VersionNumber*\plugins\Kotlin\lib\kotlin-plugin.jar

Reimport maven dependencies from .pom-File
build
run/debug

If you want to deploy the plugin in another instance of IntelliJ IDEA or Android Studio, follow the guidelines provided on   https://www.jetbrains.com/help/idea/2016.3/plugin-deployment-tab.html for the export and   
https://www.jetbrains.com/help/idea/2016.3/installing-plugin-from-disk.html for installing the plugin  

##Using the Search Engine
The search service is implemented by the class de.unihamburg.swk.traceabilityrecovery.lucene.LuceneTraceabilityRecoveryService.
to fill the search index, call readDocuments() and pass directory paths containing source files in any of the three programming languages java, kotlin or swift.
To query for links, you have to create an instance of de.unihamburg.masterprojekt2016.traceability.TraceabilityPointer that represents the source document and pass this pointer as a paramter to getSortedTraceabilityLinksForPointer.
For guidance on how to initialize a proper TraceabilityPointer, take a look into the field documentsByPointers after it has been filled. It's keys are the pointers, that are used to find your source document at runtime.

the method getSortedTraceabilityLinksForPointer will return a list of links starting at the passed pointer. The List is sorted by the similarity score that determines, how similar the swift contents is to the contents represented by the passed TraceabilityPointer

## Using the plugin
Run the plugin module contained in the project or install the plugin as described above.    
Configure the directory path containing related swift files at "File"->"Settings"->"Traceability Recovery"  
Restart the IDE

to explicitly refresh the traceability index, select Analyze -> Refresh traceability index or use the shortcut crtl + alt + I
Notice: the search index for files outside IDEA is only re-indexed when it is explicitly refreshed. Changes to Files inside the current project are automatically updated in the index

Now you can query for similarity scores by selecting a java element(class/method/field name), perform a right click and select  "Go To"->"Corresponding element in second implementation". Alternatively, you can press crtl + alt + U

If you want to add a Todo-comment to a linked swift element, place the cursor on a Java class name, field name or method name. press crtl + alt + D.
Now, you can select the linked swift-element that you wish to comment on and write a comment.

### Example Video
We provide a video showing the usage of this plugin at 
https://swk-www.informatik.uni-hamburg.de/~stehle/TODO-CommentsForLinkedImplementation.mov

It shows a developer conducting the following steps:
-He adds a method to an Android Activity in Android Studio

-He copies the code

-He generates a TODO-Comment containing the code in the linkes iOS ViewController

-He navigates to the linked iOS ViewController

-He uses the comment to implement the corresponding Swift function

-He goes back to Android Studio, refreshes the traceability service and shows us, that the newly implemented function is linked correctly.

## Further Reading
German users and researchers are encouraged to take a look at the scientific document on the plugin's development and evaluation:

https://github.com/TilStehle/Java-Kotlin-Swift-Trace-Link-Recovery/blob/master/Entwicklung%20eines%20Plugins%20in%20IntelliJIDEA%20zum%20Auffinden%20von%20Quellcode-Entsprechungen.pdf

## Acknowledgements
The search engine and plugin is developed in cooperation with two students of the University of Hamburg:
Jakob Andersen and Gerrit Greiert.
