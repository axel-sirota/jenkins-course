# Exercise 16

Take the Jenkinsfile from the previous repo.

- Install the Slack Notification Plugin
- Add a post action that in case of success it notifies the build was succesful to a channel in Slack
- In case of failure it also notifies in red.

If you had simple username / password gmail auth or a company email you can configure the email in Jenkins > Manage System > Global Settings > Email configuration. However, nowadays most people use Slack since is quicker and the notification doesn't get lost.