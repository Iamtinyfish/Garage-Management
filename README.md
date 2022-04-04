# Garage-Management

#### Start Glassfish server:
    asadmin start-domain domain1
#### Stop Glassfish server:
    asadmin stop-domain domain1
#### Deploy:
    asadmin deploy --name tfgarage .\target\tfgarage-1.0-SNAPSHOT.war
#### Redeploy:
    asadmin redeploy --name tfgarage --keepstate=true .\target\tfgarage-1.0-SNAPSHOT.war