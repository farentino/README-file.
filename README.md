# README-file.
History application

The purpose of the app is to show someone the historical figures and
what age they died at what they did before they died what they were most
well known for and why they are historical figures

The app seems to aim at supplying users with details about well-known
people who passed away at particular ages. Here is an analysis of its
features and possible applications: \
1. \*\*Age-oriented Information Retrieval\*\*: Users have the option to
input their age in the designated field. When you click on the search
button, the app gathers details on a well-known person who passed away
at a specific age. This feature enables users to discover historical
figures who died at various points in their lives. \
2. \*\*Learning Resource\*\*: The application can function as an
educational tool for individuals who want to explore well-known figures
in fields like science, literature, activism, and entertainment. The app
assists users in understanding the impact these individuals had on
society by offering short biographical information about them. \
3. \*\*Entertainment\*\*: The app can be utilized for entertainment,
allowing users to discover fun facts about well-known individuals and
their ages. An engaging way to spend time and discover fascinating
information about historical and cultural figures. \
4. \*\*Historical Reference\*\*: The app can function as a speedy
resource for users

intrigued by historical events and figures. By showcasing data on people
who passed away at particular ages, it provides insight into important
events and accomplishments linked to various time frames. 

youtube link <https://youtu.be/S0kPQKVcNsE>\
5. \*\*Gaining Knowledge in Kotlin and Android Development\*\*: This app
is a useful resource for developers, particularly those studying Kotlin
and creating Android apps, showcasing concepts like UI design, handling
user input, managing event listeners, and incorporating external data
(such as biographical information). \
In general, the app offers a straightforward but engaging method for
users to discover details about well-known people according to their
ages, appealing to both educational and entertainment needs.

![](vertopal_0d60b38772bd425eb5ad0f6bcd625795/media/image1.png){width="6.268055555555556in"
height="3.917361111111111in"}This app uses 2 buttons one is the search
button and when clicked the button will let the application run the
information that was put in and will display the information that was
put in and the outcome will be "the age of the person and what they did
before they died'

The second button is the clear button and this button will clear all the
information that was provided and give no information

![A screenshot of a phone Description automatically
generated](vertopal_0d60b38772bd425eb5ad0f6bcd625795/media/image2.png){width="5.5526312335958in"
height="3.470240594925634in"}

Also with the app, we have a search function where in the background the
app will search the information to see if it falls in line with what you
type and the search bar is mainly for you putting the age of someone

I also input a picture to make the app look more full

At the very end, we have what is called a text view and this will
display all the information that was provided

![](vertopal_0d60b38772bd425eb5ad0f6bcd625795/media/image3.png){width="6.268055555555556in"
height="3.917361111111111in"}We have the code where that runs the whole
program and this sees if all the information is right and when the info
is right it will let the program display the outcome

This code is designed for a Kotlin-written Android app. Let\'s analyze
it. \
1. The code brings in essential classes and functions from Android
libraries such as \`android.os.Bundle\`, \`android.view.View\`,
\`android.appcompat.app.AppCompatActivity\`, etc. These imports are
crucial for the code\'s operation. \
2. \*\*MainActivity Class\*\*: This class expands on
\`AppCompatActivity\`, a core class for activities utilizing the support
library\'s action bar functionalities. The \`onCreate()\` method is
overridden within this class, and it is invoked during the initial
creation of the activity. \
3. \*\*activateEdgeToEdgeDisplay()\*\*: This method is used to activate
the edge-to-edge display mode, allowing the app\'s content to reach the
edges of the screen. \
4. \*\*setContentView()\*\*: This function establishes the design for
the activity by using the XML layout resource file called
\`activity_main\`. \
5. \*\*Locating Views\*\*: Different user interfaces components like
buttons (\`Button\`), text views (\`TextView\`), and an input field
(\`EditText\`) are located based on their specific IDs with the help of
\`findViewById()\`. These components are subsequently saved in variables
for future usage. \
6. \*\*Assigning Click Listeners\*\*: Click listeners are assigned to
the search button (\`btnSearch\`) and clear button (\`clear\`). Certain
actions are executed upon clicking these buttons. \
- \*\*Search Button Listener\*\*: Upon clicking the search button, the
entered text in the \`EditText\` field (\`ageText\`) is extracted and
turned into an integer using the \`toIntOrNull()\` method. Information
about famous individuals who passed away at the same age as the one
entered will be shown in the \`TextView\` (\`textView\`). \
- \*\*Clear Button Listener\*\*: Once the clear button is tapped, the
content in the \`EditText\` field gets erased, and the \`TextView\`
becomes empty. \
7. \*\*Showing Information\*\*: Details of well-known people at certain
ages are saved as strings and then shown according to the age input by
the user. If there is no data for the age entered, a standard message
will be shown. \
In general, this code generates an

GitHub serves as a web-based tool mainly utilized for software
development projects, offering version control and collaboration
features. It offers services such as code hosting, Git-based version
control, issue tracking, and compatibility with different tools. GitHub
enables collaboration among developers on projects, monitoring code
modifications, and overseeing various software versions. \
On the flip side, GitHub Actions is a functionality offered by GitHub
that enables you to automate processes directly in your GitHub
repository. It allows you to create, evaluate, and launch your code
straight from your repository. Using GitHub Actions allows for the
creation of personalized workflows that activate based on different
events, like repository pushes, pull requests, and external events. \
Here is the typical way GitHub and GitHub Actions are used: \
GitHub offers a hosting platform for Git repositories that enables
developers to monitor the changes made to their code throughout the
development process. This involves functionalities like branching,
merging, and pull requests that help team members work together more
effectively. \
Cooperation: GitHub allows various developers to collaborate on a
project, facilitating the sharing of code, reviewing modifications, and
giving feedback via tools such as pull requests and code reviews. \
GitHub has a built-in system for tracking issues which enables
developers to create, assign, and monitor issues linked to their
projects. This assists in maintaining team organization and guarantees
proper handling of bugs and feature requests. \
GitHub Actions enables the automation of workflows for creating,
testing, and deploying code as part of Continuous Integration/Continuous
Deployment (CI/CD) processes. For instance, you can establish a process
that automatically constructs and verifies your code each time a new
commit is sent to the repository, guaranteeing that all modifications
comply with the required quality criteria before being released. \
Automating tasks in your development workflow is possible using GitHub
Actions.

