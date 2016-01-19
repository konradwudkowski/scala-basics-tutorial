Scala & SBT basics
==================

Basic project structure
--------------------------
```
mkdir -p src/{main,test}/scala
mkdir -p project
touch build.sbt

echo 'name := "test-app"' >> build.sbt
echo '' >> build.sbt

echo 'version := "1.0"' >> build.sbt
echo '' >> build.sbt

echo 'scalaVersion := "2.11.7"' >> build.sbt
echo '' >> build.sbt

touch project/build.properties
echo 'sbt.version=0.13.8' >> project/build.properties
```


Required installs
--------------------

#### Java
```
$ java -version
java version "1.8.0_66"
Java(TM) SE Runtime Environment (build 1.8.0_66-b17)
Java HotSpot(TM) 64-Bit Server VM (build 25.66-b17, mixed mode)
```

#### SBT
```
$ brew install sbt
$ sbt sbtVersion
```

#### Scala (not necessary but useful)
```
$ brew install scala
$ scala -version
Scala code runner version 2.11.6 -- Copyright 2002-2013, LAMP/EPFL
```

#### Maven/Ivy dependencies are stored here:
```
$ ls -al ~/.ivy2/cache 
```


Task to solve
----------------

Implement ```multiply``` function without using the ```*``` operator.

#### Adding a testing framework
```
echo 'libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"' >> build.sbt
echo '' >> build.sbt
```

#### Adding a test
```
mkdir -p src/test/scala/com/netaporter
touch MultiplicationSpec.scala
```

> You can check final content of the test file [here](src/test/scala/com/netaporter/MultiplicationSpec.scala)

#### Adding application code
```
mkdir -p src/main/scala/com/netaporter
touch Multiplication.scala
```

> You can check final content of the Multiplication.scala [here](src/main/scala/com/netaporter/Multiplication.scala)



