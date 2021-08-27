# Exercise 15

Congratulations! Now you know everything to have a nice CI/CD in place, from now on we will see "add-ons".

- Create a github repo in your user with the simple-app code.
- Create a Multibranch job and point it to your repo. Make it read the Jenkinsfile from the root of the repo (default). This is the standard practice
- Create a CI job that Builds and Tests for every branch. Connect github to Jenkins such that the PR fails if the tests don't pass. Recall that the Test stage should have in parallel the `test` command and the `site` command for the bugs.
- If the branch is `main` (which would be cmmited only from PRs) then after Build and Test it should:

* Package the JAR (Deploy Stage)
* Archive it
* Report bugs, code coverage, and tests

- In the end, recall to wipe out the workspace!

- In the next lab we will add Slack notifications!

Note: Feel free to create the job with Blue Ocean!!
