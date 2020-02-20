# Para executar
./mvnw clean

./mvnw package \
  com.google.cloud.tools:appengine-maven-plugin:2.0.0:deploy \
  -Dapp.deploy.projectId=[PROJETO] \
  -Dapp.deploy.service=default \
  -Dapp.deploy.version=1
 
