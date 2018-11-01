```
$ for jdk in 1.11.0-15 1.8.172; do jabba use $jdk; sbt clean compile; done
[info] Loading settings for project global-plugins from idea.sbt,dirtymoney.sbt,gpg.sbt ...
[info] Loading global plugins from /Users/jz/.sbt/1.0/plugins
[info] Compiling 2 Scala sources to /Users/jz/.sbt/1.0/plugins/target/scala-2.12/sbt-1.0/classes ...
[info] Non-compiled module 'compiler-bridge_2.12' for Scala 2.12.6. Compiling...
[info]   Compilation completed in 5.127s.
[info] Done compiling.
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.protobuf.UnsafeUtil (file:/Users/jz/.sbt/boot/scala-2.12.6/org.scala-sbt/sbt/1.2.3/protobuf-java-3.3.1.jar) to field java.nio.Buffer.address
WARNING: Please consider reporting this to the maintainers of com.google.protobuf.UnsafeUtil
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[info] Loading project definition from /Users/jz/code/polysig-test/project
[info] Updating ProjectRef(uri("file:/Users/jz/code/polysig-test/project/"), "polysig-test-build")...
[info] Done updating.
[info] Set current project to polysig-test (in build file:/Users/jz/code/polysig-test/)
[info] Executing in batch mode. For better performance use sbt's shell
[success] Total time: 0 s, completed 1 Nov. 2018, 5:41:43 pm
[info] Updating ...
[info] Done updating.
[info] Compiling 1 Scala source to /Users/jz/code/polysig-test/target/scala-2.12/classes ...
[info] Done compiling.
[success] Total time: 0 s, completed 1 Nov. 2018, 5:41:43 pm
[info] Loading settings for project global-plugins from idea.sbt,dirtymoney.sbt,gpg.sbt ...
[info] Loading global plugins from /Users/jz/.sbt/1.0/plugins
[info] Loading project definition from /Users/jz/code/polysig-test/project
[info] Set current project to polysig-test (in build file:/Users/jz/code/polysig-test/)
[info] Executing in batch mode. For better performance use sbt's shell
[success] Total time: 0 s, completed 01/11/2018 5:41:52 PM
[info] Updating ...
[info] Done updating.
[info] Compiling 1 Scala source to /Users/jz/code/polysig-test/target/scala-2.12/classes ...
[info] Done compiling.
[success] Total time: 1 s, completed 01/11/2018 5:41:53 PM
/code/polysig-test on master*
```