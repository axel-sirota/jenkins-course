# Exercise 17

In a seperate repo create a simple shared library that exposes a single step that after being sent the `currentBuild.result` it posts to Slack the correct message. This avoids the classic if statements on the Jenkinsfile.


- Create the shared library that does the if statement. If you need guidance you can always check: https://github.com/axel-sirota/jenkins-shared-library-example
- Create a simple Jenkinsfile that uses that shared library. A good idea is to create a parallel and force one of the two branches to fail. On the post for each stage send the correct notification.

- Bonus: Add the new shared library to the Pipeline from the last exercise to complete it.
