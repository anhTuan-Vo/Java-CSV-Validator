language: java
jdk:
  - oraclejdk8
install: mvn install -Dmaven.compiler.target=8 -Dmaven.compiler.source=8 -DskipTests=true
script: mvn test -Dmaven.compiler.target=8 -Dmaven.compiler.source=8 -x
