# Exercise 10

- Take the job from last exercise but make it work with the app `flaky-test-app`. It has a flaky test. Build it a few times to check that
- In Jenkins UI Build view one can restart from a given stage, which is useful on long running jobs. Try to make it run from the Test stage, why does it fail?
- Make it work such that any stage can run independently. This will be useful because steps may run on different nodes if we specify so. It is useful at this point replaying a build to touch the Pipeline code as much as you need
- Now ensure the Test stage only runs with the node of label `small` and the Deploy stage (the one that packages the app) can only run on the node with label `large` (assuming you sticked with the labels for nodes we created on Day 1).
- You probably are already repeating the `-f {app}` parameter quite a lot! Use string interpolation from Groovy to define a variable!
