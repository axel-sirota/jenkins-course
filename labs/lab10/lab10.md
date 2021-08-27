# Exercise 10

- Take the job from last exercise but make it work with the app `flaky-test-app`. It has a flaky test. Build it a few times to check that
- In Jenkins UI Build view one can replay from a given stage, which is useful on long running jobs. Try to make it run from the Test stage, why does it fail?
- Make it work such that any stage can run independently. This will be useful because steps may run on different nodes if we specify so.
- You probably are already repeating the `-f {app}` parameter quite a lot! Use string interpolation from Groovy to define a variable!
