# NAGP_2025
Mandatory_assignment_k8

## Repository Url: https://github.com/kumar1773/NAGP_2025

## Docker hub: https://hub.docker.com/r/nagp1507/nagp-quotes-image

## Api Calls: 
1. Get call to http://quotes-service/quotes
2. To add a quote to DB curl --location 'http://quotes-service/quotes' \
--header 'Content-Type: application/json' \
--data '{
            "quote": "Welcome to NAGP",
            "author": "NAGP"
        }'
3. To get single quote with ID : http://quotes-service/quotes/{id} i.e 1, 2, 3

## Following are the important files in directory 
1. db_configmap : Contains DB URL,name, driver and Hibernate dialect
2. db_secrets: Contains User and password
3. db_pvc_clain: Persistent Volume claim(1Gi)
4. postgres_deployment.yaml: Postgress deployment yaml file
5. quotes: contains source doe for quotes application
6. quotes/docker.yaml: docker file 
7. quotes/k8s.yaml: deployment file for application
8. quotes/ingress.yaml Ingress file
9. To Access quotes service by name inside cluster: http://quotes-service/quotes
