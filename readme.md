## To run dev server 

mvn clean spring-boot:run

## To compile to jar without test

mvn package -Dmaven.test.skip=true

## to run it at (src level)
java -jar target/day11.workshop-0.0.1-SNAPSHOT.jar

## overwrite port at properties

1. FOR WINDOWS
#set SERVER_PORT = 9000
#echo %SERVER_PORT%
#unset >> set SERVER_PORT =     << ensure no white space

2. FOR MAC
#export SERVER_PORT=9000
#echo $SERVER_PORT
#unset SERVER_PORT

## Railway
1. to change in pom.xml to java version 19
2. create environment properties in railway to NIXPACKS_JDK_VERSION : 19 ( https://nixpacks.com/docs/providers/java )
3. To deploy : 
    railway login
    railway link
    railway up
