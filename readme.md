## To run dev server 

mvn clean spring-boot:run

## To compile to jar without test

mvn package -Dmaven.test.skip=true

## to run it at (src level)
java -jar target/day11.workshop-0.0.1-SNAPSHOT.jar

## overwrite port at properties

## FOR WINDOWS
#set SERVER_PORT = 9000
#echo %SERVER_PORT%
#unset >> set SERVER_PORT =     << ensure no white space

## FOR MAC
#export SERVER_PORT=9000
#echo $SERVER_PORT
#unset SERVER_PORT


## to change in html
    <div>        
            <img data-th-src = "@{'/images/number' + ${photo1} + '.jpg'}" width =30%>
            <img th:src = "@{'/images/number' + ${photo2} + '.jpg'}" width =30%>
            <img data-th-src="${photo3}" width =30%>           
    </div>

## https://nixpacks.com/docs/providers/java