# jaba-lab-9

## Task 
  + Create REST service and implement CRUD operations on object from 8-th lab
  + GET operation should use id, without id should return list of all objects
  + Code should be checked with checkstyle and pmd plugins
  + Code should be in a different pull request than lab8
  + Controller and RestApplication should be in a different packages
  + Objects should be stored in a `Map`
 
## To run
  + Clone/download lab9 branch
  + `cd` into repo folder
  + Run `mvn install`
  + Run `java -jar target/lab9-VERSION.jar`, where `VERSION` is version of the app
    (can be found in `pom.xml`, under `<version>` tag)